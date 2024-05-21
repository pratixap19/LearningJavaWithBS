package Interface;

public class HDFCBank implements RBI{

	@Override
	public void openAcc() {
		System.out.println("HDFC bank-open account");
		
	}

	@Override
	public void depositemoney() {
		System.out.println("HDFC bank-deposite money");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("HDFC bank-withdraw money");
		
	}

}
