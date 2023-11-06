class Demo
{
	void get(int pid,String pname)
	{
		System.out.println("your pid is::"+pid+"your pname is::"+pname);
	}
	void get(int cid)
	{
		
		System.out.println("your cid is::"+cid);
	}
}

public class Sample {

	public static void main(String[] args) {
		Demo f1= new Demo();
		f1.get(1001,"apple");
		f1.get(2001);
		
		
		
		
	}

}
