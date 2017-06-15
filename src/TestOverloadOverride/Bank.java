package TestOverloadOverride;

public class Bank
{
public static void main(String[] args) 
{ 
// This is the example of method Overloading 
	
MyLoan cheapLoan = MyLoan.createLoan("Home Loan"); 
MyLoan veryCheapLoan = MyLoan.createLoan("Central Bank", 12.5); 

//This is the example of method overriding 

MyLoan HomeLoan = new MyHomeLoan();
HomeLoan.toString();
{
	System.out.println("Home Loan from Central Bank, 12.5%");
}

}
} 


