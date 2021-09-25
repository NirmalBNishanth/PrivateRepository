package TaxCalculator;

public class TaxCalculator 
{	
	public static double taxableAmount(double monthlySalary)
	{
		double annualSalary = (monthlySalary *12);
		double tax;
		double TaxChoiceA;
		double TaxChoiceB;
		double TaxChoiceC;
		double TotalTax;

			
	    if(annualSalary<=250000)
	    {
	        tax = 0;
	        TotalTax = tax;
	    }
	    else if (annualSalary > 250000 && annualSalary <= 500000)
	    {
	        TaxChoiceA = (annualSalary - 250000)* .10;
	        TotalTax = TaxChoiceA;
	    }
	    else if ((annualSalary >500000) && (annualSalary <= 1000000))
	    {
	        TaxChoiceA = (annualSalary - 250000) * .10;
	        TaxChoiceB = (annualSalary - 500000) * .20;
	        TotalTax = TaxChoiceA + TaxChoiceB;
	    }
	    else if ((annualSalary > 1000000))
	    {
	        TaxChoiceA = (annualSalary - 250000) * .10;
	        TaxChoiceB = (annualSalary - 500000) * .20;
			TaxChoiceC = (annualSalary - 1000000) * .30;
	        TotalTax = TaxChoiceA + TaxChoiceB + TaxChoiceC;
	    }
		else
		{
			TotalTax = 0;
		}
		
		return TotalTax;
	}
}
