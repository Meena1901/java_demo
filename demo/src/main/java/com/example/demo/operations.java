package com.example.demo;

import java.util.*;

import com.example.editPackage.create.*;
import com.example.editPackage.update.editUpdate;
import com.example.editPackage.delete.*;
import com.example.editPackage.display.*;

public class operations{

    editCreate ec = new editCreate();
    editUpdate eu = new editUpdate();
    editDelet ed = new editDelet();
    display ds = new display();

    public void operationsEmployee() throws MyException{
        int ch;
        System.out.println("Operations \n 1. Create new row \n 2. Delete a row using id \n 3. modify existing data using id \n 4. Display table \n 5.Exit \n\n");
        System.out.println("Enter the operation to be performed : ");

        Scanner sc=new Scanner(System.in);
        ch= sc.nextInt();

        switch(ch)
        {
            case 1:
            System.out.println("Create operation");
            ec.insertEmployee();
            break;
            case 2:
            System.out.println("Delete operation");
            System.out.println("Enter the id : ");
            int id=sc.nextInt();
            ed.deleteEmployee(id);
            break;
            case 3:
            System.out.println("Modify operation");
            System.out.println("Enter the id : ");
            int id2 = sc.nextInt();
            eu.updateEmployee(id2);
            break;
            case 4:
            System.out.println("Display operation");
            ds.displayEmployee();
            break;
            case 5:
            break;

            default:
            System.out.println("Invalid input");;
            break;
        }

        sc.close();
    }

    public void operationsDepartment(){
        int ch;
        System.out.println("Operations \n 1. Create new row \n 2. Delete a row using id \n 3. modify existing data using id \n 4. Display table \n 5. exit\n\n");
        System.out.println("Enter the operation to be performed : ");

        Scanner sc=new Scanner(System.in);
        ch= sc.nextInt();

        switch(ch)
        {
            case 1:
            System.out.println("Create operation");
            ec.insertDepartment();
            break;
            case 2:
            System.out.println("Delete operation");
            System.out.println("Enter the id : ");
            String id=sc.nextLine();
            ed.deleteDepartment(id);
            break;
            case 3:
            System.out.println("Modify operation");
            System.out.println("Enter the id : ");
            String id2 = sc.nextLine();
            eu.updateDepartment(id2);
            break;
            case 4:
            System.out.println("Display operation");
            ds.displayDept();
            break;
            case 5:
            break;

            default:
            System.out.println("Invalid input");;
            break;
        }

        sc.close();
    }

    public void operationsDesignation(){
        int ch;
        System.out.println("Operations \n 1. Create new row \n 2. Delete a row using id \n 3. modify existing data using id \n 4. Display table\n\n");
        System.out.println("Enter the operation to be performed : ");

        Scanner sc=new Scanner(System.in);
        ch= sc.nextInt();

        switch(ch)
        {
            case 1:
            System.out.println("Create operation");
            ec.insertDessgnation();
            break;
            case 2:
            System.out.println("Delete operation");
            System.out.println("Enter the id : ");
            String id=sc.nextLine();
            ed.deleteDesignation(id);
            break;
            case 3:
            System.out.println("Modify operation");
            System.out.println("Enter the id : ");
            String id2 = sc.nextLine();
            eu.updateDessgnation(id2);
            break;
            case 4:
            System.out.println("Display operation");
            ds.displayDesignation();
            break;
            case 5:
            break;

            default:
            System.out.println("Invalid input");;
            break;
        }

        sc.close();
    }

    public void operationsSalary(){
        int ch;
        System.out.println("Operations \n 1. Create new row \n 2. Delete a row using id \n 3. modify existing data using id \n 4. Display table \n 5. exit\n\n");
        System.out.println("Enter the operation to be performed : ");

        Scanner sc=new Scanner(System.in);
        ch= sc.nextInt();

        switch(ch)
        {
            case 1:
            System.out.println("Create operation");
            ec.insertSalaryPackage();
            break;
            case 2:
            System.out.println("Delete operation");
            System.out.println("Enter the id : ");
            int id=sc.nextInt();
            ed.deleteSalaryPackage(id);
            break;
            case 3:
            System.out.println("Modify operation");
            System.out.println("Enter the id : ");
            int id2 = sc.nextInt();
            eu.updateSalaryPackage(id2);
            break;
            case 4:
            System.out.println("Display operation");
            ds.displaySalary();
            break;
            case 5:
            break;

            default:
            System.out.println("Invalid input");;
            break;
        }

        sc.close();
    }

}