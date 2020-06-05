package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import npcdcs.database.DatabaseConnection;

import npcdcs.database.pojo.Phc;
import npcdcs.database.pojo.Referral;

public class ReferralDAO extends AbstractDAO {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List list()
	{
		ArrayList<Referral> list=new ArrayList<Referral>();
		String query="select * from referal";
		ResultSet rs=null;
		try
		{
			rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			while(rs.next())
			{
				Referral rf=new Referral();
				rf.setReference_id(rs.getInt("reference_id"));
				rf.setPat_id(rs.getInt("pat_id"));
				rf.setReference_from(rs.getString("reference_from"));
				rf.setReference_to(rs.getString("reference_to"));
				rf.setDate_to_refer(rs.getString("date_to_refers"));
				list.add(rf);
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
		String query="select * from referal where reference_id = "+obj;
		ResultSet rs=null;
		Referral rf=null;
		try
		{
			rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			if(rs.next())
			{
				rf=new Referral();
				rf.setReference_id(rs.getInt("reference_id"));
				rf.setPat_id(rs.getInt("pat_id"));
				rf.setReference_from(rs.getString("reference_from"));
				rf.setReference_to(rs.getString("reference_to"));
				rf.setDate_to_refer(rs.getString("date_to_refers"));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rf;
	}	 

	@Override
	public boolean save(Object obj) {
		int i=0;
		Referral ref = (Referral)obj;
		StringBuffer query = new StringBuffer("insert into referal(pat_id,reference_from,reference_to,date_to_refers) values(");
		query.append(ref.getPat_id()+",'"+ref.getReference_from()+"','"+ref.getReference_to()+"','"+ref.getDate_to_refer()+"'");
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


