package javapackage;

public class CharFromString {
	public static void main(String[] args)
	{
		String str="This is java";
		char ch=str.charAt(6);
		System.out.println(ch);// it gives one character at a time
		char[] mystr=new char[5];
		str.getChars(5, 10, mystr, 0);
		System.out.println(mystr);
	}

}
