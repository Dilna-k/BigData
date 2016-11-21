package javapackage;

import java.util.Scanner;

class TestRating
{
	String customer_name;
	int no_of_customers;
	float rating;
	float total=0;
	
	float average;
	public void acceptValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of customers");
		no_of_customers=sc.nextInt();
		for(int i=1;i<=no_of_customers;i++)
		{
			
		System.out.println("Enter the "+i+" Customer name");
		customer_name=sc.next();

		System.out.println("Enter the rating");
		rating=sc.nextFloat();
		total=total+rating;
		}
		
		
	}

	void average()
	{
		average=total/no_of_customers;
		System.out.println("Average Rating is "+average);

	}


}
public class Rating {

	public static void main(String[] args)
	{
	
		TestRating c=new TestRating();
	c.acceptValue();
	c.average();
	
	}
	
}
