
import java.util.Scanner;
public class Vijay {
	int a1;
	int b1;
	Scanner sc = new Scanner(System.in);
	void AssignmentOperators()
	{
		System.out.println("Enter the value is::");
		a1= sc.nextInt();
		b1= sc.nextInt();
		System.out.println("Your value is::"+a1);
		System.out.println("Your  value is::"+b1);	
	}
	public static void main(String[] args) {
		Vijay S1= new Vijay();
		S1.AssignmentOperators();
		
		
		

	}

}
