package javapackage;

public class ReverseNumber {
	
	public static void main(String[] args)
	{
		/*for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int j=10;j>=1;j--)
		{
			System.out.print(j+" ");
		}*/
		
		int x=23458;
		int reverse=0;
		while(x>0)
		{
			
			reverse=(reverse*10)+(x%10);
			x=x/10;
		}
		System.out.print(reverse);
	}

}
