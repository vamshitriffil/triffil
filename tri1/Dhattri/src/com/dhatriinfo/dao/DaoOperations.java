package com.dhatriinfo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
		String query="insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
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
	
	public ArrayList<EmployeeBean> searchEmployee(String searchEmp)
	{
		ArrayList<EmployeeBean> employeeList=new ArrayList<EmployeeBean>();
		EmployeeBean employeeBean;
		String query="select * from employee where employeeId Like'%"+searchEmp+"%' or employeeName Like'%"+searchEmp+"%' ";
		/*String query1="select * from employee where enmployeeSalary  Like'%"+searchEmp+"%' or employeeAddress' Like'%"+searchEmp+"%' ";
		String query2="select * from employee where employeeAddress Like'%"+searchEmp+"%'";*/
		try {
			prepareStatement=connection.prepareStatement(query);
		/*	PreparedStatement pstmt=connection.prepareStatement(query1);
			prepareStatement=connection.prepareStatement(query2);*/
			
			
			//resultSet=pstmt.executeQuery();
			resultSet=prepareStatement.executeQuery();
			while(resultSet.next())
			{
				employeeBean=new EmployeeBean();
				employeeBean.setEmployeeId(resultSet.getString(1));
				employeeBean.setEmployeeName(resultSet.getString(2));
				employeeBean.setEmployeeDOB(resultSet.getString(3));
				employeeBean.setEmployeeDesignation(resultSet.getString(4));
				employeeBean.setEmployeeMblno(resultSet.getLong(5));
				employeeBean.setEmployeeAltMblno(resultSet.getLong(6));
				employeeBean.setEmployeeEmail(resultSet.getString(7));
				employeeBean.setEmployeeAltEmail(resultSet.getString(8));
				employeeBean.setEmployeeAddress(resultSet.getString(9));
				employeeBean.setEmployeeQualification(resultSet.getString(10));
				employeeBean.setEmployeeExperience(resultSet.getString(11));
				employeeBean.setEmployeeSalary(resultSet.getDouble(12));
				
				employeeList.add(employeeBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return employeeList;
		
	}
	public ArrayList<EmployeeBean> searchRadio(String searchEmp)
	{
		ArrayList<EmployeeBean> employeeList=new ArrayList<EmployeeBean>();
		EmployeeBean employeeBean;
		String query="select * from employee where employeeAddress Like'"+searchEmp+"%' or enmployeeSalary Like'"+searchEmp+"%'"  ;
		try {
			prepareStatement=connection.prepareStatement(query);
			prepareStatement.setString(1, searchEmp);
			prepareStatement.setString(2, searchEmp);
			
			resultSet=prepareStatement.executeQuery();
			while(resultSet.next())
			{
				employeeBean=new EmployeeBean();
				employeeBean.setEmployeeId(resultSet.getString(1));
				employeeBean.setEmployeeName(resultSet.getString(2));
				employeeBean.setEmployeeDOB(resultSet.getString(3));
				employeeBean.setEmployeeDesignation(resultSet.getString(4));
				employeeBean.setEmployeeMblno(resultSet.getLong(5));
				employeeBean.setEmployeeAltMblno(resultSet.getLong(6));
				employeeBean.setEmployeeEmail(resultSet.getString(7));
				employeeBean.setEmployeeAltEmail(resultSet.getString(8));
				employeeBean.setEmployeeAddress(resultSet.getString(9));
				employeeBean.setEmployeeQualification(resultSet.getString(10));
				employeeBean.setEmployeeExperience(resultSet.getString(11));
				employeeBean.setEmployeeSalary(resultSet.getDouble(12));
				
				employeeList.add(employeeBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return employeeList;
		
	}
	public ArrayList<EmployeeBean> updateData(String update, String mbl)
	{
		ArrayList<EmployeeBean> employeeList=new ArrayList<EmployeeBean>();
		EmployeeBean employeeBean;
		String query="select * from employee where employeeId=? or employeeMblno=?"  ;
		try {
			prepareStatement=connection.prepareStatement(query);
			prepareStatement.setString(1, update);
			prepareStatement.setString(2, mbl);
			
			resultSet=prepareStatement.executeQuery();
			while(resultSet.next())
			{
				employeeBean=new EmployeeBean();
				employeeBean.setEmployeeId(resultSet.getString(1));
				employeeBean.setEmployeeName(resultSet.getString(2));
				employeeBean.setEmployeeDOB(resultSet.getString(3));
				employeeBean.setEmployeeDesignation(resultSet.getString(4));
				employeeBean.setEmployeeMblno(resultSet.getLong(5));
				employeeBean.setEmployeeAltMblno(resultSet.getLong(6));
				employeeBean.setEmployeeEmail(resultSet.getString(7));
				employeeBean.setEmployeeAltEmail(resultSet.getString(8));
				employeeBean.setEmployeeAddress(resultSet.getString(9));
				employeeBean.setEmployeeQualification(resultSet.getString(10));
				employeeBean.setEmployeeExperience(resultSet.getString(11));
				employeeBean.setEmployeeSalary(resultSet.getDouble(12));
				
				employeeList.add(employeeBean);
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		return employeeList;
		
	}
	public  EmployeeBean authenicateEmp(String eid){
		EmployeeBean empBeanResult=null;
		//boolean logIn=false;
		String query="select * from employee where employeeId=? "  ;
		try {
			prepareStatement=connection.prepareStatement(query);
			prepareStatement.setString(1, eid);
			//prepareStatement.setString(2, embl);
			
		resultSet=prepareStatement.executeQuery();

		while(resultSet.next())
		{
			empBeanResult=new EmployeeBean();
			empBeanResult.setEmployeeId(resultSet.getString(1));
			empBeanResult.setEmployeeName(resultSet.getString(2));
			empBeanResult.setEmployeeDOB(resultSet.getString(3));
			empBeanResult.setEmployeeDesignation(resultSet.getString(4));
			empBeanResult.setEmployeeMblno(resultSet.getLong(5));
			empBeanResult.setEmployeeAltMblno(resultSet.getLong(6));
			empBeanResult.setEmployeeEmail(resultSet.getString(7));
			empBeanResult.setEmployeeAltEmail(resultSet.getString(8));
			empBeanResult.setEmployeeAddress(resultSet.getString(9));
			empBeanResult.setEmployeeQualification(resultSet.getString(10));
			empBeanResult.setEmployeeExperience(resultSet.getString(11));
			empBeanResult.setEmployeeSalary(resultSet.getDouble(12));
			
			
		}
		
		
	
} catch (Exception e) {
	e.printStackTrace();
	// TODO: handle exception
}
return empBeanResult;


}
	
	
	public int updateView(EmployeeBean employeeBean)
	{
		//EmployeeBean employeeBean=null;
		int result=0;
		String query="update employee set employeeName=?,employeeDOB=?,employeeDesignation=?,employeeMblno=?,employeeAltMblno=?,employeeEmail=?,employeeAltEmail=?,employeeAddress=?,employeeQualification=?,employeeExperience=?,enmployeeSalary=? where employeeId =?";
		
		try {
			prepareStatement=connection.prepareStatement(query);
			//prepareStatement.setString(1,update );
			
			prepareStatement.setString(1, employeeBean.getEmployeeName());
			prepareStatement.setString(2, employeeBean.getEmployeeDOB());
			prepareStatement.setString(3, employeeBean.getEmployeeDesignation());
			prepareStatement.setLong(4,employeeBean.getEmployeeMblno());
			prepareStatement.setLong(5, employeeBean.getEmployeeAltMblno());
			prepareStatement.setString(6, employeeBean.getEmployeeEmail());
			prepareStatement.setString(7,employeeBean.getEmployeeAltEmail());
			prepareStatement.setString(8, employeeBean.getEmployeeAddress());
			prepareStatement.setString(9, employeeBean.getEmployeeQualification());
			prepareStatement.setString(10, employeeBean.getEmployeeExperience());			
			prepareStatement.setDouble(11, employeeBean.getEmployeeSalary());
			prepareStatement.setString(12,employeeBean.getEmployeeId() );
			
			result=prepareStatement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	
}
