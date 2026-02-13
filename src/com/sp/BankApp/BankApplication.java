package com.sp.BankApp;

 import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the Account Type:");
        System.out.println("1) Saving Account");
        System.out.println("2) Current Account");
        System.out.println("3) Fixed Deposit Account");
        System.out.print("Please enter the type of account you want to open: [1/2/3] ");
       
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice)
        {
         case 1:
            	System.out.print("Enter account holder name: ");
                String name = sc.nextLine();
                
                System.out.print("Enter account number: ");
                String num = sc.nextLine();
                
                System.out.print("Enter initial balance: ");
                double bal = sc.nextDouble();
                sc.nextLine(); // Consume newline after double
              
                SavingsAccount s = new SavingsAccount(name, num, bal);
                System.out.println("\n--- Savings Account Created Successfully ---");
                
                s.displayAccountDetails();
               // s.calculateInterest();
                break;

         case 2:
            	System.out.print("Enter account holder name: ");
                name = sc.nextLine();
                
                System.out.print("Enter account number: ");
                num = sc.nextLine();
                
                System.out.print("Enter initial balance: ");
                bal = sc.nextDouble();
                sc.nextLine();
                      
                CurrentAccount c = new CurrentAccount(name, num, bal);
                System.out.println("\n--- Current Account Created Successfully ---");
                
                c.calculateInterest();
                c.displayAccountDetails();
                c.checkOverdraftLimit();
                break;
         case 3:
            	System.out.print("Enter account holder name: ");
                name = sc.nextLine();
                
                System.out.print("Enter account number: ");
                num = sc.nextLine();
                
                System.out.print("Enter initial balance: ");
                bal = sc.nextDouble();
                sc.nextLine();
                
                System.out.print("Enter deposit term (years): ");
                int depositTerm = sc.nextInt();
                sc.nextLine();
                
                FixedDepositAccount fd = new FixedDepositAccount(name, num, bal, depositTerm);
                System.out.println("\n--- Fixed Deposit Account Created Successfully ---");
                
                fd.calculateInterest();
                fd.displayAccountDetails();          
                break;
                
        default:
                System.out.println("Invalid choice.");
                
        }
        sc.close();
    }
}


