// Design an abstract class `BankAccount` with methods `deposit()`, `withdraw()`, and `calculateInterest()`. Implement subclasses `SavingsAccount` and `CurrentAccount`.

abstract class BankAccount {

    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract String deposit(double amount);

    abstract String withdraw(double amount);

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {

    private final double minimumBalance = 1000;
    private final double interestRate = 5;

    SavingsAccount(double balance) {
        super(balance);

        if (balance < minimumBalance) {
            System.out.println("Minimum balance should be $1000");
            this.balance = minimumBalance;
        }
    }

    @Override
    String deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            return "$" + amount + " credited successfully...";
        }

        return "Invalid deposit amount...";
    }

    @Override
    String withdraw(double amount) {

        if (amount <= 0) {
            return "Invalid withdrawal amount...";
        }

        double remainingBalance = balance - amount;

        if (remainingBalance >= minimumBalance) {
            balance -= amount;
            return "$" + amount + " debited successfully...";
        }

        return "Withdrawal failed! Minimum balance must be maintained...";
    }

    @Override
    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void showBalance() {
        System.out.println("Savings Account Balance: $" + balance);
    }
}

class CurrentAccount extends BankAccount {

    private final double interestRate = 2;

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    String deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            return "$" + amount + " credited successfully...";
        }

        return "Invalid deposit amount...";
    }

    @Override
    String withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return "$" + amount + " debited successfully...";
        }

        return "Insufficient balance...";
    }

    @Override
    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void showBalance() {
        System.out.println("Current Account Balance: $" + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount(10000);

        System.out.println(acc1.deposit(5000));
        System.out.println(acc1.withdraw(12000));
        System.out.println("Savings Interest: $" + acc1.calculateInterest());

        System.out.println();

        BankAccount acc2 = new CurrentAccount(20000);

        System.out.println(acc2.deposit(3000));
        System.out.println(acc2.withdraw(5000));
        System.out.println("Current Interest: $" + acc2.calculateInterest());
    }
}