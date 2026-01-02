package Interest;

public class FixedDepositAccount extends BankAccount{

	FixedDepositAccount(int accountNumber, double balance){
		super(accountNumber, balance);
	}
	
	double calculateInterest() {
		return balance * 0.075;
	}
}
