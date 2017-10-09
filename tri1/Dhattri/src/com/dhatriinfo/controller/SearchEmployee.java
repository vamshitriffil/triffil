package com.dhatriinfo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhatriinfo.bean.EmployeeBean;
import com.dhatriinfo.dao.DaoOperations;

/**
 * Servlet implementation class SearchEmployee
 */
@WebServlet("/SearchEmployee")
public class SearchEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmployee() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("txt/html");
		DaoOperations dao=new DaoOperations();
		String searchEmployee=request.getParameter("searchemp");
	
		
		ArrayList<EmployeeBean> employeeList=dao.searchEmployee(searchEmployee);
		PrintWriter out=response.getWriter();
		Iterator<EmployeeBean> iterator=employeeList.iterator();
		EmployeeBean emploeeBean;
		out.print("<html><body>");
		out.print("<table> <tr> <td> EmployeeId </td>"
				+ "<td>EmployeeName </td>"
				+ "<td>EmployeeDOB </td>"
				+ "<td> Employee Designation </td>"
				+"<td> Employee Mobile No</td>"
				+"<td> Employee AltMobile No</td>"
				+"<td> Employee Email</td>"
				+"<td> Employee AltEmail</td>"
				+"<td> Employee Address</td>"
				+"<td> Employee Qualification</td>"
				+"<td> Employee Experience</td>"
				+ "<td> Employee Salary </td></tr>"
				
				
				);
		
		while(iterator.hasNext())
		{
			emploeeBean=(EmployeeBean)iterator.next();
			out.print("<tr><td>"+emploeeBean.getEmployeeId()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeName()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeDOB()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeDesignation()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeMblno()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeAltMblno()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeEmail()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeAltEmail()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeAddress()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeQualification()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeExperience()+"</td>");
			out.print("<td>"+emploeeBean.getEmployeeSalary()+"</td></tr>");
			
		
		}
		out.print("</table></body></html>");
		/*}
		else{
			String search=request.getParameter("searchemp");
			
			DaoOperations dao=new DaoOperations();
			ArrayList<EmployeeBean> employeeList=dao.searchRadio(search);
			PrintWriter out=response.getWriter();
			Iterator<EmployeeBean> iterator=employeeList.iterator();
			EmployeeBean emploeeBean;
			out.print("<html><body>");
			out.print("<table> <tr> <td> EmployeeId </td>"
					+ "<td>EmployeeName </td>"
					+ "<td>EmployeeDOB </td>"
					+ "<td> Employee Designation </td>"
					+"<td> Employee Mobile No</td>"
					+"<td> Employee AltMobile No</td>"
					+"<td> Employee Email</td>"
					+"<td> Employee AltEmail</td>"
					+"<td> Employee Address</td>"
					+"<td> Employee Qualification</td>"
					+"<td> Employee Experience</td>"
					+ "<td> Employee Salary </td></tr>"
					
					
					);
			
			while(iterator.hasNext())
			{
				emploeeBean=(EmployeeBean)iterator.next();
				out.print("<tr><td>"+emploeeBean.getEmployeeId()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeName()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeDOB()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeDesignation()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeMblno()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeAltMblno()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeEmail()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeAltEmail()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeAddress()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeQualification()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeExperience()+"</td>");
				out.print("<td>"+emploeeBean.getEmployeeSalary()+"</td></tr>");
				
			
			}
			out.print("</table></body></html>");
		}*/
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
