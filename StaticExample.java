package com.inheri;


public class StaticExample 
{
static {//static block
	System.out.println("static block executes before main method");
}
{
	System.out.println("normal block execute before constructor");
}
StaticExample()
{
	System.out.println("constuctor calls on obj creation");
}
	public static void main(String[] args)//main method
	{
		
		// TODO Auto-generated method stub
System.out.println("main method executes after static block");
   StaticExample obj=new StaticExample();
	}

}
