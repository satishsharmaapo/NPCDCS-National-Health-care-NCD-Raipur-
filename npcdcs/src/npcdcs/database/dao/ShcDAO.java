package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
 

import npcdcs.database.pojo.Shc;

public class ShcDAO extends AbstractDAO{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List list()
	{
		ArrayList<Shc> list=new ArrayList<Shc>();
		String query="select * from shc";
		ResultSet rs=null;
		try{
			rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			while(rs.next())
			{
				Shc shc=new Shc();
				shc.setSub_id(rs.getInt("sub_id"));
				shc.setChc_id(rs.getInt("chc_id"));
				shc.setPhc_id(rs.getInt("phc_id"));	
				shc.setSub_name(rs.getString("sub_name"));
				list.add(shc);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

		return list;
	}
	
	public List list(Object obj)
	{
		ArrayList<Shc> list=new ArrayList<Shc>();
		String query="select * from shc where phc_id= "+obj;
		ResultSet rs=null;
		try{
			rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			while(rs.next())
			{
				Shc shc=new Shc();
				shc.setSub_id(rs.getInt("sub_id"));
				shc.setChc_id(rs.getInt("chc_id"));
				shc.setPhc_id(rs.getInt("phc_id"));	
				shc.setSub_name(rs.getString("sub_name"));
				list.add(shc);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

		return list;
	}
	public List listbyCHC(Object obj)
	{
		ArrayList<Shc> list=new ArrayList<Shc>();
		String query="select * from shc where chc_id= "+obj;
		ResultSet rs=null;
		try{
			rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			while(rs.next())
			{
				Shc shc=new Shc();
				shc.setSub_id(rs.getInt("sub_id"));
				shc.setChc_id(rs.getInt("chc_id"));
				shc.setPhc_id(rs.getInt("phc_id"));	
				shc.setSub_name(rs.getString("sub_name"));
				list.add(shc);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

		return list;
	}

	public Object load(Object obj)
	{
		String query="select * from shc where sub_id = "+obj;
		ResultSet rs=null;
		Shc shc=null;
		try
		{
			rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			if(rs.next())
			{
				shc=new Shc();
				shc.setSub_id(rs.getInt("sub_id"));
				shc.setChc_id(rs.getInt("chc_id"));
				shc.setPhc_id(rs.getInt("phc_id"));	
				shc.setSub_name(rs.getString("sub_name"));
			      
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return shc;
	}
	
	@Override
	public boolean save(Object obj) {
		int i=0;
		Shc shc = (Shc)obj;
		StringBuffer query = new StringBuffer("insert into shc(chc_id,phc_id,sub_name) values(");
		query.append(shc.getChc_id()+","+shc.getPhc_id()+",'"+shc.getSub_name()+"'");
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
		Shc shc=(Shc)obj;
		StringBuffer query = new StringBuffer("update state set chc_name='"+ shc.getSub_name()+"' where chc_id="+shc.getSub_id());
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
