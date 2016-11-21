package javapackage;

import java.util.Scanner;

class Student
{
	String name;
	float math,phy,chem,comp,bio;
	
	void acceptValue()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Student name");
		name=sc.next();
		
		System.out.println("Enter the marks in maths");
		math=sc.nextFloat();
		System.out.println("Enter the marks in Physics");
		phy=sc.nextFloat();
		System.out.println("Enter the marks in Chemistry");
		chem=sc.nextFloat();
		System.out.println("Enter the marks in Computer");
		comp=sc.nextFloat();
		System.out.println("Enter the marks in Biology");
		bio=sc.nextFloat();
	}
	
	void Calculate()
	{
		float percentage=((math+phy+chem+comp+bio)*100)/500;

		if(percentage>=85 && percentage<=100)
			{
			
			System.out.println(name +" Grade is A+");
			}
	
			else if(percentage>=75 && percentage<=84)
			{
			System.out.println(name +" Grade is A");
			}
			else if(percentage>=65 && percentage<=74)
			{
			System.out.println(name +" Grade is B");
			}
		 	else if(percentage>=50 && percentage<=64)
			{
			System.out.println(name +" Grade is C");
			}
			else
			{
				System.out.println(name +" Grade is Fail");
			}


	}
}

public class StudentGrade {

	public static void main(String[] args)
	{
		Student st=new Student();
		st.acceptValue();
		st.Calculate();
	}
}
