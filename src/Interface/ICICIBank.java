package Interface;

public class ICICIBank implements RBI{

	@Override
	public void openAcc() {
		System.out.println("ICICI bank-open account");
		
	}

	@Override
	public void depositemoney() {
		System.out.println("ICICI bank-deposite money");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("ICICI bank-withdraw money");
		
	}

}
