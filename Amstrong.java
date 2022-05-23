package com.edu;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num,rev,dig=0,temp=0;
   Scanner sc=new Scanner(System.in);
		   num=sc.nextInt();
   temp=num;
   while(num>0)
   {
	   rev=num%10;
	   dig=dig+(rev*rev*rev);
	   num=num/10;
   }
   System.out.println(+dig);
   if(dig==temp)
	   
   {
	   System.out.println("it is amstrong no");
   }
   else
	   System.out.println("it is not amstrong no");
	}

}
