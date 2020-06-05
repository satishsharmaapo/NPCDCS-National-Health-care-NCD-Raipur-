package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; 

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.Anm;
import npcdcs.database.pojo.ScreeningDetails;


@SuppressWarnings("rawtypes")
public class AnmDAO extends AbstractDAO
{

	@SuppressWarnings("unchecked")
	@Override
	public List list() {
		ArrayList<Anm> list = new ArrayList<Anm>();
		String query = "select * from anm";
		ResultSet rs = null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		while(rs.next())
		{
			Anm anm=new Anm();
			anm.setAnm_id(rs.getInt("anm_id"));
			anm.setAnm_mob(rs.getString("anm_mob"));
			anm.setAnm_name(rs.getString("anm_name"));
			anm.setSub_id(rs.getInt("sub_id"));
			anm.setGender(rs.getString("gender"));
			list.add(anm);		
	
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
		String query = "select * from anm where anm_id = "+obj;
		ResultSet rs = null;
		Anm anm=null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		if(rs.next())
		{
			 anm=new Anm();
			 anm.setAnm_id(rs.getInt("anm_id"));
			 anm.setAnm_mob(rs.getString("anm_mob"));
			 anm.setSub_id(rs.getInt("sub_id"));
			 anm.setAnm_name(rs.getString("anm_name"));	
			 anm.setGender(rs.getString("gender"));			 
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return anm;
	}

	@Override
	public boolean save(Object obj) {
		int i=0;
		Anm anm = (Anm)obj;
		StringBuffer query = new StringBuffer("insert into anm(anm_name,anm_mob,gender,sub_id) values(");
 
		query.append("'"+anm.getAnm_name()+"','"+anm.getAnm_mob()+"','"+anm.getGender()+"',"+anm.getSub_id()+")");
	 
		 		
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
		// TODO Auto-generated method stub
		
		int i=0;
		String sql="delete * from anm where anm_id "+obj.toString();
		System.out.println(sql);
		 
		ResultSet rs=null;
		 
		try
		{
			i=DatabaseConnection.getConnection().createStatement().executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		return i>0;
	}	

	@Override
	public boolean update(Object obj) {
		// TODO Auto-generated method stub
		
		int i=0;
		StringBuffer query = new StringBuffer("update * from anm where anm_id "+obj.toString());
		ResultSet rs=null;
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
