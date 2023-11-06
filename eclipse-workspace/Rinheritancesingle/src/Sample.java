import java.util.Scanner;

class B
{
	int pid,pprice;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("enter the value is::");
		pid=sc.nextInt();
		pprice=sc.nextInt();
		
	}
}

	class D extends B
	{
		void get2()
		{
			System.out.println("Your pid is::"+pid+"Your pprice::"+pprice);
		}
	}
	
public class Sample {

	public static void main(String[] args) {
		 D f1=new D();
		f1.get1();
		f1.get2();
	
		
		
		

	}

}
