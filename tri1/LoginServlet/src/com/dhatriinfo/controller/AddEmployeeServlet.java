package com.dhatriinfo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhatriinfo.bean.EmployeeBean;
import com.dhatriinfo.dao.DaoOperations;
import com.dhatriinfo.logics.GenerateId;



@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddEmployeeServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employeeName=request.getParameter("employeeName");
		String employeeDOB=request.getParameter("employeeDOB");
		String employeeDesignation=request.getParameter("employeeDesignation");
		String employeeEmail=request.getParameter("employeeEmail");
		String employeeAltEmail=request.getParameter("employeeAltEmail");
		String employeeAddress=request.getParameter("employeeAddress");
		String employeeQualification=request.getParameter("employeeQualification");
		String employeeExperience=request.getParameter("employeeExperience");
		
		String salary=request.getParameter("employeeSalary");
		String mobileNo=request.getParameter("employeeMblno");
		String altMobileNo=request.getParameter("employeeAltMblno");
		double employeeSalary;
		long employeeMobileNo;
		long employeeAltMobileNo;
		try
		{
		employeeSalary=Double.parseDouble(salary);
		employeeMobileNo=Long.parseLong(mobileNo);
		employeeAltMobileNo=Long.parseLong(altMobileNo);
		}
		catch(NumberFormatException nfe)
		{
		employeeSalary=0.0;
		employeeMobileNo=0;
		employeeAltMobileNo=0;
		}
		catch (Exception e) {
		employeeSalary=0.0;
		employeeMobileNo=0;	
		employeeAltMobileNo=0;
		
	}
	String employeeId=GenerateId.generateNumber();
	
	// we are storing all local values in one bean object
	
	EmployeeBean employeeBean=new EmployeeBean();

	employeeBean.setEmployeeId(employeeId);
	employeeBean.setEmployeeName(employeeName);
	employeeBean.setEmployeeDOB(employeeDOB);
	employeeBean.setEmployeeDesignation(employeeDesignation);
	employeeBean.setEmployeeSalary(employeeSalary);
	employeeBean.setEmployeeMblno(employeeMobileNo);
	employeeBean.setEmployeeAltMblno(employeeAltMobileNo);
	employeeBean.setEmployeeEmail(employeeEmail);
	employeeBean.setEmployeeAltEmail(employeeAltEmail);
	employeeBean.setEmployeeAddress(employeeAddress);
	employeeBean.setEmployeeQualification(employeeQualification);
	employeeBean.setEmployeeExperience(employeeExperience);
	
	
	// creating dao object and passing bean obj to store in table
	
	DaoOperations daoOperations =new DaoOperations();
	int result=daoOperations.insertData(employeeBean);
	System.out.println(result);
	HttpSession session=request.getSession();
	String resultMessage = "";

	
		getServletContext().getRequestDispatcher("/Home.jsp").forward(
				request, response);
	}
	
	
	/*RequestDispatcher dispact=request.getRequestDispatcher("Home.jsp");
	
	if(result>0)
	{
		session.setAttribute("employeeId", employeeId);
		dispact.forward(request, response);
	}
	
	*/
	
	}


