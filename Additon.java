package over.com;
class Add
{
	public void add(int i,int j)
	{
		int s=i+j;
		System.out.println("sum="+s);
	}

	public void add(float i,float j)
	{
		float s=i+j;
		System.out.println("sum="+s);
	}

	public void add(double i,double j)
	{
		double s=i+j;
		System.out.println("sum="+s);
	}


}
public class Additon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add aob1=new Add();
		aob1.add(3,3);
		aob1.add(2.3f,3.2f);
		aob1.add(3.6,4.6);
	}
}


	
