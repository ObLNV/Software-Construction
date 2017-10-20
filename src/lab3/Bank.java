package lab3;

import java.util.List;

/**
 * Bank
 * 
 * @author UOrgil
 *
 */
public class Bank {
	/**
	 * Name
	 */
	private String name;
	/**
	 * Customers
	 */
	private List<Customer> customers;

	/**
	 * Constructor function parameters name and customers
	 * 
	 * @param name
	 *            Set name
	 * @param customers
	 *            Set customers
	 */
	public Bank(String name, List<Customer> customers) {
		this.name = name;
		this.customers = customers;
	}

	/**
	 * Add customer
	 * 
	 * @param customer
	 *            Add customer
	 */
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	/**
	 * Get customer
	 * 
	 * @param customerNumber
	 *            Search for customer number
	 * @return Customer
	 */
	public Customer getCustomer(long customerNumber) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getCustomerNumber() == customerNumber) {
				return customers.get(i);
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
	 * Get customers
	 * 
	 * @return Customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}

	/**
	 * Set customers
	 * 
	 * @param customers
	 *            Set customers
	 */
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
