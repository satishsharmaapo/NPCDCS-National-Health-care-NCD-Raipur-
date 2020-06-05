package npcdcs.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import npcdcs.database.DatabaseConnection;
 

/**
 * Servlet implementation class DataRetrieve
 */
@WebServlet("/DataRetrieve")
public class DataRetrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DataRetrieve() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Connection con=DatabaseConnection.getConnection();
		try
		{
		Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from district");
		 while (rs.next())
		 {
			 out.println("<br>"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+"<br>");
		 }
		}
		catch(SQLException sq)
		{
			System.out.println(sq);
		}
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 

}
