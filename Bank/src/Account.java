/*
 * Mark Schuberth
 * 
 * Sets up account class so each account will allow for a name,
 * account number, and balance. Creates functions that allow for
 * deposit, withdrawal, adding interest, and getting account
 * balance information. 
 * 
 */

import java.text.NumberFormat;

public class Account
{
	//formats currency into a currency form
	private NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
	//class variables that can be accessed through constructor
	private int acctNumber;
	private double balance;
	private String name;
	//contructor for account, balance, and name of customer
	public Account(String customer, int account, double value)
	{
		name = customer;
		acctNumber = account;
		balance = value;
	}
	//method that deposits an amount input by the user as long 
	//as amount is over 0
	public double Deposit(double amount)
	{
		if (amount < 0)  
	      {
	         System.out.println ();
	         System.out.println ("Error: Deposit amount is invalid.");
	         System.out.println (acctNumber + "  " + fmt.format(amount));
	      }
	      else
	      {
	         balance = balance + amount;
	      }
	      return balance;
	   }
	
	public double withdraw (double amount)
    {

    if (amount < 0) 
    {
       System.out.println ();
       System.out.println ("Error: Withdraw amount is invalid.");
       System.out.println ("Account: " + acctNumber);
       System.out.println ("Requested: " + fmt.format(amount));
    }
    else
       if (amount > balance)  
       {
         System.out.println ();
         System.out.println ("Error: Insufficient funds.");
         System.out.println ("Account: " + acctNumber);
         System.out.println ("Requested: " + fmt.format(amount));
         System.out.println ("Available: " + fmt.format(balance));
       }
       else
       {
         balance = balance - amount;
       }
      	 return balance;
       }

	
	public double addInterest()
	{
		balance += (balance * 1.03);
		return balance;
	}
	
	public double getBalance ()
	   {
	      return balance;
	   }

	   public long getAccountNumber ()
	   {
	      return acctNumber;
	   }

	   public String toString ()
	   {
	      return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	   }
	}