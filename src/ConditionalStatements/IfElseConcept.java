package ConditionalStatements;

public class IfElseConcept {

	public static void main(String[] args) {
		int age=18;
		if(age<18) {
			System.out.println("You can't go to party");
		}
		else if(age>=18 && age<50) {
			System.out.println("Enjoy party");
		}
		else {
			System.out.println("You are too old for party");
		}

	}

}
