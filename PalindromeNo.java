package hari5.edu;
import java.util.Scanner;
public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int num,onum,rnum,digit;
    rnum=0;
  
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no:");
    
    num=sc.nextInt();
    onum=num;
    while(num>0)
    {
    	digit=num%10;
    	rnum=rnum*10+digit;
    	num=num/10;
    }
    

    if(onum==rnum)
    	
    {
    	System.out.println("the given number is palindrome no");
    }
    else
    	System.out.println("the given number is not an palindrome no");
	}

}
