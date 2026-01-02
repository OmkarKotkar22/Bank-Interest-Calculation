package Interest;

public class SavingAccount extends BankAccount {

	SavingAccount(int accountNumber, double balance)
	{
		super(accountNumber, balance);
	}
	
	double calculateInterest()
	{
		return balance * 0.06;
	}
}
