package over.com;
class AreaCalculation
{
	public void area(int side)
	{
		int square=side*side;
		System.out.println("display area of square:"+square);
	}
	public void area(int l,int b)
	{
		int rectangle=l*b;
		System.out.println("display area of rectangle:"+rectangle);
	}
	public void area(float r)
	{
		float circle=3.14f*r*r;
		System.out.println("display area of circle:"+circle);
	}
	public void area(float b,float h)
	{
		float triangle=0.5f*b*h;
		System.out.println("display area of triangle:"+triangle);
	}
}
public class AreaOfCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AreaCalculation aob=new AreaCalculation();
aob.area(8);
aob.area(6,4);
aob.area(3.4f);
aob.area(3.2f,2.3f);
	}

}
