package com.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ui","root","root");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	}  
	public static int save(Empbean e){  
	    int status=0;  
	    try{  
	        Connection con=EmpDao.getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	                     "insert into Reg(username,email,pass) values (?,?,?)");  
	        ps.setString(1,e.getName());  
	        ps.setString(2,e.getEmail());  
	        ps.setString(3,e.getPass());    
	          
	        status=ps.executeUpdate();  
	          
	        con.close();  
	    }catch(Exception ex){ex.printStackTrace();}  
	      
	    return status;  
	}  
	public static int update(Empbean e){  
	    int status=0;  
	    try{  
	        Connection con=EmpDao.getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	                     "update Reg set username=?,pass=? where email=?");  
	        ps.setString(1,e.getName());  
	        ps.setString(2,e.getEmail());  
	        ps.setString(3,e.getPass());  
	        
	        status=ps.executeUpdate();  
	          
	        con.close();  
	    }catch(Exception ex){ex.printStackTrace();}  
	      
	    return status;  
	}  
	public static int delete(String email){  
	    int status=0;  
	    try{  
	        Connection con=EmpDao.getConnection();  
	        PreparedStatement ps=con.prepareStatement("delete from Reg where email=?");  
	        ps.setString(1,email);  
	        status=ps.executeUpdate();  
	          
	        con.close();  
	    }catch(Exception e){e.printStackTrace();}  
	      
	    return status;  
	}  
	public static boolean checkUser(String email,String pass) 
    {
     boolean st =false;
     try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ui","root","root");
        PreparedStatement ps =con.prepareStatement("select * from Reg where email=? and pass=?");
        ps.setString(1, email);
        ps.setString(2,pass);
       
        ResultSet rs =ps.executeQuery();
        st = rs.next();
     }catch(Exception e){
         e.printStackTrace();
     }
        return st;                 
 }   
	public static List<Empbean> getAllEmployees(){  
	    List<Empbean> list=new ArrayList<Empbean>();  
	      
	    try{  
	        Connection con=EmpDao.getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from Reg");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            Empbean e=new Empbean();  
	            
	            e.setName(rs.getString(1));  
	            e.setPass(rs.getString(2));  
	            e.setEmail(rs.getString(3));  
	            
	            list.add(e);  
	        }  
	        con.close();  
	    }catch(Exception e){e.printStackTrace();}  
	      
	    return list;  
	}

}
