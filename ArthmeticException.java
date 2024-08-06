//create a java app where we need to deal with arrayindexoutofbound exception and irrespective of exception handle print a user friendly msg like batch126;
import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		int n1=sc.nextInt(); 
		try{
			int c=n/n1;
			System.out.println(c);
			try{
				int n2=sc.nextInt();
				int d[]=new int[n2];
				for(int i=0;i<n2;i++)
				{
					d[i]=sc.nextInt();
				}
				int e=d[n2]/n;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally{

			System.out.println("cv corp batch 126");
		}
	}
}