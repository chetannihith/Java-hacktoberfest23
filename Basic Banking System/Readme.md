# Banking System in Java

This Java program implements a simple banking system that allows users to create accounts, perform transactions (deposits), and view account information. Below are the details of the components of the program:

## Classes

### Bank
- Manages a collection of accounts using a `HashMap`.
- Provides methods to add accounts, display account information, and perform transactions.

### Account
- Represents an individual bank account.
- Contains account information such as the account number, customer name, and balance.
- Allows deposits to be made into the account.

## How to Use

1. Create a `Bank` object by instantiating it in the `main` method of the `BankingSystem` class.
2. Add accounts to the bank using the `addAccount` method. For example:
   ```java
   bank.addAccount("101", "John Doe", 1000.0);
   bank.addAccount("102", "Jane Smith", 1500.0);
   ```
3. Perform transactions (deposits) on existing accounts using the `performTransaction` method. Provide the account number and the amount to deposit. For example:
   ```java
   bank.performTransaction("101", 500.0);
   ```
   If the account does not exist, you will receive an "Account not found!" message.

4. Display account information using the `displayAccountInfo` method. Provide the account number to view the details. For example:
   ```java
   bank.displayAccountInfo("101");
   ```
   If the account does not exist, you will receive an "Account not found!" message.

## Sample Usage

In the `main` method of the `BankingSystem` class, **sample account creation, transaction, and information display** are demonstrated.

## Important Note

This program is a basic illustration of a banking system and does not include more advanced features like withdrawals, account management, or security. It serves as a starting point for a more comprehensive banking application.

Feel free to expand upon this code and add more features as needed.
