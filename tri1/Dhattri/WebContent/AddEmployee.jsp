<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddEmployee | DhatriInfo</title>
</head>
<body>
	<div align="center">
	<jsp:include page="Module.html"></jsp:include>
	</div>
	
	
		<div align="center" >
		<form action="AddEmployeeServlet" method="post">
		<table>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="employeeName"></td>
					<td><label id="errorEmpName" style="color: red"></label></td>				
				</tr>
				
				<tr>
	                <td>Date Of Birth :</td>
	                <td><input type="date" name="employeeDOB"/></td>
	                <td><label id="errorDOB" style="color: red"></label></td>
            	</tr>
				
				<tr>
                <td>Employee Designation :</td>
                <!-- <td><input type="text" name="employeeDesignation" onkeypress="clearFields()"/></td> -->
                <td>
                <select name="employeeDesignation">
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
                <td><input type="tel" name="employeeMblno"/></td>
                <td><label id="errorMobileNo" style="color: red"></label></td>
                
            </tr>
            
            <tr>
                <td>Alternate Mobile Number :</td>
                <td><input type="tel" name="employeeAltMblno"/></td>
                <td><label id="errorAltMobileNo" style="color: red"></label></td>
            </tr>
            
            <tr>
                <td>E-Mail :</td>
                <td><input type="email" name="employeeEmail"></td>
                <td><label id="errorEmail" style="color: red"></label></td>
            </tr>
            
            <tr>
                <td>Alternate E-Mail :</td>
                <td><input type="email" name="employeeAltEmail"/></td>
                <td><label id="errorAltEmail" style="color: red"></label></td>
            </tr>
            
            <tr>
                <td>Address :</td>
               <!--<td><input type="text" name="employeeAddress" /> </td>-->
                <td><textarea rows="8" cols="50" name="employeeAddress"></textarea></td>               
                <td><label id="errorAddress" style="color: red"></label></td>
            </tr>
            
            <tr>
                <td>Qualification :</td>
                <td>
                <select name="employeeQualification">
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
                <select name="employeeExperience">
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
				<td><input type="text" name="employeeSalary">
				<td><label id="errorSalary" style="color:red"></label></td>  
				</td>
			</tr>
	
			<tr>
				<td><input type="submit" value="Register"></td>
				<td><input type="reset" value="Clear">
				</td>
			</tr>
        
		
		
		</table>
		</form>		
		</div>
</body>
</html>