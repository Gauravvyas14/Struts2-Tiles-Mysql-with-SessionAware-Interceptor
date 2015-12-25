package com.gaurav.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gaurav.model.User;

public class SignupService {
	
	public boolean validateSignup(User user)
	{
		
		
		Connection con=null;
		 String URL = "jdbc:mysql://localhost/courseapp";
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
     	    
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
		 try {
			 
			 
			 	con = DriverManager.getConnection(URL, "tutorial", "tutorial");
	         
	        }
	        catch(SQLException e)
	        {
	        	
	        	
	        	System.out.println("SQLException: " + e.getMessage());
	            System.out.println("SQLState: " + e.getSQLState());
	            System.out.println("VendorError: " + e.getErrorCode());
	        	
	        	e.printStackTrace();
	        }
		 
		 try
		 {
			 String sql = "INSERT INTO students values( ?, ?, ?)";
			 
			 PreparedStatement ps = con.prepareStatement(sql);
			 
			 ps.setString(1, user.getName());
			 ps.setString(2, user.getLoginid());
	         ps.setString(3, user.getPassword());
	         ps.executeUpdate();
	         
	         return true;
	         
		 }
         
         catch(Exception e)
         {
        	 e.printStackTrace();
         }
		 return false;
	}

}
