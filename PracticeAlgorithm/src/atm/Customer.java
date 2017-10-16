package atm;
/*If the customer is authorized
• The display shows:
Select Account
A = Checking
B = Savings
C = Exit*/

public class Customer {
	private int id;
	private int pin;
	private BankAccount checkingAccount;
	private BankAccount savingAccount;

	public Customer(int id, int pin) {

		this.id = id;
		this.pin = pin;
		checkingAccount = new BankAccount();
		savingAccount = new BankAccount();
	}

	// check account if customer can log in
	public boolean match(int id, int pin) {
		return this.id == id && this.pin == pin;
	}

	public BankAccount getCheckingAccount() {
		return checkingAccount;
	}

	public BankAccount getSavingAccount() {
		return savingAccount;
	}
}
