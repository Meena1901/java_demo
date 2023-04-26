package com.example.editPackage.create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.example.salaryCalculationPagkage.*;
import com.example.validationPackage.*;

public class editCreate
{
	static Scanner ss = new Scanner(System.in);
	static Scanner si = new Scanner(System.in);

	static final String DB_URL = "jdbc:mysql://localhost/employeedetails";
	static final String user = "root";
	static final String pwd = "Meena_Mysql09";
	
	validation val= new validation();

	public void insertEmployee() throws MyException
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			int id;
			String name,deptId,desgId,email,address,dob;
			String mobileNo;

			System.out.println("Enter records...  ");

			System.out.println("Enter Employee id              : ");
			id = si.nextInt();
			System.out.println("Enter Employee name            : ");
			name = ss.nextLine();
			System.out.println("Enter Employee dob (yyyy/mm/dd): ");
			dob = si.next();
			if(!validation.dateVerification(dob)){
				System.out.println("Enter valid date");
				throw new MyException("Invalid Input");
			}
			System.out.println("Enter Employee mobile          : ");
			mobileNo = ss.nextLine();
			if(!validation.mobileNoVerification(mobileNo)){
				System.out.println("Enter valid mobile number");
				throw new MyException("Invalid Input");
			}
			System.out.println("Enter Employee email           : ");
			email = ss.nextLine();
			if(!validation.emailValidation(email)){
				System.out.println("Enter valid email id");
				throw new MyException("Invalid Input");
			}
			System.out.println("Enter Employee address         : ");
			address = ss.nextLine();
			System.out.println("Enter Department id            : ");
			deptId = ss.nextLine();
			System.out.println("Enter Dessgnation id           : ");
			desgId = ss.nextLine();
				
			PreparedStatement stmt1 = conn.prepareStatement("INSERT INTO `employeedetails`.`employee` (id,name,dob,mobile,email,Address, deptid, desigid) VALUES (?,?,?,?,?,?,?,?)"); 
				
			stmt1.setInt(1, id);
			stmt1.setString(2, name);
			stmt1.setString(3, dob);
			stmt1.setString(4, mobileNo);
			stmt1.setString(5, email);
			stmt1.setString(6, address);
			stmt1.setString(7, deptId);
			stmt1.setString(8, desgId);		

			int rowsAffected = stmt1.executeUpdate();

			System.out.println(rowsAffected + "Inserting records into the table...");
			conn.close();

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	public void insertDepartment()
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			String deptId,name,description;

			System.out.println("Enter records...  ");

			System.out.println("Enter Departmente id              : ");
			deptId = ss.nextLine();
			System.out.println("Enter Department            : ");
			name = ss.nextLine();
			System.out.println("Enter description           : ");
			description = ss.nextLine();
			
			PreparedStatement stmt1 = conn.prepareStatement("INSERT INTO `employeedetails`.`department`(code,name,description) VALUES (?,?,?)");

			stmt1.setString(1, deptId);
			stmt1.setString(2, name);
			stmt1.setString(3, description);

			int rowsAffected = stmt1.executeUpdate();
			
			System.out.println(rowsAffected+"Inserting records into the table...");
			conn.close();
		} 

		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		

	}


	public void insertDessgnation()
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			String desgId,name,description;

			System.out.println("Enter records...  ");

			System.out.println("Enter designation id              : ");
			desgId = ss.nextLine();
			System.out.println("Enter designation           : ");
			name = ss.nextLine();
			System.out.println("Enter description          : ");
			description = ss.nextLine();

			PreparedStatement stmt1 = conn.prepareStatement("INSERT INTO `employeedetails`.`dessgnation`(descid,designation,description) VALUES (?,?,?)");

			stmt1.setString(1, desgId);
			stmt1.setString(2, name);
			stmt1.setString(3, description);
			
			int rowsAffected = stmt1.executeUpdate();

			System.out.println(rowsAffected+"Inserting records into the table...");
			conn.close();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

	public void insertSalaryPackage()
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			int ssd,empid;
			float basic,hra,spal,gross,net;
			String desgid;

			salaryCalculation sc = new salaryCalculation();

			System.out.println("Enter records...  ");

			
				System.out.println("Enter salary id             : ");
				ssd = ss.nextInt();
				System.out.println("Enter employee id           : ");
				empid = ss.nextInt();
				System.out.println("Enter basic pay                : ");
				basic= ss.nextFloat();
				hra = sc.hraCalculation(basic);
				spal = sc.spalCalculation(basic);
				gross = sc.gross(basic);
				System.out.println("Enter Department id            : ");
				desgid = ss.nextLine();
				net = sc.net(basic);				

				PreparedStatement stmt1 = conn.prepareStatement("INSERT INTO `employeedetails`.`salary`(salid,empid,basic,hra,spal,gross,desid,net) VALUES (?,?,?,?,?,?,?,?)");

				stmt1.setInt(1, ssd);
				stmt1.setInt(2, empid);
				stmt1.setFloat(3, basic);
				stmt1.setFloat(4, hra);
				stmt1.setFloat(5, spal);
				stmt1.setFloat(6, gross);
				stmt1.setString(7, desgid);
				stmt1.setFloat(8, net);

				int rowsAffected = stmt1.executeUpdate();

				System.out.println(rowsAffected+"Inserting records into the table...");
				
		} 

		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

}

  
