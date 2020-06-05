package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.Anm;
import npcdcs.database.pojo.ColumnName;

@SuppressWarnings("rawtypes")
public abstract class AbstractDAO {
	
private Object obj;
public abstract List list();
public abstract Object load(Object obj);
public abstract boolean save(Object obj);
public abstract boolean delete(Object obj);
//public abstract boolean delete(int i);
public abstract boolean update(Object obj);
public int getMax(Object obj){
	
	ColumnName cn=(ColumnName)obj;
	ResultSet rs=null;
	String max=null;
	String query = "select max("+cn.getPrimarykey()+") from "+cn.getTablename();
	try
	{
	rs= DatabaseConnection.getConnection().createStatement().executeQuery(query);
	if(rs.next())
	{
		max = rs.getString(1);
		
	}
	if(max == null)
	{
		max=cn.getPrefix()+"00000000";
	}
	max = max.replace(cn.getPrefix(), "");
	
	}
	catch(SQLException e)
	{
		System.out.println(e);
	}
	return Integer.parseInt(max);
   }

}
