package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
 
import npcdcs.database.pojo.ScreeningReport;

public class ScreeningReportDAO extends AbstractDAO {
 
	@SuppressWarnings("unchecked")
	@Override
	public List list()
	{
		   ArrayList<ScreeningReport> list=new ArrayList<ScreeningReport>();
		   String query="SELECT date1,COUNT(pat_id),COUNT(diabetes),COUNT(hypertension_high) FROM screening_details WHERE diabetes>140 AND hypertension_high>140 GROUP BY date1";
		   ResultSet rs=null;
		   try{
			   rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			   while(rs.next())
			   {
			     ScreeningReport sr=new ScreeningReport();
			     sr.setDate1(rs.getDate("date1"));
			     sr.setNoofperson(rs.getInt("COUNT(pat_id)"));
			     sr.setSuspectedfordiabetes(rs.getInt("COUNT(diabetes)"));
			     sr.setSuspectedforhypertension(rs.getInt("COUNT(hypertension_high)"));
			    
			    // sd.setCardiovascular(rs.getBoolean("cardiovascular"));
			    //  sd.setCancer(rs.getBoolean("cancer"));
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
