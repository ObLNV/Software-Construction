package lab3;

/**
 * ATM
 * 
 * @author UOrgil
 *
 */
public class ATM {
	/**
	 * Bank
	 */
	private Bank bank;
	/**
	 * State
	 */
	private int state;
	/**
	 * Current customer
	 */
	private Customer currentCustomer;
	/**
	 * Current account
	 */
	private Account currentAccount;

	/**
	 * Constructor function parameters bank, state, current customer and current
	 * account
	 * 
	 * @param bank
	 *            Set bank
	 * @param state
	 *            Set state
	 * @param currentCustomer
	 *            Set current customer
	 * @param currentAccount
	 *            Set current account
	 */
	public ATM(Bank bank, int state, Customer currentCustomer, Account currentAccount) {
		this.bank = bank;
		this.state = state;
		this.currentCustomer = currentCustomer;
		this.currentAccount = currentAccount;
	}

	/**
	 * Withdraw money from the account
	 * 
	 * @param money
	 *            Money from the account
	 * @return Status
	 */
	public int withdraw(long money) {
		return currentAccount.withdraw(money);
	}

	/**
	 * Get bank
	 * 
	 * @return Bank
	 */
	public Bank getBank() {
		return bank;
	}

	/**
	 * Set bank
	 * 
	 * @param bank
	 *            Set bank
	 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	/**
	 * Get state
	 * 
	 * @return State
	 */
	public int getState() {
		return state;
	}

	/**
	 * Set state
	 * 
	 * @param state
	 *            Set state
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * Get current customer
	 * 
	 * @return Current customer
	 */
	public Customer getCurrentCustomer() {
		return currentCustomer;
	}

	/**
	 * Set current customer
	 * 
	 * @param currentCustomer
	 *            Set current customer
	 */
	public void setCurrentCustomer(Customer currentCustomer) {
		this.currentCustomer = currentCustomer;
	}

	/**
	 * Get current account
	 * 
	 * @return Current account
	 */
	public Account getCurrentAccount() {
		return currentAccount;
	}

	/**
	 * Set current account
	 * 
	 * @param currentAccount
	 *            Set current account
	 */
	public void setCurrentAccount(Account currentAccount) {
		this.currentAccount = currentAccount;
	}

}
