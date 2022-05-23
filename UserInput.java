package hari2.edu;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name;
     int age;
     float salary;
     Scanner sc=new Scanner(System.in);
     
     System.out.println("enter the name");
     name=sc.next();
     System.out.println("enter age");
     age=sc.nextInt();
     System.out.println("enter the salary");
     salary=sc.nextFloat();
     
     System.out.println("Details");
     System.out.println("name="+name);
     System.out.println("age="+age);
     System.out.println("salary="+salary);
	}

}
