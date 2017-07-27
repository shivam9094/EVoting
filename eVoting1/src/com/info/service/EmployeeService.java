package com.info.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.info.model.Employee;
import com.info.security.Main;

public class EmployeeService {

	
	public static boolean verify(Employee emp)
	{
		boolean flag = false;
		try{
			Connection con = ConnectionProvider.getConnection();
			String query =("select * from registration where  aadhar =? and password =?");
			PreparedStatement ps = con.prepareStatement(query);
			
			/*ps.setString(1, emp.getUsername());*/
			ps.setString(1, emp.getAadhar());
			ps.setString(2, emp.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				flag=true;
				con.close();
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Employee--verify---"+e);
		}
		return flag;
	}
	public static boolean verify1(Employee emp)
	{
		boolean flag = false;
		try{
			Connection con = ConnectionProvider.getConnection();
			String query =("select * from admin where  username =? and password =?");
			PreparedStatement ps = con.prepareStatement(query);
			
			/*ps.setString(1, emp.getUsername());*/
			ps.setString(1, emp.getUsername());
			ps.setString(2, emp.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				flag=true;
				con.close();
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Employee--verify---"+e);
		}
		return flag;
	}
public static boolean insert(Employee emp)
	{
		boolean flag=false;
		try{
			Connection con = ConnectionProvider.getConnection();
			String query=("insert into registration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(3,emp.getName());
			ps.setString(1,emp.getUsername());
			ps.setString(2,emp.getPassword());
			ps.setString(4,emp.getEmail());
			ps.setString(5,emp.getPhone());
			ps.setString(6,emp.getGender());
     		ps.setString(7,emp.getAddress());
     		ps.setString(8,emp.getCity());
     		ps.setString(9,emp.getState());
     		ps.setString(10,emp.getCountry());
     		ps.setString(11, emp.getPincode());
     		ps.setString(12,emp.getAadhar());
     		ps.setString(13,emp.getVoter_id());
     		ps.setString(14,emp.getDob());
			int num = ps.executeUpdate();
			if(num>=0)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("EmployeeSrevice- insert-----"+e);
		}
		
		return flag;
	}
public static boolean insert1(Employee emp)
{
	boolean flag=false;
	try{
		Connection con = ConnectionProvider.getConnection();
		
		
		
        	 String query=("insert into voting values(?,?,?)");
     		PreparedStatement ps = con.prepareStatement(query);
     		ps.setString(1,emp.getAadhar());
     		ps.setString(3,emp.getParty_name());
     		ps.setString(2,emp.getVoter_id());
     		
     		int num = ps.executeUpdate();
    		if(num>=0)
    		{
    			flag=true;
    		}
    	}
         catch(Exception e)
    		{
    			System.out.println("EmployeeSrevice- insert1---"+e);
    		}	return flag;
	}

/*
public static boolean insert1(Employee emp)
{
	boolean flag=false;
	try{
		Connection con = ConnectionProvider.getConnection();
		
		 ResultSet result = null; 
		 PreparedStatement stmt= con.prepareStatement("select city from employee_upd where username=?");
		 stmt.setString(1, emp.getUsername());
		 result = stmt.executeQuery();
         if(!result.isBeforeFirst()){
        	 String query=("insert into employee_upd values(?,?,?,?,?,?,?)");
     		PreparedStatement ps = con.prepareStatement(query);
     		ps.setString(1,emp.getGender());
     		ps.setString(2,emp.getAddress());
     		ps.setString(3,emp.getCity());
     		ps.setString(4,emp.getState());
     		ps.setString(5,emp.getCountry());
     		ps.setString(6, emp.getPincode());
     		ps.setString(7, emp.getUsername());
     		int num = ps.executeUpdate();
    		if(num>=0)
    		{
    			flag=true;
    		}
             System.out.println("No Data Found"); //data not exist
         }
        
	}
	catch(Exception e)
	{
		System.out.println("EmployeeSrevice- insert1---"+e);
	}
	
	return flag;
}
public static boolean update(Employee emp1)
{
	boolean flag1=false;
	try{
		Connection con = ConnectionProvider.getConnection();
		String query=("update employee_reg set password=? ,email=?, phone=? where username=?");
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,emp1.getPassword());
		ps.setString(2,emp1.getEmail());
		ps.setString(3,emp1.getPhone());
		ps.setString(4, emp1.getUsername());
		int num = ps.executeUpdate();
		if(num>=0)
		{
			flag1=true;
		}
	}
	catch(Exception e)
	{
		System.out.println("EmployeeSrevice- update-----"+e);
	}
	
	return flag1;
}else{
        	String query=("update employee_upd set address=?, city=?, state=?, country=?, pincode=? where username=?");
    		PreparedStatement ps = con.prepareStatement(query);
    		
    		ps.setString(1,emp.getAddress());
    		ps.setString(2,emp.getCity());
    		ps.setString(3,emp.getState());
    		ps.setString(4,emp.getCountry());
    		ps.setString(5, emp.getPincode());
    		ps.setString(6, emp.getUsername());
    		int num = ps.executeUpdate();
    		if(num>=0)
    		{
    			flag=true;
    		}
    		System.out.println("helloo");
           }   
		
*/

/*public static boolean update1(Employee emp)
{
	boolean flag1=false;
	try{
		Connection con = ConnectionProvider.getConnection();
		String query=("update registration set gender=? ,address=?, city=?, state=?, country=?, pincode=? where username=?");
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,emp.getGender());
		ps.setString(2,emp.getAddress());
		ps.setString(3,emp.getCity());
		ps.setString(4,emp.getState());
		ps.setString(5,emp.getCountry());
		ps.setString(6, emp.getPincode());
		ps.setString(7, emp.getUsername());
		int num = ps.executeUpdate();
		if(num>=0)
		{
			flag1=true;
		}
	}
	catch(Exception e)
	{
		System.out.println("EmployeeSrevice- update-----"+e);
	}
	
	return flag1;
}*/

}
