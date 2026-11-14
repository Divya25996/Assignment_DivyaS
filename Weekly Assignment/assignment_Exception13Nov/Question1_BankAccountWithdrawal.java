package assignment_Exception13Nov;
import java.util.*;
class BankAccount 
{
	String accountHolder;
	double balance;
	
	 BankAccount(String accountHolder, double balance) 
	 {
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }
	
	void withdraw(double amount) throws Exception
	{
		 if (amount < 0)
		 {
	         throw new Exception("Invalid withdrawal amount");
	     }
	     if (amount > balance)
	     {
	         throw new Exception("Insufficient balance");
	     }
	     
		balance = balance - amount;
		System.out.println("Remaining balance : "+balance);
		
	}
}
public class Question1_BankAccountWithdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount obj = new BankAccount("Rahul",10000);
		System.out.println("Account Holder: " + obj.accountHolder);
        System.out.println("Current Balance: " + obj.balance);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Withdrawal Amount: ");
        double amount = sc.nextDouble();
        
        try 
        {
        	obj.withdraw(amount);
        	
        }		
		catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("Transaction process completed");
		}
        
	}
	

}
