//to find electricity bill
package hari4.edu;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int units;
      float amount,surcharge;
      String name;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the name");
      name=sc.nextLine();
      System.out.println("enter the units");
      units=sc.nextInt();
      if(units>0 && units<=100) {
    	  amount=units*2;
      }
      else if(units>=100 && units<=300)
    	  amount=100*2.0f+(units-100)*3.0f;
      else
      {
    	  amount=100*2.0f+200*3.0f+(units-300)*5.0f;
    	  surcharge=(amount*2.5f)/100;
    	  amount=amount+surcharge;
    	 
      }
      System.out.println("name of the customer:" +name);
      System.out.println("number of units:" +units);
      System.out.println("bill amount:" +amount);
      sc.close();
      
	}

}
