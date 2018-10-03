public class BankAccount{

	private double balance;
	private int accountID;
	private String password;

	public BankAccount(double newbalance, int newAccountID, String newPassword) {
		balance = newbalance;
		accountID = newAccountID;
		password = newPassword;
	}

	public double getbalance() {
		return balance;
}

	public int getaccountID() {
		return accountID
} 


	public String toString() {
		return "" +  accountID + "\t" + balance;
	}

}
		


