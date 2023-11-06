
import java.util.Scanner;
public class Arithematic {
	int a1,b1;
	Scanner sc= new Scanner (System.in);
	void ArithematicOpertors()
	{
		System.out.println("Enter the value is::");
		a1 =sc.nextInt();
		b1 =sc.nextInt();
		System.out.println("Addition::"+(a1+b1));
		System.out.println("Sub::"+(a1-b1));
		System.out.println("Division"+(a1/b1));
		System.out.println("Multiple"+(a1*b1));
		
	}
	void RelationalOperators()
	{
		System.out.println("Lessthan::"+(a1<b1));
		System.out.println("Greaterthan::"+(a1>b1));
		System.out.println("Equalto::"+(a1==b1));
		System.out.println("NotEqual::"+(a1!=b1));
	}
	void BitwiseOperators()
	{
		a1=10;
		b1=20;
		System.out.println("BitwiseAND::"+(a1&b1));
		System.out.println("BitwiseOR::"+(a1|b1));
		System.out.println("BitwiseXOR::"+(a1^b1));
		System.out.println("RightShift::"+(a1>>1));
		System.out.println("LeftShift::"+(a1<<1));
		
	}
	public static void main(String[] args) {
		Arithematic f1=new Arithematic ();
		f1.ArithematicOpertors();
		f1.RelationalOperators();
		f1.BitwiseOperators();
	}
		
		
	}
		
		
		
		
		
	


