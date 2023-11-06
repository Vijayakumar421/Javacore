import java.util.Scanner;
public class Sample {
	int empid;
	String empname;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid is::");
		empid = sc.nextInt();
		System.out.println("Enter the empname is::");
		empname = sc.next();
			
	}
	void display() {
		System.out.println("Your empid is::"+empid);
		System.out.println("Your emp name is::"+empname);
	}
	
	public static void main(String[] args) {
		Sample S1= new Sample();
		S1.input();
		S1.display();
	}

}
