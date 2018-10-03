public class Driver {

	public static void main(String[]args) {
		BankAccount Bank = new BankAccount(0001, 100.00 ,"SafeCase");
		System.out.println("Account " + Bank.getAccountID() + " currently has: $" + Bank.getBalance());




}
}
