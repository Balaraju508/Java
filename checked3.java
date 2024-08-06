import java.io.*;
import java.util.*;
class A
{
	public static void main(String args[])throws IOException
	{
		File f=new File("C:\\Users\\Balaraju.B\\OneDrive\\Documents\\core java\\new.java");
		f.createNewFile();
		System.out.println("successfully created");
		FileWriter fw=new FileWriter(f);
		fw.write("hello 126");
		fw.flush();
		fw.close();
		Scanner sc=new Scanner(f);
		while(sc.hasNext())
		{
			System.out.println(sc.next()+" ");
		}
		sc.close();
	}
}