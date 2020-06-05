package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
 
import npcdcs.database.pojo.DistrictReporting;

public class DistrictReportingDAO extends AbstractDAO {
	@Override
	public List list() {
		 ArrayList<DistrictReporting> list=new ArrayList<DistrictReporting>();
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
			     DistrictReporting dr=new DistrictReporting();
			     dr.setChccenter(rs.getString(1));
			     dr.setNoofdiabetes(rs.getInt(2));
			     dr.setNoofhypertension(rs.getInt(3));
			     dr.setNoofpeopleBSBP(rs.getInt(4));
			     dr.setNoofrefersubtochc(rs.getInt(5));
			     dr.setNoofscreening(rs.getInt(6));
			     dr.setNoofhomevisit(rs.getInt(7));
			    // sd.setCardiovascular(rs.getBoolean("cardiovascular"));
			    //  sd.setCancer(rs.getBoolean("cancer"));
			     list.add(dr);
			      		     
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
