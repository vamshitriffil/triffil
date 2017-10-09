package com.dhatriinfo.dao;

import java.sql.*;

import com.dhatriinfo.bean.EmployeeBean;

public class DaoOperations 
{
	PreparedStatement prepareStatement;
	
	Connection connection;
	ResultSet resultSet;
	
	public DaoOperations()
	{
		connection=MyConnection.getInstance();
	}
	
	public int insertData(EmployeeBean employeeBean)
	{
		int result=0;
		String query="insert into employe values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			prepareStatement=connection.prepareStatement(query);
			prepareStatement.setString(1, employeeBean.getEmployeeId());
			prepareStatement.setString(2, employeeBean.getEmployeeName());
			prepareStatement.setString(3, employeeBean.getEmployeeDOB());
			prepareStatement.setString(4, employeeBean.getEmployeeDesignation());
			prepareStatement.setLong(5,employeeBean.getEmployeeMblno());
			prepareStatement.setLong(6, employeeBean.getEmployeeAltMblno());
			prepareStatement.setString(7, employeeBean.getEmployeeEmail());
			prepareStatement.setString(8,employeeBean.getEmployeeAltEmail());
			prepareStatement.setString(9, employeeBean.getEmployeeAddress());
			prepareStatement.setString(10, employeeBean.getEmployeeQualification());
			prepareStatement.setString(11, employeeBean.getEmployeeExperience());			
			prepareStatement.setDouble(12, employeeBean.getEmployeeSalary());
			
			result=prepareStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	
	
}
