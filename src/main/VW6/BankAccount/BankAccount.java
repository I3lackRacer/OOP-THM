package main.VW6.BankAccount;

public class BankAccount {
    double balance = 0;
    double currentBalance() {
        return balance;
    }
    void deposit(double amount) {
        assert amount > 0.0;
        balance += amount;
    }
    boolean withdraw(double amount) {
        assert amount > 0.0;
        if (balance - amount >= 0.0) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public String toString() {
        return String.format("%+.2f€", balance);
    }
}
