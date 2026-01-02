package Interest;

public abstract class BankAccount {

	int accountNumber;
	double balance;
	
	BankAccount(int accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	abstract double calculateInterest();
	
	void deposit(double amt) {
		balance = balance + amt;
	}
	
	void withdraw(double amt)
	{
		if(amt <= balance)
			balance = balance - amt;
	}
}
