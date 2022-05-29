package com.edu;
import java.util.Scanner;
class Employee5{
	String empname;
	int empage;
	float empsalary;
	String empdept;
	float annualsal;
	
	void empInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		empname=sc.nextLine();
		System.out.println("enter the age:");
		empage=sc.nextInt();
		System.out.println("enter the salary:");
		empsalary=sc.nextFloat();
		System.out.println("enter the department:");
		sc.nextLine();
		empdept=sc.nextLine();
		
	}
	void empAnnualSalary()
	{
		annualsal=empsalary*12;
	}
	void empDetails()
	{
		System.out.println("emp details:");
		System.out.println("name=" +empname);
		System.out.println("age=" +empage);
		System.out.println("annual salary=" +annualsal);
		System.out.println("dept=" +empdept);
	}
}

public class EmployeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee5 eob=new Employee5();
eob.empInput();
eob.empAnnualSalary();
eob.empDetails();
	}


	}


