package com.edu;

import java.util.Scanner;

class Rectangle{
	//declare variable
	//these variables are called member data
	//instance variable
	int l,b,a;
	//member fn or methods
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("length and breadth of rectangle");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	void calculateArea()
	{
		a=l*b;
	}
void displayArea() {
	

  System.out.println("the area of rectangle "+l+" and "+b+" is "+a);
}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rob=new Rectangle();
		rob.input();
		rob.calculateArea();
		rob.displayArea();

	}
	

}

