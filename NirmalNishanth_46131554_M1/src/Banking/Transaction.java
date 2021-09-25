package Banking;

public class Transaction extends Account
{
	Account account;
	double amount;
	
	public Transaction() {}
	public Transaction(Account account)
	{		
		this.account = account;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void showTransactionDetails()
	{
		System.out.println("\n---------------------------------------------");
		System.out.println("Account Details");
		System.out.println("----------------------------------------------");
		System.out.println("Account Number      : "+getAccount().getAccountNumber());
		System.out.println("Account Holder      : "+getAccount().getaccountHolderName());
		System.out.println("Account Balance     : "+getAccount().getAccountBalance());
		System.out.println("Opening Date        : "+getAccount().getOpenedDate());
		System.out.println("\n---------------------------------------------");
		System.out.println("Transaction Details");
		System.out.println("----------------------------------------------");
		
	}
	public void deposit(Account account, double amount)
	{
		account.setAccountBalance(getAccount().getAccountBalance()+amount);
		showTransactionDetails();
		System.out.println("Amount Deposited    :"+amount);
		System.out.println("Total Amount        :"+(account.getAccountBalance()+amount));
	}
	public void withdraw(Account account, double amount) throws InsufficientBalanceException
	{
		double balance = account.getAccountBalance();
		if(balance - amount >= 5000)
		{
			account.setAccountBalance(balance - amount);
			showTransactionDetails();
			System.out.println("Amount Withdrawn    :"+amount);
			System.out.println("Account Balance     :"+(account.getAccountBalance()-amount));
		}
		else
		{
			throw new InsufficientBalanceException(balance-amount +": is not sufficient as minimun deposit");
		}
	}
}
