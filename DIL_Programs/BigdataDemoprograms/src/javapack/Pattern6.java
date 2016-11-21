package javapack;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args)
	{
		int numofrows,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		numofrows=sc.nextInt();
		for(i=0;i<numofrows;i++)
		{
			for(j=0;j<=numofrows-i;j++)
			{
				System.out.print(" ");
					
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("*");
				System.out.print(" ");
				
			}
			
			System.out.println();
		}
		
	}

}
