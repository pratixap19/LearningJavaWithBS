package ConditionalStatements;

public class Test {

	public static void main(String[] args) {
		
		if(20>18) {
			System.out.println(true);
		}
		
		int day=4;
//		if(day==5) {
//			System.out.println("It is thursday");
//		}
//		else {
//			System.out.println("No match found");
//		}
		
		if(day==1) {
			System.out.println("It is Monday");
		}
		else if(day==2) {
			System.out.println("It is Tuesday");
		}
		else if(day==3) {
			System.out.println("It is Wednesday");
		}
		else if(day==4) {
			System.out.println("It is Thirsday");
		}
		else {
			System.out.println("No match found");
		}

	}

}
