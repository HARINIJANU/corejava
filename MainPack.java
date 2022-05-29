package com.pack1;

import com.pack2.Pack2Class;

//private,default, public,protected
class PackClass1
{ int i;          //default access specifer scope within package
   private int k;
   public int pubd;
   protected int pd;
   public void m1()
   {
	   System.out.println(k);
   }
   
   
   
}
class MyClass extends Pack2Class {
   // form other package only extended class can access protected and public data of other package

//   default and private cannot access

	public void display()
	{
		System.out.println(p2protval);
		System.out.println(p2pubval);
	}
	
}


public class MainPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PackClass1 ob=new PackClass1();
System.out.println("default"+ob.i); //default can be accessed
//System.out.println("private"+ob.k);// private not visible outsde the class
System.out.println("protected data="+ob.pd);
System.out.println("public data="+ob.pubd);


//com.pack2
     Pack2Class ob2=new Pack2Class();
     System.out.println("public data="+ob2.p2pubval);
     //System.out.println("private data="+ob2.p2prival);//private cannot access
    // System.out.println("protected data="+ob2.p2protval);//protected cannot access
     //System.out.println("default="+ob2.p2deval);// default cannot access
     
     
	}

}
