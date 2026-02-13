package com.sp.BankApp;

public class CurrentAccount extends BankAccount
{
    protected double overdraftLimit = 5000.0;

    CurrentAccount(String accountHolderName, String accountNumber, double balance) 
    {
        super(accountHolderName, accountNumber, balance);
      
    }

    @Override
	public void calculateInterest() 
    {
        System.out.println("Current accounts do not earn interest.");
    }

    public void checkOverdraftLimit() 
    {
        System.out.println("Overdraft limit RS: " + overdraftLimit);
    }
    
    @Override
    public void displayAccountDetails()
    {
        super.displayAccountDetails();
        calculateInterest();
        checkOverdraftLimit();
    }
}

