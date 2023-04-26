package com.example.demo;

import java.util.Scanner;

import com.example.editPackage.create.MyException;
public class DemoApplication 
{

	public static void main(String[] args) throws MyException 
    {
        int ch1;

        Scanner ss = new Scanner(System.in);
        //display menu bar  
        System.out.println("Choose options: \n 1. Edit employee table \n 2. Edit department table \n 3. Edit designation table \n 4. Edit salary packages\n");
        System.out.println("Enter your choice: ");

        ch1 = ss.nextInt();
        operations op = new operations();
        

	    switch(ch1) 
	    {
	            //Table editing
	        case 1:
		        System.out.println("Select editting option for employee : ");
		        op.operationsEmployee();
		        break;
	        case 2:
		        System.out.println("Editting option for department...");
		        op.operationsDepartment();
		        break;
	        case 3:
		        System.out.println("Editting option for designation...");
		        op.operationsDesignation();
		        break;
	        case 4:
		        System.out.println("Editting option for salary packages...");
		        op.operationsSalary();
		        break;
	
	        default:
	            System.out.println("invalid option");
	            break;  
	
	        }
        ss.close();
        
    }

}