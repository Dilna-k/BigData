package javapackage;

public class CopyCharToStr {
	public static void main(String[] args)
	{
		String str;
		char[] mychar={'T','h','i','s',' ','i','s',' ','j','a','v','a'};
		str=new String(mychar);
		System.out.println(str);
		str=String.copyValueOf(mychar);
		System.out.println(str);
		str=String.copyValueOf(mychar,4,6);
		System.out.println(str);
	}

}
