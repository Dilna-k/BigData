package javapackage;

import java.util.Scanner;

public class AcceptIntArrayAndPrint {
	public static void main(String[] args)
	{
		int l;
		int[] num =null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limits");
		l=sc.nextInt();
		 num = new int[l];
		System.out.println("Enter the numbers");
		for(int i=0;i<l;i++)
		{
			
			num[i]=sc.nextInt();
			//System.out.println(num[i]);
			
		}
		for(int j=0;j<l;j++)
		{
			 
			
			System.out.println(num[j]);
			
		}
	}
}
