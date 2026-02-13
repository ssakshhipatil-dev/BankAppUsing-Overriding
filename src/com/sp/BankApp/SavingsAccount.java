package com.sp.BankApp;

public class SavingsAccount extends BankAccount {
    protected double interestRate = 4.0;

    SavingsAccount(String accountHolderName, String accountNumber, double balance)
    {
        super(accountHolderName, accountNumber, balance);
       // this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
      double interest = balance * (interestRate / 100);
        System.out.println("Savings Account Interest RS: " + interest);
    }
    
    @Override
    public void displayAccountDetails()
    {
    	   super.displayAccountDetails();
           calculateInterest();
     
       
    }
}

