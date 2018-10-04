public class Driver {

	public static void main(String[]args) {
		BankAccount Bank = new BankAccount(10000.00 ,2381, "SafeCase");
		BankAccount Me = new BankAccount(50.00 , 4376 , "DepositFund");
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
		if (Bank.transferTo(Me, 1500.00 , "Please")) {
			System.out.println("Transfer Successful");
		}
		else {
			System.out.println("Transfer Error! You currently have: $" + Bank.getBalance() + ". Make sure you have enough funds and check your password"); 
		}
		if (Bank.transferTo(Me, 1500.00 , "DepositFund")) {
                        System.out.println("Transfer Successful");
                }                                                  
                else {
                        System.out.println("Transfer Error! You currently have: $" + Bank.getBalance() + ". Make sure you have enough fund and check your password");
                }
		System.out.println("Balance of account# " + Bank.getAccountID() + " is: $" + Bank.getBalance() + " .");
		System.out.println("Balance of account# " + Me.getAccountID() + " is: $" + Me.getBalance() + " .");   
}
}
