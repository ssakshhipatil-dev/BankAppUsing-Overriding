package com.sp.BankApp;

public class FixedDepositAccount extends BankAccount
{
    protected double interestRate = 6.5;
    protected int depositTerm;

    FixedDepositAccount(String accountHolderName, String accountNumber, double balance, int depositTerm)
    {
        super(accountHolderName, accountNumber, balance);
       // this.interestRate = interestRate;
    
        if (depositTerm < 0)
        {
            System.err.println("Deposit term must be positive.");
        }
             this.depositTerm = depositTerm;
    }

    @Override
	public void calculateInterest()
    {
        double intrest = balance * (interestRate / 100)* depositTerm;
        System.out.println("Fixed Deposit Interest for " + depositTerm + " years RS: " + intrest);
    }
    
    
    @Override
    public void displayAccountDetails()
    {
    	   super.displayAccountDetails();
           calculateInterest();
         
       
    }

}