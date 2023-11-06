import java.util.Scanner;

class B
{
	int cid,cname;
	String cphone;
	Scanner sc= new Scanner(System.in);
	void get1 ()
	{
		System.out.println("Enter the pid and cname is::");
		cid =sc.nextInt();
		cname =sc.nextInt();
		
		
	}
}
class D1 extends B
{
	void get2 ()
	{
		System.out.println("Enter the cphone is::");
		cphone =sc.next();
		
	}
}
class D2 extends B
{
	void get3 ()
	{
		System.out.println("your cid is::"+cid+"your cname is +cname");
		
	}
public class Sample {

	public static void main(String[] args) {
		f1 get =new f2();
		 g1.get1 ();
		 g2.get2();
		 g3.get3();
		
	}

}

