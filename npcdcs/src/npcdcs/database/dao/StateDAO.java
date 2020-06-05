package npcdcs.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import npcdcs.database.DatabaseConnection;
 

import npcdcs.database.pojo.State;

public class StateDAO extends AbstractDAO{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List list()
	{
		ArrayList<State> list=new ArrayList<State>();
		String query="select * from state";
		ResultSet rs=null;
		try{
			rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			while(rs.next())
			{
				State state=new State();
				state.setState_id(rs.getInt("state_id"));
				state.setState_name(rs.getString("state_name"));				 
				list.add(state);
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
		String query="select * from state where state_id = "+obj;
		ResultSet rs=null;
		State state=null;
		try
		{
			rs=DatabaseConnection.getConnection().createStatement().executeQuery(query);
			if(rs.next())
			{
				state=new State();
				state.setState_id(rs.getInt("state_id"));
				state.setState_name(rs.getString("state_name"));

			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return state;
	}
	 
	@Override
	public boolean save(Object obj) {
		int i=0;
		State state = (State)obj;
		StringBuffer query = new StringBuffer("insert into state(state_name) values(");
		query.append("'"+state.getState_name()+"'");
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
		StringBuffer query = new StringBuffer("delete from state where state_id="+obj.toString());
		 
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
		State st = (State)obj;
		StringBuffer query = new StringBuffer("update state set state_name='"+ st.getState_name()+"' where state_id="+st.getState_id());
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
