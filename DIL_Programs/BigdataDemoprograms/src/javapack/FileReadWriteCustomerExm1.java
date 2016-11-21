package javapack;
import java.io.*;
import java.util.Scanner;
public class FileReadWriteCustomerExm1 {
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
		
		System.out.println("Customer id");
		byte CustId=sc.nextByte();
		System.out.println("Customer Name");
		String name=sc.next();
		System.out.println("Customer Age");
		int Age=sc.nextInt();
		System.out.println("Customer Salary");
		float Salary=sc.nextFloat();
		
		FileWriter fw=new FileWriter("d:\\cust.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(String.valueOf(CustId));
		bw.newLine();
		bw.write(name);
		bw.newLine();
		bw.write(String.valueOf(Age));
		bw.newLine();
		bw.write(String.valueOf(Salary));
		bw.newLine();
		bw.close();
		
		
		}
		catch(IOException ex)
		{
			
		}
		
	}

}
