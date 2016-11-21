package javapackage;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args)
	{
		int lmt,temp,search,i;
		int[] arr =null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limits");
		lmt=sc.nextInt();
		 arr = new int[lmt];
		System.out.println("Enter the array numbers");
		for(i=0;i<lmt;i++)
		{
			
			arr[i]=sc.nextInt();
			
		}
		for(i=0;i<lmt;i++)
		{
			
			Arrays.sort(arr);
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter the number to search");
		search=sc.nextInt();
		int first=0;
		int last=lmt-1;
		int middle=(first+last)/2;
		
	    while( first <= last )
	    {
	      if ( arr[middle] < search )
	        first = middle + 1;    
	      else if ( arr[middle] == search ) 
	      {
	        System.out.println(search + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if ( first > last )
	      System.out.println(search + " is not present in the list.\n");
	  }
		
		
		
	}

