package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.CheckUpDetails;
import npcdcs.database.pojo.Diagnosis;

public class DiagnosisDAO extends AbstractDAO{
	 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List list() {
		
		ArrayList<Diagnosis> list = new ArrayList<Diagnosis>();
		String query = "select * from diagnosis";
		ResultSet rs = null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		while(rs.next())
		{
			Diagnosis dgn=new Diagnosis();
			dgn.setDigno_id(rs.getInt("digno_id"));
			dgn.setPat_id(rs.getInt("pat_id"));
			dgn.setDisease_id(rs.getInt("disease_id"));
			dgn.setDisease_value(rs.getDouble("disease_value"));
			dgn.setCenter_id(rs.getInt("center_id"));
			dgn.setCenter_type(rs.getString("center_type"));
			dgn.setDigno_date(rs.getDate("digno_date"));
			 list.add(dgn);
			 
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
	// see files it is	
		String query = "select * from diagnosis where digno_id = "+obj;
		ResultSet rs = null;
		Diagnosis dgn=null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		if(rs.next())
		{
			dgn=new Diagnosis();
			dgn.setDigno_id(rs.getInt("digno_id"));
			dgn.setPat_id(rs.getInt("pat_id"));
			dgn.setDisease_id(rs.getInt("disease_id"));
			dgn.setDisease_value(rs.getDouble("disease_value"));
			dgn.setCenter_id(rs.getInt("center_id"));
			dgn.setCenter_type(rs.getString("center_type"));
			dgn.setDigno_date(rs.getDate("digno_date"));
			 
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return dgn;
	}

	@Override
	public boolean save(Object obj) {
		int i=0;
		Diagnosis dig = (Diagnosis)obj;
		StringBuffer query = new StringBuffer("insert into diagnosis(pat_id,disease_id,disease_value,center_id,center_type,digno_date) values(");
		query.append(dig.getPat_id()+","+dig.getDisease_value()+","+dig.getCenter_id()+",'"+dig.getCenter_type()+"'"+dig.getDigno_date()+"'"+")");
		
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
		StringBuffer query = new StringBuffer("delete * from diagnosis where digno_id "+obj.toString());
			 
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
		StringBuffer query = new StringBuffer("update * from diagnosis where digno_id "+obj.toString());
		 
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
