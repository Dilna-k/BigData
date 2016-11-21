package javapackage;

public class MaxMinArray {
	public static void main(String[] args)
	{
		int[] num=new int[]{12,4,3,7,23,13,14,16,17};
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
			else if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println("Maximum value is "+max);
		System.out.println("Minimum value is "+min);
	}

}
