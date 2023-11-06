class Demo
{
	Demo()//default constructor
	{
		System.out.println("this is Demo function");
	}
	Demo(int cid, String cname)//param construct
	{
		System.out.println("this is param cons.."+cid+"cname");
	}
}

public class Sample {

	public static void main(String[] args) {
		new Demo ();
		new Demo(1001,"Vijay");
		
	}

}
