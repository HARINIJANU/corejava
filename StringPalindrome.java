package com.edu;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s;
	String rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a word");
	s=sc.nextLine();
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
		
	}
	System.out.println("rev string="+rev);
	if(s.equals(rev))
	{
		System.out.println("given string is palindrome");
	}
	else
		System.out.println("the given string is not Palindrome");
	 

	}

}
