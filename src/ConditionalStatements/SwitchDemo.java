package ConditionalStatements;

public class SwitchDemo {
	
	public static void main(String[] args) {
		int user_type=4;
		switch(user_type) {
		case 1: System.out.println("Its a FB user");
		break;
		case 2: System.out.println("Its a Google user");
		break;
		case 3: System.out.println("Its a Instagram user");
		break;
		case 4: System.out.println("Its a guest user");
		break;
		default: System.out.println("None of the id found");
		break;
		}
	}
}
