import java.util.Scanner;

class Student
{
	String name;
	float math,phy,chem,eng,comp;
	void acceptValue()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student name");
		name=s.next();
		System.out.println("Enter the marks in maths");
		math=s.nextFloat();
		System.out.println("Enter the marks in Physics");
		phy=s.nextFloat();
		System.out.println("Enter the marks in Chemistry");
		chem=s.nextFloat();
		System.out.println("Enter the marks in English");
		eng=s.nextFloat();
		System.out.println("Enter the marks in Computer");
		comp=s.nextFloat();
		
		
	}

	void calculate()
	{
		float percentage=((math+phy+chem+eng+comp)*100)/500;

		if(percentage>=85 && percentage<=100)
			{
			
			System.out.println("Grade is A+");
			}
	
			else if(percentage>=75 && percentage<=84)
			{
			System.out.println("Grade is A");
			}
			else if(percentage>=65 && percentage<=74)
			{
			System.out.println("Grade is B");
			}
		 	else if(percentage>=50 && percentage<=64)
			{
			System.out.println("Grade is C");
			}
			else
			{
				System.out.println("Fail");
			}


	}


}

class TestStudent
{
	public static void main(String[] args)
	{
	
	Student s=new Student();
	s.acceptValue();
	s.calculate();
	
}

}