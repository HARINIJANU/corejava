package com.edu;
import java.util.Scanner;
public class CountOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num,count;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no:");
    num=sc.nextInt();
    count=0;
    while(num>0)
    {
    	num=num/10;
    	count++;
    }
    System.out.println("no of digit = " +count);
	}

}
