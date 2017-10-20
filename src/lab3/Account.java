package lab3;

/**
 * Account
 * 
 * @author UOrgil
 *
 */
public class Account {
	/**
	 * Balance
	 */
	private double balance;
	/**
	 * Account number
	 */
	private long accountNumber;

	/**
	 * Constructor function parameters balance and account number
	 * 
	 * @param balance
	 *            Set balance
	 * @param accountNumber
	 *            Set account number
	 */
	public Account(double balance, long accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	/**
	 * Make money on account
	 * 
	 * @param money
	 *            Money to account
	 */
	public void deposit(double money) {
		balance += money;
	}

	/**
	 * Withdraw money from the account
	 * 
	 * @param money
	 *            Money from the account
	 * @return Status
	 */
	public int withdraw(double money) {
		if (balance - money >= 0) {
			balance -= money;
			return 0;
		}
		return 1;
	}

	/**
	 * Get balance
	 * 
	 * @return return Balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Set balance
	 * 
	 * @param balance
	 *            Set balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Get account number
	 * 
	 * @return return Account number
	 */
	public long getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Set account number
	 * 
	 * @param accountNumber
	 *            Set account number
	 */
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

}
