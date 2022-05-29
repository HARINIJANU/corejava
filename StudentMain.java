package com.edu.construct;
import java.util.Scanner;

class Student3{
	private int sid;
	private String sname;
	//initialise data usng construct with arg
	public Student3()  //no arg constuct
	{
		sid=0;
		sname=null;
		
	}
	Student3(int sid,String name)
	{
		this.sid=sid;
		this.sname=sname;
	}
	
void studentDisplay()
{
	System.out.println("id="+sid);
	System.out.println("name="+sname);
}
public void inputData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	sname=sc.nextLine();
	System.out.println("enter id");
	sid=sc.nextInt();
}
}


public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student3 s1=new Student3(1,"hari");// calls constructor
Student3 s2=new Student3(2,"rani");
s1.studentDisplay();
s2.studentDisplay();

Student3 s3=new Student3();
s3.inputData();
s3.studentDisplay();

	}

}
