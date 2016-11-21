package javapackage;

import java.util.*;
import java.lang.String;
import javapackage.ReplaceCharacter;

public class ReplaceCharacter {
	
	
	public static void main(String[] args)
	{
		String str;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		
		char from,to;
		System.out.println("Enter the character to be replaced");
		from=sc.next().charAt(0);
		
		System.out.println("Enter the character which replaced by");
		to=sc.next().charAt(0);
		
		String changed = str.replace(from, to);
		System.out.println(changed);
		
		//Using String Builder
		StringBuilder st=new StringBuilder(str);
		st.setCharAt(4, 'j');
		System.out.println(st);
		
		
	}

}
