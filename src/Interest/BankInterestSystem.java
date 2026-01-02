/*Q1. Bank Interest Calculation – Abstract Class
Abstract class: BankAccount
Fields:
accountNumber
balance
Methods:
abstract double calculateInterest()
void deposit(double amt)
void withdraw(double amt)
Child classes:
SavingAccount → interest = balance × 6%
CurrentAccount → interest = balance × 4%
FixedDepositAccount → interest = balance × 7.5%
Task:
Create an array of 6 accounts (mix of all three types).
For each, calculate interest and update balance.
Find the account with the highest interest earned.
Explanation:
This checks:
Abstract class with normal + abstract methods
Different calculation logic in child classes
Using polymorphism to store mixed objects
Finding maximum value
*/

package Interest;
import java.util.*;
public class BankInterestSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Accounts: ");
		int size = sc.nextInt();
		
		BankAccount[] accounts = new BankAccount[size];
		
		System.out.print("Enter " +size+" Bank Account: ");
		
		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter detail for account "+(i+1));
			
			System.out.print("Choose type: 1 = Saving Account, 2 = Current Account, 3 = Fixed Deposit Account\n");
			System.out.print("Enter the choice (1 / 2 / 3): ");
			int type = sc.nextInt();
			
			System.out.print("Enter account number: ");
            int accNo = sc.nextInt();
            
            System.out.print("Enter initial balance: ");
            double balance = sc.nextDouble();
            
            if(type == 1)
            {
            	accounts[i] = new SavingAccount(accNo, balance);
            }
            else if(type == 2)
            {
            	accounts[i] = new CurrentAccount(accNo, balance);
            }
            else
            {
            	accounts[i] = new FixedDepositAccount (accNo, balance);
            }
		}
		
		double maxInterest = -1;
		int maxIndex = -1;
		
		for(int i = 0; i < size; i++)
		{
			double interest = accounts[i].calculateInterest();
			interest = accounts[i].balance + interest;
			
			if(interest > maxInterest) {
				maxInterest = interest;
				maxIndex = i;
			}
		}
		
		System.out.println("\nAccount with highest interest:");
        System.out.println("Account No: " + accounts[maxIndex].accountNumber);
        System.out.println("Interest Earned: " + maxInterest);
	}

}
