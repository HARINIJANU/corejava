package com.inheri;
class Add
{
	static int i=1;
	int j;
	Add()
	{
		j=1;
	}
	void nonStaticMethod()
	{
		i=i+1;
		j=j+1;
		System.out.println("static i="+i);
		System.out.println("non static i="+j);
	}

	
static	void staticMethod()
{
		i=i+1;// static method can access only static data
		//j=j+1;//static method cannot access non static
		System.out.println("static i="+i);
		//System.out.println("non static i="+j);//
}

}
class Sub extends Add{
	void nonStaticMethod()
	{//  non static method can override
	}
	static void staticMethod(){//static method can override
	
	
}
}
public class StaticMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Add aob=new Add();
	Add aob1=new Add();
	aob.nonStaticMethod();
	aob1.nonStaticMethod();
	Add.staticMethod();
	Sub.staticMethod();// static method can access using class because static methd belong to class

}
}



