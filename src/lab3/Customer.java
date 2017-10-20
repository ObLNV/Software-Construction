package lab3;

import java.util.List;

/**
 * Customer
 * 
 * @author UOrgil
 *
 */
public class Customer {
	/**
	 * Name
	 */
	private String name;
	/**
	 * Customer number
	 */
	private long customerNumber;
	/**
	 * Pin
	 */
	private int pin;
	/**
	 * Accounts
	 */
	private List<Account> accounts;

	/**
	 * Constructor function parameters name, customer number, pin and accounts
	 * 
	 * @param name
	 *            Set name
	 * @param customerNumber
	 *            Set customers number
	 * @param pin
	 *            Set pin
	 * @param accounts
	 *            Set accounts
	 */
	public Customer(String name, long customerNumber, int pin, List<Account> accounts) {
		this.name = name;
		this.customerNumber = customerNumber;
		this.pin = pin;
		this.accounts = accounts;
	}

	/**
	 * Get account
	 * 
	 * @param accountNumber
	 *            Search for account number
	 * @return Account
	 */
	public Account getAccount(long accountNumber) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber) {
				return accounts.get(i);
			}
		}
		return null;
	}

	/**
	 * Get name
	 * 
	 * @return Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name
	 * 
	 * @param name
	 *            Set name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get customer number
	 * 
	 * @return Customer number
	 */
	public long getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * Set customer number
	 * 
	 * @param customerNumber
	 *            Set customer number
	 */
	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * Get pin
	 * 
	 * @return Pin
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * Set pin
	 * 
	 * @param pin
	 *            Set pin
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}

	/**
	 * Get accounts
	 * 
	 * @return Accounts
	 */
	public List<Account> getAccounts() {
		return accounts;
	}

	/**
	 * Set accounts
	 * 
	 * @param accounts
	 *            Set accounts
	 */
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
