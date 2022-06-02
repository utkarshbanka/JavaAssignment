package Ouestion3;

public class Account {
	private int accountId ;
	private String accountType;
	private int balance;
	
	 public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean withdraw(int amt) {
		 if(amt<=balance) {
			 balance=balance-amt;
			 setBalance(balance);
			 System.out.println("Balance after Withdraw:"+ balance);
			 return true;
		 }else {
			 System.out.println("Sorry!!! No enough balance");
			 return false; 
		 }
		
		 
	}
}
