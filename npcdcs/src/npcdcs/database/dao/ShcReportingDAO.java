package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
 
import npcdcs.database.pojo.ShcReporting;

public class ShcReportingDAO extends AbstractDAO{
	
	@Override
	public List list() {
		 ArrayList<ShcReporting> list=new ArrayList<ShcReporting>();
		   String query="SELECT DATE_FORMAT(sd.date1,'%m'),village,COUNT(DISTINCT(camp_regno)),"
				   +"COUNT(pd.pat_id),"
				   +"COUNT(sd.diabetes>140),COUNT(sd.hypertension_high>140),COUNT(rf.pat_id)"
				   +"FROM patient_details  pd JOIN screening_details  sd ON (pd.pat_id = sd.pat_id) LEFT JOIN referal rf "
				   +"ON (sd.pat_id =rf.pat_id)  where sd.hypertension_high>140 or sd.diabetes>140 GROUP BY pd.village,DATE_FORMAT(sd.date1,'%m')" ;
		   ResultSet rs=null;
		   try{
			   rs=DatabaseConnection.getConnection().createStatement().executeQuery(query.toString());
			   while(rs.next())
			   {
			     ShcReporting sr=new ShcReporting();
			     sr.setNoofdiabetes(rs.getInt(5));
			     sr.setNoofhypertension(rs.getInt(6));
			     sr.setNoofpersonBSBP(rs.getInt(4));
			     sr.setNoofpersonsrefchc(rs.getInt(7));
			     sr.setVillage(rs.getString("village"));
			     sr.setNoofscreening(rs.getInt(3));
			     list.add(sr);			      		     
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
