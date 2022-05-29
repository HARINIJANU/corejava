package com.cons;
import java.util.Scanner;

class Employee3{
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

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Employee3 eob=new Employee3();
eob.empInput();
eob.empAnnualSalary();
eob.empDetails();*/
		// array of obj
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of emp");
		int n=sc.nextInt();
		Employee3 eob[]=new Employee3[n];//array of obj 
		for(int i=0;i<n;i++)
		{
			eob[i]=new Employee3();
		}
		//i/p emp data
		for(int i=0;i<n;i++)
		{
			eob[i].empInput();
		}
		//salary calc
		for(int i=0;i<n;i++)
		{
			eob[i].empAnnualSalary();
		}
		for(int i=0;i<n;i++)
		{
			eob[i].empDetails();
		}
		
		
	
	}


	}


