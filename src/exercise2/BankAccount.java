package exercise2;

public class BankAccount {
	
	//Declaration of Instance Variables
		private int accountNumber;
		private String ownerName;
		private double balance;
		
		//Constructor
		public BankAccount(int accountNumber, String ownerName, double balance) {
			this.accountNumber = accountNumber;
			this.ownerName = ownerName;
			this.balance = balance;
		}
		
		//Get Methods 
		public int getAccountNumber() {
			return accountNumber;
		}
		
		public String getName() {
			return ownerName;
		}
		
		public double getBalance() {
			return balance;
		}
		
		// Method to withdraw money
		public double deposit(double depositAmount) {
			if (depositAmount > 0.0) // if the depositAmount is valid
				balance += depositAmount; // add it to the balance
			return balance;
		}
		
		// Method to withdraw money
		public double withdraw(double withdrawAmount) {
			if (withdrawAmount > 0.0) // if the withdrawAmount is valid
				balance -= withdrawAmount; // Subtract it from balance												
				return balance;
		}
		
		public String getAccountInfo() {
			String bankAccountInfo = String.format("Account Number: %s%n Owner's Name: %s%n Balance: %s%n", getAccountNumber(), getName(), getBalance());
			return bankAccountInfo;

		}
}
