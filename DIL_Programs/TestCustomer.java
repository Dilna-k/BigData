import java.util.Scanner;

class Customer
{
	String customer_name;
	int no_prdts,price,quantity;
	int total=0;
	void acceptValue()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Customer name");
		customer_name=sc.next();
		System.out.println("Enter number of products purchased");
		no_prdts=sc.nextInt();

		System.out.println("Enter the price and quantity of each product");
		for(int i=0;i<=no_prdts;i++)
		{
			price=sc.nextInt();
			quantity=sc.nextInt();
			total=total+(price*quantity);
		}
		System.out.println(total);
		
		
	}


}

class TestCustomer
{
	public static void main(String[] args)
	{
	
	Customer c=new Customer();
	c.acceptValue();

	
}

}