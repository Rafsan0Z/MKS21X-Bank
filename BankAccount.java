public class BankAccount{

	private double balance;
	private int accountID;
	private String password;

	public BankAccount(double newbalance, int newAccountID, String newPassword) {
		balance = newbalance;
		accountID = newAccountID;
		password = newPassword;
	}

	public double getBalance() {
		return balance;
}

	public int getAccountID() {
		return accountID
} 

	public void setPassword(String newPass) {
		password = newPass;
}


	public String toString() {
		return "" +  accountID + "\t" + balance;
	}

}
		


