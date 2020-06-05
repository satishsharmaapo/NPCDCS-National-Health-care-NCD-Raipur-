package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.District;
import npcdcs.database.pojo.Login;

public class LoginDAO  extends AbstractDAO{
	 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List list() {
		
		ArrayList<District> list = new ArrayList<District>();
		String query = "select * from login";
		ResultSet rs = null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		while(rs.next())
		{
			Login lg=new Login();
			lg.setLoginid(rs.getInt("loginid")); 
			lg.setLevel(rs.getInt("level")); 
			lg.setUserid(rs.getString("userid"));
			lg.setPassword(rs.getString("password")); 
					    
			//list.add(dst);			 
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
		String query = "select * from login where loginid = "+obj;
		ResultSet rs = null;
		Login lg=null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		if(rs.next())
		{
			lg=new Login();
			lg.setLoginid(rs.getInt("loginid")); 
			lg.setLevel(rs.getInt("level"));
			lg.setUserid(rs.getString("userid"));
			lg.setPassword(rs.getString("password"));
		 }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return lg;
	}

	@Override
	public boolean save(Object obj) {
		int i=0;
		Login lg = (Login)obj;
		StringBuffer query = new StringBuffer("insert into login(level,userid,password) values(");
		query.append(lg.getLevel()+",'"+lg.getUserid()+"','"+lg.getPassword()+"'"+")");
				
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
	public boolean update(Object obj) {
		 
		int i=0;
		StringBuffer query = new StringBuffer("update * from Login where Login_id "+obj.toString());
		//ResultSet rs=null;
	 
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
	public boolean delete(Object obj) {
		 
		int i=0;
		StringBuffer query = new StringBuffer("delete * from Login where Login_id "+obj.toString());
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
	
	public boolean exist(Object obj) {
		 
		Login log=(Login)obj;
		int i=0;
		StringBuffer query = new StringBuffer("select * from login where level = "+log.getLevel() +" and password = '"+log.getPassword()+"'");
		try
		{
			ResultSet rs=DatabaseConnection.getConnection().createStatement().executeQuery(query.toString());
		    return rs.next();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}		
		return false;
	}


}
