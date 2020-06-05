package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.NcdAtDistrictReporting;
import npcdcs.database.pojo.NcdChcCumReporting;

public class NcdChcCumReportingDAO extends AbstractDAO{

	@Override
	public List list() {
		 ArrayList<NcdChcCumReporting> list=new ArrayList<NcdChcCumReporting>();
		   String query="SELECT sex,DATE_FORMAT(digno_date,'%m'),COUNT(sex),COUNT(pd.pat_id),COUNT(dg.diabetic),COUNT(dg.hypertension)," 
	             +"COUNT(dg.cardiovascular),COUNT(dg.cancer),"
	             +"COUNT(rf.pat_id),COUNT(dg.homevisit)"
	             +" FROM patient_details pd,diagnosisnew dg,referal rf" 
	             +" WHERE pd.pat_id=dg.pat_id AND pd.pat_id=rf.pat_id GROUP BY sex ,DATE_FORMAT(digno_date,'%m')";
		   ResultSet rs=null;
		   
		   try{
			   rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			   while(rs.next())
			   {
				   NcdChcCumReporting ndr=new NcdChcCumReporting();
				     ndr.setSex(rs.getString(1));
				     ndr.setMonth(rs.getInt(2));
				     ndr.setNoofsex(rs.getInt(3));
				     ndr.setNoofdiabetic(rs.getInt(5));
				     ndr.setNoofhypertension(rs.getInt(6));
				     ndr.setNoofcancer(rs.getInt(8));
				     ndr.setNoofcardiovascular(rs.getInt(7));				     
				     ndr.setNoofhomevisit(rs.getInt(10));				     
				     ndr.setNoofperson(rs.getInt(4));
				     ndr.setNoofrefpatient(rs.getInt(9));
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
