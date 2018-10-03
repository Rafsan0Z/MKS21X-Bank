public class BankAccount{

	private double balance;
	private int accountID;
	private String password;

	public BankAccount(int newaccountID, double newbalance, String newpassword) {
		balance = newbalance;
		accountID = newaccountID;
		password = newpassword;
	}

	public double getBalance() {
		return balance;
}

	public int getAccountID() {
		return accountID;
} 

	public void setPassword(String newPass) {
		password = newPass;
}


	public String toString() {
		return "" +  accountID + "\t" + balance;
	}

	public boolean deposit(double amount) {
		if (amount < 0.00) {
			return false;
		}
		else {
			balance += amount;
			return true;
		}
	}
	
	public boolean withdraw(double amount) {
		if (balance < amount) {
			return false;
		}
		else {
			balance = balance - amount;
			return true;
		}
	}

}
		


