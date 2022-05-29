package com.inheri;

import java.util.Scanner;

class Employee
{
	private int eid;   //diff id
	private String ename;// diff
	private  static String cname;  // same name
	
	static {
		cname="ITCompany";
	}
	public void inputEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		ename=sc.nextLine();
		System.out.println("enter id");
		eid=sc.nextInt();
	}
	public void empdetails()
	{
		System.out.println("name="+ename);
		System.out.println("id="+eid);
		System.out.println("cname="+cname);
	}
	
	
}


public class StaticVariableMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee eob[]=new Employee[2];
for(int i=0;i<eob.length;i++) {
	eob[i]=new Employee();
     eob[i].inputEmployee();
	}
System.out.println("all emp detail");
for(int i=0;i<eob.length;i++)
{
	eob[i].empdetails();
}


}
}
