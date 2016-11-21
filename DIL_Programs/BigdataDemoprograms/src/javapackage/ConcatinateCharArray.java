package javapackage;

public class ConcatinateCharArray {
	public static void main(String[] args)
	{
		
	
	char[] c={'t','h','i','s',' ','i','s',' '};
	char[] d = {'j','a','v','a'};



	StringBuilder sb = new StringBuilder(64);
	sb.append(c);
	sb.append(d);

	char result[] = sb.toString().toCharArray();
	System.out.println(result);
	
	//using concat
	String s1=new String(c);
	String s2=new String(d);
	String p=s1.concat(s2);
	
	System.out.println(s1);

	System.out.println(s2);
	System.out.println(p);
	}
}
