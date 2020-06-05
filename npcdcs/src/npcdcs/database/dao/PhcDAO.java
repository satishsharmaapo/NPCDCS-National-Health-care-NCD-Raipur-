package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.PatientDetails;
import npcdcs.database.pojo.Phc;;

public class PhcDAO extends AbstractDAO{
	@SuppressWarnings({ "rawtypes", "unchecked"})
	@Override
	public List list() {
		
		ArrayList<Phc> list = new ArrayList<Phc>();
		String query = "select * from phc";
		ResultSet rs = null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		while(rs.next())
		{
			Phc phc=new Phc();
			phc.setPhc_id(rs.getInt("phc_id"));
			phc.setChc_id(rs.getInt("chc_id"));			
			phc.setPhc_name(rs.getString("phc_name"));
		    
			list.add(phc);
			 
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return list;
	}

public List list(Object obj) {
		
		ArrayList<Phc> list = new ArrayList<Phc>();
		String query = "select * from phc where chc_id="+obj;
		ResultSet rs = null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		while(rs.next())
		{
			Phc phc=new Phc();
			phc.setPhc_id(rs.getInt("phc_id"));
			phc.setChc_id(rs.getInt("chc_id"));			
			phc.setPhc_name(rs.getString("phc_name"));
		    
			list.add(phc);
			 
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
		String query = "select * from phc where phc_id = "+obj;
		ResultSet rs = null;
		Phc phc=null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		if(rs.next())
		{
			phc=new Phc();
			phc.setPhc_id(rs.getInt("phc_id"));
			phc.setChc_id(rs.getInt("chc_id"));			
			phc.setPhc_name(rs.getString("phc_name"));	    
			 
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return phc;
	}

	@Override
	public boolean save(Object obj) {
		int i=0;
		Phc phc = (Phc)obj;
		StringBuffer query = new StringBuffer("insert into phc(chc_id,phc_name) values(");
		query.append(phc.getChc_id()+",'"+phc.getPhc_name()+"'");
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
		StringBuffer query = new StringBuffer("delete * from phc where phc_id "+obj.toString());
		 
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
		StringBuffer query = new StringBuffer("update * from phc where phc_id "+obj.toString());
		
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
