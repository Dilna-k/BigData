package javapackage;
import java.util.Scanner;

class Customer
{
	String customer_name;
	int no_prdts,quantity;
	float price;
	float total=0;
	int salary=10000;
	float percnt;
	void acceptValue()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Customer name");
		customer_name=sc.next();
		System.out.println("Enter number of products purchased");
		no_prdts=sc.nextInt();

		for(int i=1;i<=no_prdts;i++)
		{
			System.out.println("Enter the price and quantity of " +i+ " product");
			
			price=sc.nextFloat();
			quantity=sc.nextInt();
			total=total+(price*quantity);
		}
		System.out.println("Total is "+total);
		
		
	}
	
	void Calculate()
	{
		percnt=(total/10000)*100;
		System.out.println("Percentage of Salary Spend on purchase is "+percnt);
	}
	
	


}

public class CustomerSalarySpent {
	public static void main(String[] args)
	{
	
	Customer c=new Customer();
	c.acceptValue();
	c.Calculate();
	}

}
