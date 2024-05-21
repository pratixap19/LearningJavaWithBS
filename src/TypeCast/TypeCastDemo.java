package TypeCast;

public class TypeCastDemo {

	public static void main(String[] args) {
		//One of the powerful feature of Java.
		//We need to do type cast when you want to convert a variable from one data type to another data type
		//There are two type of type casting
		//1. Widening (automatically type cast). There is no data loss. Smaller data type to larger type
		
		byte b=35;
		System.out.println(b);
		short s=b;
		System.out.println(s);
		int i=s;
		System.out.println(i);
		long l=i;
		System.out.println(l);
		float f=l;
		System.out.println(f);
		double d=f;
		System.out.println(d);
		
		//2. Narrowing type casting
		//here there is a chance of data loss.
		
		double d1=67.867;
		System.out.println(d1);
		
		int i1=(int) d1;
		System.out.println(i1);
		
		
	}

}
