

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // Additional methods for checking accounts, e.g., writing checks
}

class LoanAccount extends BankAccount {
    private double loanInterestRate;

    LoanAccount(String accountNumber, double initialBalance, double loanInterestRate) {
        super(accountNumber, initialBalance);
        this.loanInterestRate = loanInterestRate;
    }

    // Additional methods for loan accounts, e.g., calculating interest
}


public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000.0, 2.5);
        CheckingAccount checking = new CheckingAccount("CA456", 1500.0);
        LoanAccount loan = new LoanAccount("LA789", -5000.0, 5.0);

        savings.addInterest();
        checking.withdraw(200.0);
        loan.deposit(100.0);

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());
        System.out.println("Loan Account Balance: " + loan.getBalance());
    }
}