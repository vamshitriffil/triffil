package com.dhatriinfo.dao;

import java.sql.*;

public class MyConnection 
{
	private static Connection connection;
	private static MyConnection myConnection=new MyConnection();

	private MyConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhatriinfodb","root","root");
					
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
	
	public static Connection getInstance()
	{
		return connection;
	}

}
