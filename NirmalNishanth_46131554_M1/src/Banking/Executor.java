package Banking;

import java.time.LocalDate;

public class Executor 
{

	public static void main(String[] args) 
	{
		Account account1 = new Account(101,"Nirmal",250000,LocalDate.now());
		Transaction transaction = new Transaction(account1);
		//transaction.withdraw(account1,100000);
		//transaction.deposit(account1, 100000);
	}

}
