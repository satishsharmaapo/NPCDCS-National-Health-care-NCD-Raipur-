package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.Anm;
import npcdcs.database.pojo.Chc;
import npcdcs.database.pojo.ScreeningDetails;

@SuppressWarnings("rawtypes")
public class ChcDAO extends AbstractDAO{
	@SuppressWarnings("unchecked")
	@Override
	public List list() {
		ArrayList<Chc> list = new ArrayList<Chc>();
		String query = "select * from chc";
		ResultSet rs = null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		while(rs.next())
		{
			Chc chc=new Chc();
			chc.setChc_id(rs.getInt("chc_id"));
			chc.setDistrict_id(rs.getInt("district_id"));
			chc.setChc_name(rs.getString("chc_name"));
			list.add(chc);
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}
	

	public List list(Object id) {
		ArrayList<Chc> list = new ArrayList<Chc>();
		String query = "select * from chc where district_id="+id;
		ResultSet rs = null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		while(rs.next())
		{
			Chc chc=new Chc();
			chc.setChc_id(rs.getInt("chc_id"));
			chc.setDistrict_id(rs.getInt("district_id"));
			chc.setChc_name(rs.getString("chc_name"));
			list.add(chc);
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
		String query = "select * from chc where chc_id = "+obj;
		ResultSet rs = null;
		Chc chc=null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		if(rs.next())
		{
			 chc=new Chc();
			 chc.setChc_id(rs.getInt("chc_id"));
			 chc.setDistrict_id(rs.getInt("district_id"));
			 chc.setChc_name(rs.getString("chc_name"));
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return chc;
	}

	@Override
	public boolean save(Object obj) {
		int i=0;
		Chc chc = (Chc)obj;
		StringBuffer query = new StringBuffer("insert into chc(district_id,chc_name) values(");
		
		query.append(chc.getDistrict_id()+",'"+chc.getChc_name()+"'");
		query.append(")");	 
		
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
		StringBuffer query = new StringBuffer("delete * from chc where chc_id "+obj.toString());
				
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
		Chc chc=(Chc)obj;
		StringBuffer query = new StringBuffer("update state set chc_name='"+ chc.getChc_name()+"' where state_id="+chc.getChc_id());
			 
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
 