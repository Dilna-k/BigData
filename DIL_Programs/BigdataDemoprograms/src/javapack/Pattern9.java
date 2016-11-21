package javapack;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args)
	{
		int numofrows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		numofrows=sc.nextInt();
		for(int i=0;i<numofrows;i++)
		{int k=0;
			for(int j=i;j<numofrows;j++)
			{
				char c=(char)('A'+k);
				System.out.print(c);
				k++;
			}
			System.out.println();
		}
		
	}

}
