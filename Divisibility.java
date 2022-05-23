//to find the gven no is divisible by 3 and 5 
package hari.edu;
import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number");
   num=sc.nextInt();
   if(num%3==0 && num%5==0)
   {
	   System.out.println(num+" is divisible by 3 and 5");
	  }
   else if(num%3==0)
   {
	   System.out.println(num+" is divisible by 3");
	   }
   else if(num%5==0)
   {
	   System.out.println(num+" is divisible by 5");
	   }
   else
	   System.out.println(num+" is not divisible by 3 and 5");
   }

}
