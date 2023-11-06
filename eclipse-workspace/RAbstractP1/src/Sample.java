abstract class Demo
{
	abstract void get1();
	void get2()
	{
		System.out.println("this is a get2 function");
	}
}
class D extends Demo
{

	
	void get1() {
		System.out.println("this is abstraction function::");
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
		D f1=new D ();
		f1.get1();
		f1.get2();
		
		
	}

}
