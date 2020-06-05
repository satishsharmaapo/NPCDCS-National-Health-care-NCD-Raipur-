package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.Util;

import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.DiagnosisNew;
 

public class DiagnosisNewDAO extends AbstractDAO{

	@Override
	public List list() {
		   ArrayList<DiagnosisNew> list=new ArrayList<DiagnosisNew>();
		   String query="select * from diagnosisnew";
		   ResultSet rs=null;
		   try{
			   rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			   while(rs.next())
			   {
			     DiagnosisNew sd=new DiagnosisNew();
			     sd.setCancer(rs.getBoolean("cancer"));
			     sd.setCardiovascular(rs.getBoolean("cardiovascular"));
			     sd.setDiabetes(rs.getBoolean("diabetes"));
			     sd.setDiagnosis_id(rs.getInt("diagnosis_id"));
			     sd.setHypertension(rs.getBoolean("hypertension"));
			     sd.setNoofhomevisit(rs.getBoolean("diagnosis_id"));
			     sd.setPat_id(rs.getInt("pat_id")); 
			     list.add(sd);
		 
			     
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Object obj) {
		// TODO Auto-generated method stub
				int i=0;
				DiagnosisNew sd = (DiagnosisNew)obj;
				StringBuffer query = new StringBuffer("insert into diagnosisnew(pat_id,diabetic,hypertension,cardiovascular,cancer,homevisit,digno_date) values(");
				query.append(sd.getPat_id()+","
				+sd.isDiabetes()+","
						+sd.isHypertension()+","
				+sd.isCardiovascular()+","
						+sd.isCancer()+","+
				sd.isNoofhomevisit()+",'"
						+Util.changeDateFormat(new Date())+"'");//+
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
		String sql="delete * from diagnosisnew where diagnosis_id="+obj.toString();
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
	

 
