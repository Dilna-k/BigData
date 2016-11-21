package javapackage;

public class TwoDimension {
	
	public static void main(String[] args)
	{
		int [] []x=new int[2][2];
		
		//int [] []x= new int [][]x{(1,1),(2,3)};
		x[0][0]=2;
		x[0][1]=3;
		x[1][0]=4;
		x[1][1]=5;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				System.out.print(x[i][j]+ " ");
			}
			System.out.println(" " );
		}
		
	}

}
