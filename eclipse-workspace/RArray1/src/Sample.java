import java.util.Scanner;
class Demo
{
	int n;
	int empid[]= new int [5];
	Scanner sc= new Scanner(System.in);
	void input() {
		System.out.println("Enter the n value is ::");
		n=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the Array value is::");
			empid[i]=sc.nextInt();
		}
	}
		void display() {
			for(int i=0;i<5;i++)
			{
			 System.out.println("Array value is::"+empid[i]);
			 
			}
		}
}
public class Sample {

	public static void main(String[] args) {
		Demo d1= new Demo();
		d1.input();
		d1.display();
		
		
	}
		
}

