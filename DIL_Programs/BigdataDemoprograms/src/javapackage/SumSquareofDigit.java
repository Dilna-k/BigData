package javapackage;
import java.util.Scanner;
public class SumSquareofDigit {
	
	
	public static void main(String[] args)
	{
		int x,y,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Digits");
		x=s.nextInt();
		while(x!=0)
		{
			y=x%10;
			sum=sum+(y*y);
			x=x/10;
		}
		System.out.println(sum);
		
	}
}
