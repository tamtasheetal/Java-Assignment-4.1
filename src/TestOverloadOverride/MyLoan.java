package TestOverloadOverride;

//This is an example of method Overloading and Overriding
public class MyLoan
{
	private double interestRate; 
	private String customer; 
	private String lender; 
	public static MyLoan createLoan(String lender)
	{
	MyLoan loan = new MyLoan(); 
	loan.lender = lender; 
	return loan;
	} 
	public static MyLoan createLoan(String lender, double interestRate)
	{
		return null; 
	
	}
	{
		System.out.println("My Loan has interest rate 12.5");
	
	 }
}

