//constuctor calling
package over.com;
class Parent1
{
	Parent1()
	{
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent1
{
	Child()
	{
		System.out.println("child class constructor");
	}
}
public class ConstructParentChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Child c1=new Child(); //create an object of child class
                          //parent class construct will execute 1st
	}                            //implict calling wil done

}
