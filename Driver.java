public class Driver {

	public static void main(String[]args) {
		BankAccount Bank = new BankAccount(0001, 100.00 ,"SafeCase");
		System.out.println("Account " + Bank.getAccountID() + " currently has: $" + Bank.getBalance());
		Bank.setPassword("SafeHouse");
		 if (Bank.deposit(200.00)) {
			System.out.println("Deposit Successful!" + " Account " + Bank.getAccountID() + " now has: $" + Bank.getBalance());
		}



}
}
