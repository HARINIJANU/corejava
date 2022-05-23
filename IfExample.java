package hari.edu;
import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      num=sc.nextInt();
      if(num==0)
      {
    	  System.out.println("the given number is equal to zero");
	}
      else {
    	  System.out.println("the given number is not equal to zero");
      }
}
}
