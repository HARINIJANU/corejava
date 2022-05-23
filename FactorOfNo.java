package com.edu;
import java.util.Scanner;

public class FactorOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num;
	    i=1;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no:");
	    num=sc.nextInt();
	    while(i<=num)

	    {
	    	if(num%i==0)
	    	{
	    		System.out.println(i+ " ");
	    	}
	    	i++;
	    }
	    sc.close();
	}

}
