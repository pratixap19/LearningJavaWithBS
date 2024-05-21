package Constructor;

public class Facebook {
	
	String userId;
	int password;
	
	public Facebook(String a, int b) {
		this.userId=a;
		this.password=b;
	}
	
	public static void main(String[] args) {
		
		Facebook f = new Facebook("QA1", 12345);
		System.out.println(f.userId);
		System.out.println(f.password);
		
		Facebook f1 = new Facebook("QA2", 123456);
		System.out.println(f1.userId);
		System.out.println(f1.password);
		
		
		
		
		

	}

}
