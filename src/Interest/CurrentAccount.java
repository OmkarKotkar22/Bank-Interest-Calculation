package Interest;

public class CurrentAccount extends BankAccount{

	CurrentAccount(int accountNumber, double balance){
		super(accountNumber, balance);
	}
	
	double calculateInterest() {
		return balance * 0.04;
	}
}
