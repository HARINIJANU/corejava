// program to find area of different figures using user input
package hari2.edu;

import java.util.Scanner;

public class AreaOfFigures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       float length,breadth,side,radius,base,height,area;
       
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Area of rectangle");
       
       System.out.println("enter the length");
       length=sc.nextFloat();
       System.out.println("enter the breadth");
       breadth=sc.nextFloat();
       area=length*breadth;
       System.out.println("Area of rectangle is "+area +"sq.units");

       System.out.println("area of triangle");
       System.out.println("enter the height");
       height=sc.nextFloat();
       System.out.println("enter the base");
       base=sc.nextFloat();
       area=1/2f*base*height;
       System.out.println("Area of triangle is "+area +"sq.units");
 
       System.out.println("enter the circle");
       System.out.println("enter the radius");
       radius=sc.nextFloat();
       area=3.14f*radius*radius;
       System.out.println("Area of circle is "+area +"sq.units");
    		   
       System.out.println("area of square");
       System.out.println("enter the side");
       side=sc.nextFloat();
       area=side*side;
       System.out.println("Area of square is "+area +"sq.units");
              
	}
}
       
       
	


