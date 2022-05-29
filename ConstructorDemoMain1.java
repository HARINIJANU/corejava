package com.cons;
class Student3{
	
int sid;
String sname;
float sfees;

//constuctor is same name as class and it does not have any retun type
Student3()
{
	System.out.println("Constuctoris called an creation of object implicity");
	sid=1;
	sname="balu";
	sfees=345.45f;
}

Student3(int sid,String sname,float sfees)// constuct with argument
{
	this.sid=sid;//this is a implicit oobj
	this.sname=sname;
	this.sfees=sfees;
	
}
}
public class ConstructorDemoMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated
	// TODO Auto-generated method stub
int totalfees;
Student3 sob=new Student3();//calls constructor
Student3 sob1=new Student3(2,"piya",3453.33f);
Student3 sob2=new Student3(3,"fefe",34.34f);
System.out.println("sname="+sob.sname);

System.out.println("sid="+sob.sid);
System.out.println("fees="+sob.sfees);
//System.out.println(totalfees);
System.out.println("sid="+sob1.sid);
System.out.println("sname="+sob1.sname);
System.out.println("sfees="+sob1.sfees);
System.out.println("sid="+sob2.sid);
System.out.println("sname="+sob2.sname);
System.out.println("sfees="+sob2.sfees);


//local vaiables does not have default values
}

}
