package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Views")
public class Views extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Views() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        
		
        try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/ui","root","root");  
			PreparedStatement ps=con.prepareStatement("select * from Reg where email=?");  
			ps.setString(1, email);
	       
	        out.print("<table width=100% border=1>");  
			out.print("<caption>View Record:</caption>");  
			
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();  
			int total=rsmd.getColumnCount();  
			out.print("<tr>");  
			for(int i=1;i<=total;i++)  
			{  
			out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
			}  
			  
			out.print("</tr>");  
			              
			/* Printing result */  
			  
			while(rs.next())  
			{  
				
				out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+
						"</td><td>"+rs.getString(3)+"</td></tr>");  
			                  
			}  
			  
			out.print("</table>");  
			              
			}catch (Exception e2) {e2.printStackTrace();}  
			          
			finally{out.close();}  
			 
			 
	}

}
