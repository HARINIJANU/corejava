//to find the largest of three number
package hari.edu;
import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num1,num2,num3;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the numbers");
    num1=sc.nextInt();
    num2=sc.nextInt();
    num3=sc.nextInt();
   int large=num3>(num1>num2?num1:num2)?num3:((num1>num2)?num1:num2);
   System.out.println("the large of three number is "+large);
   }

}
