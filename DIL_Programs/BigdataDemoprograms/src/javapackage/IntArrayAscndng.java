package javapackage;

import java.util.Arrays;
import java.util.Scanner;

public class IntArrayAscndng {
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
			
		}
		/*for(int j=0;j<l;j++)
		{
			//System.out.println(num[j]);
			
		}*/
		for(int j=0;j<l;j++)
		{
			Arrays.sort(num);
			System.out.println(num[j]);
			
		}
		
		
	}

}
