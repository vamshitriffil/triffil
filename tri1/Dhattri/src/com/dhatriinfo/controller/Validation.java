package com.dhatriinfo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;






import com.dhatriinfo.bean.EmployeeBean;
import com.dhatriinfo.dao.DaoOperations;


@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Validation() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String eid=request.getParameter("id");
		String embl=request.getParameter("mbl");
		long employeeMobileNo;
		try
		{
		
		employeeMobileNo=Long.parseLong(embl);
		
		}
		catch(NumberFormatException nfe)
		{
			employeeMobileNo=0;
		}
		catch (Exception e) {
	
		employeeMobileNo=0;	

		
	}
	
		
		PrintWriter out=response.getWriter();
		

	DaoOperations dao=new DaoOperations();
	
	
	
	
	try {
	
		EmployeeBean employeeBean = dao.authenicateEmp(eid);
		if(employeeBean!=null)
		{
			if(employeeBean.getEmployeeId().equals(eid))
			{
				if(employeeBean.getEmployeeMblno()==(employeeMobileNo))
				{
					out.println("welcome  " + eid);
					HttpSession session = request.getSession();
					session.setAttribute("employeeBean", employeeBean);

					RequestDispatcher rs = request.getRequestDispatcher("Update.jsp");
			        rs.forward(request,response);
			       
					
				}
				else
				{
					 RequestDispatcher rs = request.getRequestDispatcher("Login.html");
			           
			           rs.include(request,response);
					out.println("Invalid password");
				}
				
			
			
		}
		else
		{
			 RequestDispatcher rs = request.getRequestDispatcher("Login.html");
	           
	           rs.include(request,response);
			out.println("Invalid Id and password");
		}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	}
	