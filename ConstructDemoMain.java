package com.cons;
class Student{
	int sid;
	String sname;
	float sfees;
	
	//constuctor is same name as class and it does not have any retun type
	Student()
	{
		System.out.println("Constuctoris called an creation of object implicity");
		sid=1;
		sname="balu";
		sfees=345.45f;
	}
}
public class ConstructDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int totalfees;
  Student sob=new Student();//calls constructor
  System.out.println("sid="+sob.sid);
  System.out.println("fees="+sob.sfees);
  //System.out.println(totalfees);
  //local vaiables does not have default values
	}

}
