# Console Bank Application (Java)

A simple console-based **Bank Application** written in Java using Object-Oriented Programming (OOP).  
The user can choose an account type, enter basic details, and see account information and interest.

---

## Features

- Menu-driven console interface
- Three account types:
  - **SavingsAccount** – earns simple interest
  - **CurrentAccount** – no interest, has overdraft limit
  - **FixedDepositAccount** – earns interest based on term and deposit period
- Common base class `BankAccount` with:
  - Account holder name
  - Account number
  - Balance
  - Common IFSC code
- Basic validation for negative balance and empty fields

---

## Project Structure

```text
src/
└── com/
    └── sp/
        └── BankApp/
            ├── BankApplication.java        // main class with menu and user input
            ├── BankAccount.java            // base class for all accounts
            ├── SavingsAccount.java         // savings account logic
            ├── CurrentAccount.java         // current account logic
            └── FixedDepositAccount.java    // fixed deposit account logic
