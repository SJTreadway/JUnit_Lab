/** SER 216
 * Assignment 3 - Unit Testing JUnit
 * Description: Create BankAccount & Customer classes. Create unit tests for each method and test.
 * @Author: Steven Treadway
 * @version: 1.0
 * Date: 03/29/2018
 * Time: 1 hour
 */

package core;

/**
 * BankAccount Class
 * @author steven
 *
 */
public class BankAccount {

    private String accountNumber, accountHolder;
    private double balance;
    private int accountType;
    
    /**
     * BankAccount class empty constructor
     */
    public BankAccount () {
        this.accountNumber = "none";
        this.accountHolder = "Unknown";
        this.balance = 0;
        this.accountType = 0;
    }

    /**
     * BankAccount class constructor with params
     * @param accountNumber bank account number
     * @param accountHolder bank account's holder name
     * @param balance bank account balance
     * @param accountType bank account type
     */
    public BankAccount (String accountNumber, String accountHolder, double balance, int accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        if (accountType == 1 || accountType == 2 || accountType == 3 || accountType == 4)
            this.accountType = accountType;
        else
            this.accountType = 0;
    }

    /**
     * AccountNumber getter
     * @return accountNumber
     */
    public String getAccountNumber () {
        return this.accountNumber;
    }

    /**
     * AccountNumber setter
     * @param acctNum bank account number
     */
    public void setAccountNumber (String acctNum) {
        this.accountNumber = acctNum;
    }

    /**
     * AccountHolder getter
     * @return accountHolder
     */
    public String getAccountHolder () {
        return this.accountHolder;
    }

    /**
     * AccountHolder setter
     * @param acctHolder bank account holder's name
     */
    public void setAccountHolder (String acctHolder) {
        this.accountHolder = acctHolder;
    }

    /**
     * Balance getter
     * @return balance
     */
    public double getBalance () {
        return this.balance;
    }

    /**
     * Balance setter
     * @param balance bank account balance
     */
    public void setBalance (double balance) {
        this.balance = balance;
    }

    /**
     * AccountType getter
     * @return accountType
     */
    public int getAccountType () {
        return this.accountType;
    }

    /**
     * AccountType setter
     * @param acctType bank account type
     */
    public void setAccountType (int acctType) {
        this.accountType = acctType;
    }

    /**
     * Gets interest rate based on accountType value
     * @return interestRate
     */
    public double getInterestRate () {
        switch (this.accountType) {
            case 1:
                return 0.005;
            case 2:
                return 0.045;
            case 3:
                return 0.01;
            case 4:
                return 0.15;
            default:
                return 0;
        }
    }

    /**
     * Displays total balance based on the equation: balance + (balance * interestRate / 100)
     * @return totalBalance
     */
    public double calculateTotalBalance () {
        double interestRate = getInterestRate();
        return this.balance + (this.balance * interestRate / 100);
    }

}

