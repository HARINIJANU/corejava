package com.edu;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="Hello";
   String s1="Hello";
   
   if(s==s1)
   {
	   System.out.println("s1 is same as s2");
   }
   else {
	   System.out.println("not same");
   }
   String s2=new String("hi");
   String s3=new String("hi");
   if(s2==s3)
	   System.out.println("s2==s3");
   else
	   System.out.println("s2!=s3");

   
	}

}
