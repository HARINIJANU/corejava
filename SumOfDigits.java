package hari5.edu;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,digit,sum;
		sum=0;
		 Scanner sc=new Scanner(System.in);
		    System.out.println("enter the no:");
		    
		    num=sc.nextInt();
		    
		    while(num>0)
		    {
		    	digit=num%10;
		    	sum=sum+digit;
		    	num=num/10;
		    }
		    System.out.println("sum of digit: "+sum);


	}

}
