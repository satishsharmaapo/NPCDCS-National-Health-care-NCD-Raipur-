package npcdcs.database.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.Util;



import npcdcs.database.DatabaseConnection;


import npcdcs.database.pojo.ScreeningDetails;

public class ScreeningDetailsDAO extends AbstractDAO{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List list()
	{
	   ArrayList<ScreeningDetails> list=new ArrayList<ScreeningDetails>();
	   String query="select * from screening_details";
	   ResultSet rs=null;
	   try{
		   rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
		   while(rs.next())
		   {
		     ScreeningDetails sd=new ScreeningDetails();
		     sd.setScreen_id(rs.getInt("screen_id"));
		     sd.setPat_id(rs.getInt("pat_id"));
		     sd.setDiabetes(rs.getFloat("diabetes"));
		     sd.setDiabetes_test_type(rs.getString("rdtype"));
		     sd.setHypertension_high(rs.getFloat("hypertension_high"));
		     sd.setHypertension_low(rs.getFloat("hypertension_low"));
		     sd.setDate1(rs.getDate("date1"));
		    // sd.setCardiovascular(rs.getBoolean("cardiovascular"));
		    //  sd.setCancer(rs.getBoolean("cancer"));
		     list.add(sd);
		     
		     
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
		String query="select * from screening_details where screen_id = "+obj;
		ResultSet rs=null;
		ScreeningDetails sd=null;
		try
		{
			rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			if(rs.next())
			{
				sd=new ScreeningDetails();
	     	     sd.setScreen_id(rs.getInt("screen_id"));
			     sd.setPat_id(rs.getInt("pat_id"));
			     sd.setDiabetes(rs.getFloat("diabetes"));
			     sd.setDiabetes_test_type(rs.getString("diabetes_test_type"));
			     sd.setHypertension_high(rs.getFloat("hypertension_high"));
			     sd.setHypertension_low(rs.getFloat("hypertension_low")); 
			     sd.setDate1(rs.getDate("date1"));
			    // sd.setCardiovascular(rs.getBoolean("cardiovascular"));
			   //  sd.setCancer(rs.getBoolean("cancer"));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return sd;
	}
	@Override
	public boolean save(Object obj) {
		// TODO Auto-generated method stub
		int i=0;
		ScreeningDetails sd = ( ScreeningDetails)obj;
		StringBuffer query = new StringBuffer("insert into screening_details(pat_id,diabetes_test_type,diabetes,hypertension_high,hypertension_low,cardiovascular,cancer,date1) values(");
		query.append(sd.getPat_id()+",'"+sd.getDiabetes_test_type()+"',"+sd.getDiabetes()+","+sd.getHypertension_high()+","+sd.getHypertension_low()+","+sd.isCardiovascular()+","+sd.isCancer()+",'"+Util.changeDateFormat(new Date())+"'");//+
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
		// TODO Auto-generated method stub
		int i=0;
		String sql="delete * from screening where screen_id "+obj.toString();
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
		StringBuffer query = new StringBuffer("update * from screening where screen_id "+obj.toString());
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
	 
	 
  


 
