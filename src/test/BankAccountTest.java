package test;

import core.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	private BankAccount account1, account2, account3, account4, account5, accountDefault;

	@BeforeEach
	public void setUp() throws Exception {
		account1 = new BankAccount("1", "A", 50000, 1);
        account2 = new BankAccount("2", "B", 100000, 2);
        account3 = new BankAccount("3", "C", 500, 3);
        account4 = new BankAccount("4", "D", 1000, 4);
        account5 = new BankAccount("5", "E", 100, 5);
        accountDefault = new BankAccount();
	}

	@AfterEach
	public void tearDown() throws Exception {
		account1 = null;
        account2 = null;
        account3 = null;
        account4 = null;
        account5 = null;
        accountDefault = null;
	}

	@Test
	public void testGetInterestRate() {
        assertEquals(0.005, account1.getInterestRate(), "Account 1 should have an interest rate of 0.005");
        assertEquals(0.045, account2.getInterestRate(), "Account 2 should have an interest rate of 0.045");
        assertEquals(0.01, account3.getInterestRate(), "Account 3 should have an interest rate of 0.01");
        assertEquals(0.15, account4.getInterestRate(), "Account 4 should have an interest rate of 0.15");
        assertEquals(0, account5.getInterestRate(), "Account 5 should have an interest rate of 0");
        assertEquals(0, accountDefault.getInterestRate(), "Account Default should have an interest rate of 0");
    }

	@Test
    public void testCalculateTotalBalance() {
        assertEquals(50002.5, account1.calculateTotalBalance(), "Account 1 should have a total balance of 50002.5");
        assertEquals(100045, account2.calculateTotalBalance(), "Account 2 should have a total balance of 100045");
        assertEquals(500.05, account3.calculateTotalBalance(), "Account 3 should have a total balance of 500.05");
        assertEquals(1001.5, account4.calculateTotalBalance(), "Account 4 should have a total balance of 1001.5");
        assertEquals(100, account5.calculateTotalBalance(), "Account 5 should have a total balance of 100");
        assertEquals(0, accountDefault.calculateTotalBalance(), "Account Default should have a total balance of 0");
    }

}
