package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.Anm;
import npcdcs.database.pojo.CheckUpDetails;
import npcdcs.database.pojo.ScreeningDetails;
 
 
 
public class CheckUpDetailsDAO extends AbstractDAO{

	@SuppressWarnings({ "rawtypes" })
	@Override
	public List list() {
		
		ArrayList<CheckUpDetails> list = new ArrayList<CheckUpDetails>();
		String query = "select * from checkup_details";
		ResultSet rs = null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		while(rs.next())
		{
			CheckUpDetails cud=new CheckUpDetails();
			cud.setAnm_id(rs.getInt("anm_id"));
			cud.setCheckup_id(rs.getInt("checkup_id"));
			cud.setDateof_checkup(rs.getDate("dateof_checkup"));
			cud.setPat_id(rs.getInt("pat_id"));
			list.add(cud);
			 
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
		String query = "select * from checkup_details where checkup_id = "+obj;
		ResultSet rs = null;
		CheckUpDetails cud=null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		if(rs.next())
		{
			cud=new CheckUpDetails();
			cud.setAnm_id(rs.getInt("anm_id"));
			cud.setCheckup_id(rs.getInt("checkup_id"));
			cud.setDateof_checkup(rs.getDate("dateof_checkup"));
			cud.setPat_id(rs.getInt("pat_id"));
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return cud;
	}

	@Override
	public boolean save(Object obj) {
		int i=0;
		CheckUpDetails cud = (CheckUpDetails)obj;
		StringBuffer query = new StringBuffer("insert into checkup_details values(");
		
		query.append(cud.getAnm_id()+","+cud.getPat_id()+",'"+cud.getDateof_checkup()+"'"+")");
		
		try
		{
			i= DatabaseConnection.getConnection().createStatement().executeUpdate(query.toString());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}		 
		return i>0;
	}

	@Override
	public boolean delete(Object obj) {
		 
		int i=0;
		StringBuffer query = new StringBuffer("delete * from checkup_details where checkup_id "+obj.toString());
		 	 
		try
		{
			i=DatabaseConnection.getConnection().createStatement().executeUpdate(query.toString());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		return i>0;
	}

	@Override
	public boolean update(Object obj) {
		 
				 
				int i=0;
				StringBuffer query = new StringBuffer("update * from checkup_details where checkup_id "+obj.toString());
				 
			 
				try
				{
					i=DatabaseConnection.getConnection().createStatement().executeUpdate(query.toString());
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				
				return i>0;
				}

}
