package javapack;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args)
	{
		int numofrows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		numofrows=sc.nextInt();
		for(int i=0;i<numofrows;i++)
		{
			for(int j=i;j<numofrows;j++)
			{
				char c=(char)('A'+j);
				System.out.print(c);
			}
			System.out.println();
		}
		
	}


}
