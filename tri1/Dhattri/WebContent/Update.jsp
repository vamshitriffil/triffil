<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.dhatriinfo.bean.EmployeeBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dhatriinfo.dao.DaoOperations"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateData" method="post">

<table>

		<tr>
			<th>id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>DateOfBirth</th>
			<th>Designation</th>
			<th>MobileNo</th>
			<th>AltMobileNo</th>
			<th>Email</th>
			<th>AltEmail</th>
			<th>Address</th>
			<th>Qualification</th>
			<th>Experience</th>
			<th>Package</th>

		</tr>


		<%
		
		/* EmployeeBean employeeBean=null;		
		String update=request.getParameter("id");
		String mbl=request.getParameter("mbl");
	
		DaoOperations dao=new DaoOperations();
		ArrayList<EmployeeBean>emplist=dao.updateData(update, mbl);

				if(emplist!=null) { 
					Iterator<EmployeeBean> iterator=emplist.iterator();
				
              while(iterator.hasNext()){
				employeeBean=(EmployeeBean)iterator.next();
				if(employeeBean!=null) { */
					EmployeeBean employeeBean=(EmployeeBean)session.getAttribute("employeeBean");
				if(employeeBean!=null)
				{
		%>


		<tr>
			<td><%=employeeBean.getEmployeeId()%></td>
			<td><%=employeeBean.getEmployeeName()%></td>
			<td><%=employeeBean.getEmployeeDOB()%></td>
			<td><%=employeeBean.getEmployeeDesignation()%></td>
			<td><%=employeeBean.getEmployeeMblno()%></td>
			<td><%=employeeBean.getEmployeeAltMblno()%></td>
			<td><%=employeeBean.getEmployeeEmail()%></td>
			<td><%=employeeBean.getEmployeeAltEmail()%></td>
			<td><%=employeeBean.getEmployeeAddress()%></td>
			<td><%=employeeBean.getEmployeeQualification()%></td>
			<td><%=employeeBean.getEmployeeExperience()%></td>
			<td><%=employeeBean.getEmployeeSalary()%></td>


		</tr>
		<tr>
		<td><h2>Tablewithvalues</h2></td>
		</tr>
	
		<tr>
					<td>Employee Id</td>
					<td><input type="text" name="employeeId"  value=<%=employeeBean.getEmployeeId()%> disabled></td>
								
				</tr>
		
		
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="employeeName" value=<%=employeeBean.getEmployeeName()%>></td>
					<td><label id="errorEmpName" style="color: red"></label></td>				
				</tr>
				
				<tr>
	                <td>Date Of Birth :</td>
	                <td><input type="date" name="employeeDOB" value=<%=employeeBean.getEmployeeDOB()%>></td>
	                <td><label id="errorDOB" style="color: red"></label></td>
            	</tr>
				
				<tr>
                <td>Employee Designation :</td>
           
                <td>
                <select name="employeeDesignation" value=<%=employeeBean.getEmployeeDesignation() %> >
                    <option></option>
                    <option value="java">Java Developer</option>
                    <option value="ui">UI Designing</option>
                    <option value="testing">Testing</option>
                </select>
                </td>
                <td><label id="errorDesignation" style="color: red"></label></td>
            </tr>
            
            <tr>
                <td>Mobile Number :</td>
                <td><input type="tel" name="employeeMblno" value=<%=employeeBean.getEmployeeMblno()%>></td>
                <td><label id="errorMobileNo" style="color: red"></label></td>
                
            </tr>
            
            <tr>
                <td>Alternate Mobile Number :</td>
                <td><input type="tel" name="employeeAltMblno" value=<%=employeeBean.getEmployeeAltMblno()%>></td>
                <td><label id="errorAltMobileNo" style="color: red"></label></td>
            </tr>
            
            <tr>
                <td>E-Mail :</td>
                <td><input type="email" name="employeeEmail" value=<%=employeeBean.getEmployeeEmail()%>></td>
                <td><label id="errorEmail" style="color: red"></label></td>
            </tr>
            
            <tr>
                <td>Alternate E-Mail :</td>
                <td><input type="email" name="employeeAltEmail" value=<%=employeeBean.getEmployeeAltEmail()%>/></td>
                <td><label id="errorAltEmail" style="color: red"></label></td>
            </tr>
            
            <tr>
                <td>Address :</td>
           
                <td><textarea rows="8" cols="50" name="employeeAddress" value=<%=employeeBean.getEmployeeAddress()%>></textarea></td>               
                <td><label id="errorAddress" style="color: red"></label></td>
            </tr>
            
            <tr>
                <td>Qualification :</td>
                <td>
                <select name="employeeQualification"value=<%=employeeBean.getEmployeeQualification()%>>
                    <option></option>
                    <option value="btech">B.TECH</option>
                    <option value="mtech">M.TECH</option>
                    <option value="mba">M.B.A</option>
                </select>
                </td>
                <td><label id="errorQualification" style="color: red"></label></td>
            </tr>
            
            <tr>
                <td>Experience :</td>
                <td>
                <select name="employeeExperience" value=<%=employeeBean.getEmployeeExperience()%>>
                    <option value="0">0</option>
                    <option value="1">+1</option>
                    <option value="2">+2</option>
                    <option value="3">+3</option>
                    <option value="4">+4</option>
                    <option value="5">+5</option>
                </select>
                </td>
                <td><label id="errorExperience" style="color: red"></label></td>                
            </tr>
            
            
            <tr>
				<td>Employee salary</td>
				<td><input type="text" name="employeeSalary" value=<%=employeeBean.getEmployeeSalary()%>></td>
				<td><label id="errorSalary" style="color:red"></label></td>  
				
			</tr>
	
			<tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="reset" value="Clear">
				</td>
			</tr>
			
     
	
		
		</table>
			 </form>
		
		
		
	
<%


 
				
 }	
					else{
						out.print("no data found");
				
					}
				%>
</body>
</html>