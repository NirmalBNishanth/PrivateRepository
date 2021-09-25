package TaxCalculator;

import java.util.Scanner;

public class Executor 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----------------------------------------------------");
		System.out.print("Enter your monthy Salary: ");
		double salary = sc.nextDouble();
		System.out.println("Your taxable income is Annualy is: "+TaxCalculator.taxableAmount(salary));
		System.out.println("----------------------------------------------------");
	}

}
