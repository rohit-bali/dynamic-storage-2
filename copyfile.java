import java.io.*;
import java.util.*;
class copyfile
{
	public static void main(String ar[])
	{
		File f1=new File("C:/Users/ankit/Desktop/demoproject2/filehandling/1.txt");
		File f2=new File("C:/Users/ankit/Desktop/demoproject2/filehandling/2.txt");
		try
		{
			FileInputStream fin=new FileInputStream(f1);
			FileOutputStream fout=new FileOutputStream(f2);
			int i;
			i=fin.read();
			while(i!=-1)
			{
				//System.out.print(i+":"+(char)i);
				fout.write((char)i);
				i=fin.read();
			}
			fin.close();
			fout.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}