package com.example.editPackage.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.example.editPackage.create.MyException;
import com.example.salaryCalculationPagkage.salaryCalculation;
import com.example.validationPackage.validation;

public class editUpdate
{
	int id,y;
	static String deptId;
	static String desgId;
	static String name;
	static String email;
	static String address;
	static String mobileNo;
	static String dob,sql;
	
	static Scanner ss = new Scanner(System.in);
	static Scanner si = new Scanner(System.in);

	static final String DB_URL = "jdbc:mysql://localhost/employeedetails";
	static final String user = "root";
	static final String pwd = "Meena_Mysql09";

	public void updateEmployee(int id) throws MyException
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			System.out.println("Update records...  ");

			
				System.out.println("Update Employee name            : ");
				name = ss.nextLine();
				System.out.println("Update Employee dob (yyyy/mm/dd): ");
				dob = ss.next();
				if(!validation.dateVerification(dob)){
					System.out.println("Enter valid date");
					throw new MyException("Invalid Input");
				}
				System.out.println("Update Employee mobile          : ");
				mobileNo = ss.nextLine();
				if(!validation.mobileNoVerification(mobileNo)){
					System.out.println("Enter valid mobile number");
					throw new MyException("Invalid Input");
				}
				System.out.println("Update Employee email           : ");
				email = ss.nextLine();
				if(!validation.emailValidation(email)){
					System.out.println("Enter valid email id");
					throw new MyException("Invalid Input");
				}
				System.out.println("Update Employee address         : ");
				address = ss.nextLine();
				System.out.println("Update Department id            : ");
				deptId = ss.nextLine();
				System.out.println("Update Dessgnation id           : ");
				desgId = ss.nextLine();
				
				sql = "UPDATE `employeedetails`.`employee` SET `name` = '"+name+"', `dob` = '"+dob+"', `mobile` = '"+mobileNo+"', `email` = '"+email+"', `Address` = '"+address+"', `deptid` = '"+deptId+"', `desigid` = '"+desgId+"' WHERE (`id` = '"+id+"')";
				stmt.executeUpdate(sql); 	

				System.out.println("updateing records into the table...");
				
		} 

		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

	public void updateDepartment(String deptId)
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			String name,description,sql;

			System.out.println("Update records...  ");

				System.out.println("Update Employee name            : ");
				name = ss.nextLine();
				System.out.println("Update Department id            : ");
				description = ss.nextLine();
				
				sql = "UPDATE `employeedetails`.`department` VALUES ("+deptId+", "+name+", "+description+")";
				stmt.executeUpdate(sql); 	

				System.out.println("updateing records into the table...");
				
		} 

		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}


	public void updateDessgnation(String desgId)
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			String name,description,sql;

			System.out.println("Update records...  ");

				System.out.println("Update Employee name            : ");
				name = ss.nextLine();
				System.out.println("Update Department id            : ");
				description = ss.nextLine();
				
				sql = "UPDATE `employeedetails`.`dessgnation` VALUES ("+desgId+", "+name+", "+description+")";
				stmt.executeUpdate(sql); 	

				System.out.println("updateing records into the table...");
				
		} 

		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

	public void updateSalaryPackage(int ssd)
	{
		try(Connection conn = DriverManager.getConnection(DB_URL,user,pwd); Statement stmt = conn.createStatement();) 
		{
			int empid;
			float basic,hra,spal,gross,net;
			String desgid,sql;

			salaryCalculation sc = new salaryCalculation();

			System.out.println("Update records...  ");

				System.out.println("Update Employee name            : ");
				empid = ss.nextInt();
				System.out.println("Update basic pay                : ");
				basic= ss.nextFloat();
				hra = sc.hraCalculation(basic);
				spal = sc.spalCalculation(basic);
				gross = sc.gross(basic);
				System.out.println("Update Department id            : ");
				net = sc.net(basic);
				desgid = ss.nextLine();
				
				sql = "UPDATE `employeedetails`.`salary` VALUES ("+ssd+", "+empid+", "+basic+", "+hra+", "+spal+", "+gross+", "+desgid+", "+net+")";
				stmt.executeUpdate(sql); 	

				System.out.println("updateing records into the table...");
				
		} 

		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
