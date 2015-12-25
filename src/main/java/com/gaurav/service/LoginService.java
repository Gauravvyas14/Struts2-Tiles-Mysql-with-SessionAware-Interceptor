package com.gaurav.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gaurav.model.User;



public class LoginService {
	
	private String tableName;
	
	public boolean validateLogin(User user)
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
			 String sql = "SELECT name FROM ";
			 
			 if(user.getType()=="admin")
				{
					this.tableName="admin";
				}
			 else
					this.tableName="students";
		     
			 sql+=tableName;
			 sql+= " WHERE email = ? AND password = ?";
			 
	         PreparedStatement ps = con.prepareStatement(sql);
	         
	         
	         ps.setString(1, user.getLoginid());
	         ps.setString(2, user.getPassword());
	         ResultSet rs = ps.executeQuery();
	         
	         
	         while(rs.next())
	         {
	        	 user.setName(rs.getString(1));
	        	 
	        	 return true;
	         }
	
	         
		 }
	         
	         catch(Exception e)
	         {
	        	 e.printStackTrace();
	         }
		 
		 
	finally 
	 {
        if (con != null) {
           try {
              con.close();
           } 
           catch (Exception e) {
           	e.printStackTrace();
           }
        }
	 }
		 
		 
		 
		return false;
	}


}
