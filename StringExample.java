package string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Java programming";
		String s1 = "Java programming";
	
		String sobj = new String ("Java Programming");
		String sobj1 = new String ("Java Programming");
		
		System.out.println(s);

		System.out.println(s1);

		System.out.println(sobj);

		System.out.println(sobj1);
		
		
		//== operator matches the references
		//equals validate content
		
		
		System.out.println("s == s1 :"  + (s==s1));
		System.out.println("s == sobj :" + (s==sobj));
		System.out.println("s.equals(s1) :" + (s.equals(s1)));
		System.out.println("s.equals(sobj) :" + (s.equals(sobj)));
		System.out.println("sobj == sobj1) :" + (sobj == sobj1));
		System.out.println("sobj.equals(sobj1) :" + (sobj.equals(sobj1)));
		
		
		
	}

}
