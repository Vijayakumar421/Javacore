import java.util.Scanner;
class Demo2
{
	int i,j,n,m;
	Scanner sc= new Scanner (System.in);
	int empid[][]=new int[2][2];
	void input()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the array value is ::");
				empid[i][j]=sc.nextInt();
				}
		}
	}
void display()
{
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			System.out.println("your array value is ::"+empid[i][j]);
			
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		Demo2 s1 =new Demo2();
		s1.input();
		s1.display();
	

	}
}
}


