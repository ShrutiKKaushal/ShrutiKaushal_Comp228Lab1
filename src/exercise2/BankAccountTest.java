package exercise2;

import javax.swing.JOptionPane;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Your Account Number:"));
		String ownerName = JOptionPane.showInputDialog(null, "Please Enter Your Name:");
		double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Your Balance:"));
		
		
		double withdrawAmount = 0;
		double depositAmount = 0;
		
		BankAccount BAccount = new BankAccount(accountNumber, ownerName, balance);
		JOptionPane.showMessageDialog(null, BAccount.getAccountInfo());
		
		//Code to deposit money
		int confirmation = JOptionPane.showConfirmDialog(null, "Would you like to deposit money?");
		
		if(confirmation == JOptionPane.YES_OPTION)
		{
			depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount you are depositing: "));
			if(depositAmount > 0) {
				JOptionPane.showMessageDialog(null,BAccount.deposit(depositAmount));
			}
			else{
				JOptionPane.showMessageDialog(null, "OOPS..! You cannot add negative amount");
			}

		}
		JOptionPane.showMessageDialog(null, BAccount.getAccountInfo());
		
		// Code To withdraw money
		confirmation = JOptionPane.showConfirmDialog(null, "Would you like to withdraw money?");
		
		if(confirmation == JOptionPane.YES_OPTION)
		{
			withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount you are withdrawing: "));
			if (BAccount.getBalance() > withdrawAmount){
				JOptionPane.showMessageDialog(null,BAccount.withdraw(withdrawAmount));
			}
			else{
				JOptionPane.showMessageDialog(null, "Sorry, your account does not have enough balance..!");
			}
			
			
		}
		JOptionPane.showMessageDialog(null, BAccount.getAccountInfo());

	}

}
