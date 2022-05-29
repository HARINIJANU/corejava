package com.inheri;

public class ThisExample {
  int i;
  ThisExample()
  {
	  System.out.println("no argu constructor");
  }
  ThisExample(int i)
  {
	  this();
	  this.i=i;
	  System.out.println("one agru cons");
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisExample ob=new ThisExample(3);
	}

}
