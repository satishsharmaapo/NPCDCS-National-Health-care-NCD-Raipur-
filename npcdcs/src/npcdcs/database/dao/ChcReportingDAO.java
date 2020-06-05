package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.ChcReporting;
import npcdcs.database.pojo.ScreeningReport;

public class ChcReportingDAO extends AbstractDAO{

	@Override
	public List list() {
		 ArrayList<ChcReporting> list=new ArrayList<ChcReporting>();
		   String query="SELECT DISTINCT(pd.sub_id),shc.sub_name,DATE_FORMAT(sd.date1,'%m'),COUNT(DISTINCT(camp_regno)),"
				   +"COUNT(sd.diabetes) + COUNT(sd.hypertension_high),"
				   +"COUNT(sd.diabetes>140),COUNT(sd.hypertension_high>140),COUNT(rf.pat_id) "
				   +"FROM patient_details pd JOIN shc shc ON (pd.sub_id= shc.sub_id) JOIN screening_details  sd ON (pd.pat_id = sd.pat_id) LEFT JOIN referal rf " 
				   +"ON (sd.pat_id =rf.pat_id ) WHERE rf.reference_to=shc.chc_id  GROUP BY shc.sub_name,DATE_FORMAT(sd.date1,'%m')";
   		   ResultSet rs=null;
   		   
		   try{
			   rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			   while(rs.next())
			   {
			     ChcReporting cr=new ChcReporting();
			     cr.setSubcenter(rs.getString(2));		     
			     cr.setNoofpeopleBSBP(rs.getInt(5));
			     cr.setNoofscreening(rs.getInt(4));
			     cr.setNoofdiabetes(rs.getInt(6));
			     cr.setNoofhypertension(rs.getInt(7));
			     cr.setNoofrefertochc(rs.getInt(8));
			    
			    // sd.setCardiovascular(rs.getBoolean("cardiovascular"));
			    //  sd.setCancer(rs.getBoolean("cancer"));
			     list.add(cr);
			      		     
			   }
		   }
		   catch(SQLException e)
			{
			   e.printStackTrace();
			}

			return list;
	}

	@Override
	public Object load(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
