package com.info.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection getConnection()
	{	
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "12345");
			}
		catch(Exception e)
		{
			System.out.println("ConnectionProvider "+e);
		}
		return con;
	}

}
