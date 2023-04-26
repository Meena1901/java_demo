package com.example.editPackage.delete;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class editDelet {

    String sql;
    static Scanner ss = new Scanner(System.in);

	static final String DB_URL = "jdbc:mysql://localhost/employeedetails";
	static final String user = "root";
	static final String pwd = "Meena_Mysql09";

    public void deleteEmployee(int id)
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{

			System.out.println("Record deleting...  ");
	
			sql = "DELETE FROM `employeedetails`.`employee` WHERE (`id` = '"+id+"')";
			stmt.executeUpdate(sql); 	

			System.out.println("deleteing records from the table...");
				
		} 

		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

    public void deleteDepartment(String deptId)
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			System.out.println("Record deleting...  ");
	
			sql = "DELETE FROM `employeedetails`.`department` WHERE (`code` = '"+deptId+"')";
			stmt.executeUpdate(sql); 	

			System.out.println("deleteing records from the table...");
				
		} 

		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

    public void deleteDesignation(String id)
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			System.out.println("Record deleting...  ");

			sql = "DELETE FROM `employeedetails`.`designation` WHERE (`descid` = '"+id+"')";
			stmt.executeUpdate(sql); 	

			System.out.println("deleteing records from the table...");
				
		} 

		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

    public void deleteSalaryPackage(Integer id)
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			System.out.println("Record deleting...  ");

			sql = "DELETE FROM `employeedetails`.`salary` WHERE (`salid` = '"+id+"')";
			stmt.executeUpdate(sql); 	

			System.out.println("deleteing records from the table...");
				
		} 

		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}
    
}
