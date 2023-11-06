
public class Sample {

	public static void main(String[] args) {
		String s1="hai";
		String s2=new String("hai");
		System.out.println("withinstance::"+s1);
		System.out.println("withoutinstance::"+s2.length());
		System.out.println("Firstpos::"+s2.charAt(0));
		System.out.println("Index::"+s2.indexOf('e'));
		System.out.println("joining::"+s2.concat(s1));
		System.out.println("compare::"+s2.compareTo(s1));
		System.out.println("Equal of::"+s1.equals("hai"));
		
		
		
	}

}
