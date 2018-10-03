public class Driver {

	public static void main(String[]args) {
		BankAccount Bank = new BankAccount(2381, 100.00 ,"SafeCase");
		System.out.println("Account " + Bank.getAccountID() + " currently has: $" + Bank.getBalance());
		Bank.setPassword("SafeHouse");
		 if (Bank.deposit(200.00)) {
			System.out.println("Deposit Successful!" + " Account " + Bank.getAccountID() + " now has: $" + Bank.getBalance());
		}
		if (Bank.withdraw(150.56)) {
			System.out.println("Withdraw Successful!" + " Account " + Bank.getAccountID() + "now has: $" + Bank.getBalance());
		}
		else{
			System.out.println("Withdraw Denied!" + " Account " + Bank.getAccountID() + " has insufficient balance." + "Account Balance: $" + Bank.getBalance());
		}
		if (Bank.withdraw(200.00)) {
			 System.out.println("Withdraw Successful!" + " Account " + Bank.getAccountID() + "now has: $" + Bank.getBalance());
		}
		else{
                        System.out.println("Withdraw Denied!" + " Account " + Bank.getAccountID() + " has insufficient balance." + "Account Balance: $" + Bank.getBalance());
                }
		System.out.println("Account Details: " + "AccountID: " + Bank.getAccountID() +  "." + " Balance: " + Bank.getBalance() +  "."); 
		

}
}
