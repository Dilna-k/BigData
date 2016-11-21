package javapack;
import java.io.*;
public class CreateNewFile {
	public static void main(String[] args)
	{
		try
		{
			
		String str="Hai This is Java";
		FileOutputStream fos=new FileOutputStream("d:\\text.txt");
		
		fos.write(str.getBytes());
		
		
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}

}
