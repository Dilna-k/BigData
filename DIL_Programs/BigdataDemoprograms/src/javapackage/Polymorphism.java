package javapackage;

class Test
{
	void add(int x)
	{
		int c=x;
		System.out.println(c);
	}
	
	int add(int y,int z)
	{
		int a=y+z;
		return a;
		//System.out.println(a);
	}
}
public class Polymorphism {
	
	public static void main(String[] arg)
	{
		Test t=new Test();
		t.add(3);
		int q=t.add(6,8);
		System.out.println(q);
		
	}

}
