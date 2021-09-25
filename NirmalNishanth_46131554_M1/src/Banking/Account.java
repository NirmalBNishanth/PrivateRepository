package Banking;

import java.time.LocalDate;

public class Account 
{
	int accountNumber;
	String accountHolderName;
	double accountBalance;
	LocalDate openedDate;
	
	public Account(){}
	public Account(int accountNumber,String accountHolderName,double accountBalance,LocalDate openedDate)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.openedDate = openedDate;
		checkBalance();
	}
		
	public LocalDate getOpenedDate() {
		return openedDate;
	}
	public void setOpenedDate(LocalDate openedDate) {
		this.openedDate = openedDate;
	}
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public void setaccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	
	
	public int getAccountNumber()
	{
		return accountNumber;
	}

	public String getaccountHolderName()
	{
		return accountHolderName;
	}
	public double getAccountBalance()
	{
		return accountBalance;
	}
	
	public void showAccountDetails()
	{
		System.out.println("----------------------------------------------");
		System.out.println("Account Details");
		System.out.println("----------------------------------------------");
		System.out.println("Account Number    : "+getAccountNumber());
		System.out.println("Account Holder    : "+getaccountHolderName());
		System.out.println("Account Balance   : "+getAccountBalance());
		System.out.println("Opening Date      : "+getOpenedDate());
		System.out.println("----------------------------------------------");
	}
	
	public void checkBalance() throws InsufficientBalanceException
	{
		if(getAccountBalance() < 5000)
		{
			throw new InsufficientBalanceException(getAccountBalance() +" : is lower than the minimum Account Balance required, Enter an amount higher than 5000!");
		}
	}
	
}
