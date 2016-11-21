package javapackage;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LinkedListEx {

	public static void main(String[] args)
	{
		List l=new LinkedList();
		l.add("Dilna");
		l.add("Niya");
		l.add(4);
		
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		for(Object o:l)
		{
			System.out.println(o);
		}
		
		
	}
}
