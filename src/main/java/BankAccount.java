import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
          */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    /**
     *
     * @param name Name of the owner.
     * @param accountCategory The type of account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @return the account number
     */
    public int getAccountNum() {
        return this.accountNumber;
    }

    /**
     * Sets the account number.
     * @param accountNumber the account number
     */
    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return the account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     *
     * @param accountType The type of account the owner has with the bank.
     */
    public void setAccountType(final BankAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     *
     * @return the account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param accountBalance the balance to be set
     */
    public void setAccountBalance(final double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     *
     * @return
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param ownerName
     */
    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     *
     * @return
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @param interestRate
     */
    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     *
     * @return
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param interestEarned
     */
    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }
}