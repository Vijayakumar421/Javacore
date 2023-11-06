abstract class Amouncredit
{
	abstract void credit ();
}
abstract class AmountDebit
{
	 abstract void debit();
	
}
 class Demo1 extends Amouncredit
{

	
	void credit() {
		System.out.println("this is credit function");
		
	}
	
}
 class Demo2 extends AmountDebit
 {

	
	void debit() {
		System.out.println("this is debit function");
		
		
	}
	 
 }
public class Sample {

	public static void main(String[] args) {
		Demo1 f1=new Demo1(); //Factory method 
		f1.credit();
		AmountDebit f2=new Demo2();
		f2.debit();
		
		
	}

}
