package q2;

public class BankAccount implements Comparable<Object> { 
	  
	  private int accNumber;
	   private double balance; 
	  
	  public BankAccount(int accountNumber)
	  {   
	  accNumber = accountNumber;
	  balance = 0;
	  }

	  public BankAccount(int anAccountNumber, double initialBalance) {
	      accNumber = anAccountNumber; balance = initialBalance; }

	  
	  public int getAccountNumber()
	  {   
	   return accNumber;
	   } 

	  public void deposit(double amount)
	  {  
	   double newBalance = balance + amount;
	   balance = newBalance;
	  }

	   public void withdraw(double amount)
	   {   
	     double newBalance = balance - amount;
	     balance = newBalance;
	   }

	   public double getBalance()
	   {   
	     return balance;
	   }

	   public int compareTo(Object temp){ 
	     BankAccount other = (BankAccount)temp;
	     if (balance<other.balance) 
	         return -1;
	     if (balance==other.balance) 
	         return 0;
	     return 1;
	  }

	}