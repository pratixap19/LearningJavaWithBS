package String;

public class StringDemo {

	public static void main(String[] args) {
		
		String a = "Wel";
		//1st approch on concatination
		//a=a.concat("come Java");
		//2nd approch on concatination
		a=a+"come Java";
		System.out.println(a);
		
		//How can you convert String object created inside HEAP memory to object created in SCP?
		//meaning convert object created with new keyword to object created with String literal in SCP
		String s1=new String("Mary").intern();//it will convert into string literal
		System.out.println(s1);
		
		String b = new String("Come");
		String c = "Virat";
		String d = "Wel";
		String f = new String("Come");
		
		System.out.println(a==d);//reference comparision or memory address comparision
		System.out.println(b==f);//reference comparision or memory address comparision
		
		System.out.println(a.equals(d)); //values comparision
		System.out.println(b.equals(f)); //values comparision
		
		StringBuffer sb=new StringBuffer("Virat");
		sb.append("Kohli");
		System.out.println(sb);
		
		StringBuilder sc=new StringBuilder("Rohit");
		sc.append("Sharma");
		System.out.println(sc);

	}

}
