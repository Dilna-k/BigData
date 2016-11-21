package javapack;
import java.io.*;
public class CreateNewFileExmpl2 {
	public static void main(String[] args)throws Exception
	{
		String str="This is Bigdata";
		File f=new File("d:\\demo.txt");//it means create new file
		/* if condition write or not get the output*/
		if(!f.exists())
		{
			f.createNewFile();
		}
		/*      */
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(str);
		bw.close();
		
	}

}
