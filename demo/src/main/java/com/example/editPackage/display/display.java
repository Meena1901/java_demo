package com.example.editPackage.display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class display
{
	public void displayEmployee()
	{
		try 
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Meena_Mysql09");
			
            Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select*from employee");

			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
			}
			con.close();

		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}

    public void displayDept()
	{
		try 
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Meena_Mysql09");
			
            Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select*from department");

			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+" \t "+rs.getString(2)+" \t "+rs.getString(3));
			}
			con.close();
            
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}

    public void displayDesignation()
	{
		try 
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Meena_Mysql09");
			
            Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select*from designation");

			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+" \t "+rs.getString(2)+" \t "+rs.getString(3));
			}
			con.close();
            
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}

    public void displaySalary()
	{
		try 
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Meena_Mysql09");
			
            Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select*from salary");

			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
			}
			con.close();
            
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}


}
