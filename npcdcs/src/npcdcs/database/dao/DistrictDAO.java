package npcdcs.database.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.Chc;
import npcdcs.database.pojo.District;

public class DistrictDAO extends AbstractDAO{
	 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List list() {
		
		ArrayList<District> list = new ArrayList<District>();
		String query = "select * from district";
		ResultSet rs = null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		while(rs.next())
		{
			District dst=new District();
			dst.setDistrict_id(rs.getInt("district_id")); 
			dst.setState_id(rs.getInt("state_id")); 
			dst.setDistrict_name(rs.getString("district_name")); 
		    list.add(dst);			 
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return list;
	}

	public List list(Object id) {
		ArrayList<District> list = new ArrayList<District>();
		String query = "select * from district where state_id="+id;
		ResultSet rs = null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		while(rs.next())
		{
			District district=new District();
			district.setState_id(rs.getInt("state_id"));
			district.setDistrict_id(rs.getInt("district_id"));
			district.setDistrict_name(rs.getString("district_name"));
			
			list.add(district);
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
		String query = "select * from district where district_id = "+obj;
		ResultSet rs = null;
		District dst=null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		if(rs.next())
		{
			dst=new District();
			dst.setDistrict_id(rs.getInt("district_id")); 
			dst.setState_id(rs.getInt("state_id")); 
			dst.setDistrict_name(rs.getString("district_name")); 
		 }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return dst;
	}

	@Override
	public boolean save(Object obj) {
		int i=0;
		District dis = (District)obj;
		StringBuffer query = new StringBuffer("insert into district(state_id,district_name) values(");
		query.append(dis.getState_id()+",'"+dis.getDistrict_name()+"'"+")");
				
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
		District dis=(District)obj;
		StringBuffer query = new StringBuffer("update state set district_name='"+ dis.getDistrict_name()+"' where state_id="+dis.getDistrict_id());
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
		StringBuffer query = new StringBuffer("delete * from district where district_id "+obj.toString());
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
	
//	public boolean update1(Object olddata,Object newdata ) {
//		int i=0;
//		StringBuffer query = new StringBuffer("update district set district_name='"+newdata.+"' where district_id="+olddata.toString());
//		try
//		{
//			i=DatabaseConnection.getConnection().createStatement().executeUpdate(query.toString());
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//			return i>0;
//	} 

}
