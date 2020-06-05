package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import npcdcs.database.DatabaseConnection;
import npcdcs.database.pojo.Diagnosis;
import npcdcs.database.pojo.PatientDetails;


public class PatientDetailsDAO extends AbstractDAO{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List list()
	{
		ArrayList list=new ArrayList<PatientDetails>();
		String query="select * from patient_details";
		ResultSet rs=null;
		try
		{
			rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			while(rs.next())
			{
				PatientDetails pd=new PatientDetails();
				pd.setPat_id(rs.getInt("pat_id"));
				pd.setSub_id(rs.getInt("sub_id"));
				pd.setPat_name(rs.getString("pat_name"));
				pd.setFather_name(rs.getString("father_name"));
				pd.setAge(rs.getInt("age"));
				pd.setSex(rs.getString("sex"));
				pd.setVillage(rs.getString("village"));
				pd.setCampregnoname(rs.getString("camp_regno"));
				pd.setPat_address(rs.getString("pat_address"));
				pd.setContact(rs.getString("contact"));
				pd.setId_type(rs.getString("id_type"));
				pd.setId_no(rs.getString("id_no"));
				pd.setSmoking(rs.getBoolean("smoking"));
				pd.setChewable(rs.getBoolean("chewable"));
				list.add(pd);
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
		String query = "select * from patient_details where pat_id = "+obj;
		ResultSet rs = null;
		PatientDetails pd=null;
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		if(rs.next())
		{
			pd=new PatientDetails();
			pd.setPat_id(rs.getInt("pat_id"));
			pd.setSub_id(rs.getInt("sub_id"));
			pd.setPat_name(rs.getString("pat_name"));
			pd.setFather_name(rs.getString("father_name"));
			pd.setAge(rs.getInt("age"));
			pd.setSex(rs.getString("sex"));
			pd.setVillage(rs.getString("village"));
			pd.setCampregnoname(rs.getString("camp_regno"));
			pd.setPat_address(rs.getString("pat_address"));			
			pd.setContact(rs.getString("contact"));
			pd.setId_type(rs.getString("id_type"));
			pd.setId_no(rs.getString("id_no"));
			pd.setSmoking(rs.getBoolean("smoking"));
			pd.setChewable(rs.getBoolean("chewable"));	 
			 
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return pd;
	}
	@Override
	public boolean save(Object obj) {
		int i=0;
		PatientDetails pd = (PatientDetails)obj;
		StringBuffer query = new StringBuffer("insert into patient_details(sub_id,pat_name,father_name,age,sex,village,camp_regno,pat_address,contact,id_type,id_no,smoking,chewable) values(");
		query.append(pd.getSub_id());
		
		if (pd.getPat_name()!=null)
		query.append(",'"+pd.getPat_name()+"',");
		else
			query.append(","+pd.getPat_name()+",");
		
		if (pd.getFather_name()!=null)
			query.append("'"+pd.getFather_name()+"',");
		else
			query.append(","+pd.getFather_name()+",");
		
		query.append(pd.getAge()+",");
		query.append("'"+pd.getSex()+"',");
		query.append("'"+pd.getVillage()+"',");
		query.append("'"+pd.getCampregnoname()+"',");
		query.append("'"+pd.getPat_address()+"',");
		query.append("'"+pd.getContact()+"',");
		query.append("'"+pd.getId_type()+"',");
		query.append("'"+pd.getId_no()+"',");
		query.append(pd.isChewable()+",");
		query.append(pd.isSmoking()+")");
		 
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
	public int getPatientID(Object obj)
	{
		PatientDetails pd=(PatientDetails)obj;
		String query = "SELECT pat_id FROM patient_details WHERE sub_id='"+pd.getSub_id()+"' AND id_type='"+pd.getId_type()+"' AND id_no='"+pd.getId_no()+"'";
		System.out.println(query);
		ResultSet rs = null;
		int i=0; 
		 
		try
		{
		rs = DatabaseConnection.getConnection().createStatement().executeQuery(query);
		 
		 rs.next();
		i=rs.getInt("pat_id");
		  
		 
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}
	
	}


