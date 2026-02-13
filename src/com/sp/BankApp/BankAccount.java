package com.sp.BankApp;

//BLC class: BankAccount
public class BankAccount {
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;

    public static final String IFSC_CODE = "SBIHYD151285";

    BankAccount(String accountHolderName, String accountNumber, double balance) 
    {
        
        if (accountHolderName== null)
        {
            System.err.println("Account holder name cannot be null or empty.");
        }
        this.accountHolderName = accountHolderName;
       
        if (accountNumber == null )
        {
            System.err.println(" Account number cannot be empty.");
        } this.accountNumber = accountNumber;

        if (balance < 0)
        {
        	throw new IllegalArgumentException("Balance cannot be negative.");
        }        this.balance = balance;
    }

    public void calculateInterest()
    {
        System.out.println("Generic interest calculation.");
    }

    public void displayAccountDetails()
    {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance RS: " + balance);
        System.out.println("IFSC CODE: " + IFSC_CODE);
    }
}

