package main.VW6.BankAccount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount = null;

    @BeforeEach
    void setup() {
        bankAccount = new BankAccount();
    }

    @Test
    void currentBalance() {
        Assertions.assertEquals(0, bankAccount.currentBalance());
    }

    @Test
    void deposit() {
        bankAccount.deposit(10);
        Assertions.assertEquals(10, bankAccount.currentBalance());
    }

    @Test
    void withdraw() {
        bankAccount.deposit(10);
        Assertions.assertTrue(bankAccount.withdraw(5));
        Assertions.assertEquals(5, bankAccount.currentBalance());
        Assertions.assertFalse(bankAccount.withdraw(10));
    }

    @Test
    void testToString() {
        Assertions.assertEquals("+0,00€", bankAccount.toString());
    }
}