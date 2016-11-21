package javapack;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args)
	{
		int numofrows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		numofrows=sc.nextInt();
		for(int i=0;i<numofrows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				char c=(char)('A'+j);
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

}
