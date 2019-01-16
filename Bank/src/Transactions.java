/*
 * Mark Schuberth
 * 
 * Transactions class that checks for user input and
 * creates actions based off the corresponding inputs. 
 * The user can add an account, deposit money, withdraw
 * money from their account, add interest to the balance, or
 * get the balance from their account. Stores up to 50 accounts
 * but can be made to store as many accounts as you would like. 
 * 
 */

import java.util.Scanner;

public class Transactions
{
	
  public static void main (String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  Account[] manager = new Account[49];
      int acctNumber = 0;
      String name;
      int input = 0;
      
	  while(input < 5)
 	  {
        System.out.println("Input 0 to add account, 1 to deposit,");
        System.out.println("Press 2 to withdraw, 3 to add interest");
        System.out.println("Press 4 to get balance\n");
        System.out.println("");
        input = scan.nextInt();
      
        if (input == 0) 
        {

    	      if (acctNumber > 29)
    	          System.out.println("The bank can't handle any more accounts.\n");
    	      else
    	    	      System.out.println("To create an account, please enter your name: \n");
    	          name = scan.next();
    	          System.out.println("Your account number is \n"+ acctNumber);
    	      manager[acctNumber] = new Account(name, acctNumber, 0.00);
    	      acctNumber++;
    	    } 
        else if (input == 1) 
    	    {
    	      System.out.println("What is your account number?\n");
    	      int accountNumber = scan.nextInt();

    	      if (manager[accountNumber] == null) 
    	      {
    	          System.out.println("That account doesn't exist!\n");
    	      }  
    	      else 
    	      {
    	        System.out.println("How much do you want to deposit?\n");
    	        double amount = scan.nextDouble();
    	        manager[accountNumber].Deposit(amount);
    	      }
    	    }
    	    else if (input == 2) 
        {
    	      	System.out.println("What is your account number?\n");
          	int accountNumber = scan.nextInt();

      	    if (manager[accountNumber] == null) 
      	    {
      	      System.out.println("That amount is invalid!\n");
      	    } 
      	    else 
      	    {
      	      System.out.println("How much do you want to withdraw?");
      	      double amount = scan.nextDouble();
      	      manager[accountNumber].withdraw(amount);
      	    }
         }
    	     else if (input == 3) 
        	 {
      	    	System.out.println("What is your account number?");
          	int accountNumber = scan.nextInt();

        	    if (manager[accountNumber] == null) {
        	        System.out.println("That amount is invalid!");
        	    } 
        	    else 
        	    {
        	       System.out.println("Adding interest: ");
        	       double balance = scan.nextDouble();
        	       manager[accountNumber].addInterest();
        	    }
        	  }
    	     else if (input == 4) 
      	 {
    	    	    System.out.println("What is your account number?");
        	    int accountNumber = scan.nextInt();

      	    if (manager[accountNumber] == null) {
      	        System.out.println("That amount is invalid!");
      	    } 
      	    else 
      	    {
      	      System.out.println("Your account balance is: ");
      	      
  	          System.out.println(manager[accountNumber].getBalance());
      	    }
      	  }
      	}
  }    
}