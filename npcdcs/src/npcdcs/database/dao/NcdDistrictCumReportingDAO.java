package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.NcdChcCumReporting;
import npcdcs.database.pojo.NcdDistrictCumReporting;

public class NcdDistrictCumReportingDAO extends AbstractDAO {

	@Override
	public List list() {
		ArrayList<NcdDistrictCumReporting> list=new ArrayList<NcdDistrictCumReporting>();
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
				   NcdDistrictCumReporting ndr=new NcdDistrictCumReporting();
				      ndr.setNoofdnewcancerfemale(rs.getInt(1));
				      ndr.setNoofdnewcancermale(rs.getInt(2));
				      ndr.setNoofdnewcardiovascularfemale(rs.getInt(3));
				      ndr.setNoofdnewcardiovascularmale(rs.getInt(4));
				      ndr.setNoofdnewdiabetesfemale(rs.getInt(5));
				      ndr.setNoofdnewdiabetesmale(rs.getInt(6));
				      ndr.setNoofdnewhypertensionfemale(rs.getInt(7));
				      ndr.setNoofdnewdiabetesmale(rs.getInt(8));
				      ndr.setNoofdnewhypertensionfemale(rs.getInt(9));
				      ndr.setNoofdpersonfemale(rs.getInt(10));
				      ndr.setNoofdpersonmale(rs.getInt(11)); 
				      ndr.setNoofrefcancerfemale(rs.getInt(12));
				      ndr.setNoofrefcancermale(rs.getInt(13));
				      ndr.setNoofrefcardiovascularfemale(rs.getInt(14));
				      ndr.setNoofrefcardiovascularmale(rs.getInt(15));
				      ndr.setNoofrefdiabetesfemale(rs.getInt(16));
				      ndr.setNoofrefdiabetesmale(rs.getInt(17));
				      ndr.setNoofrefhypertensionfemale(rs.getInt(18));
				      ndr.setNoofrefhypertensionmale(rs.getInt(19));
			    
			    // sd.setCardiovascular(rs.getBoolean("cardiovascular"));
			    //  sd.setCancer(rs.getBoolean("cancer"));
			     list.add(ndr);
			      		     
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
