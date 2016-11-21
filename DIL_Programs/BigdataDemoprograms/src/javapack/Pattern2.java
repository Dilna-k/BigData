package javapack;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args)
	{
		int numofrows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		numofrows=sc.nextInt();
		for(int i=1;i<=numofrows;i++)
		{
			for(int j=i;j<=numofrows;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
