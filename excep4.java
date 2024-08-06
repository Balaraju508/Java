//crate a java app where we need to deal with InputMissmatchException
import java.util.*;
class A
{
	public static void main(String args[])
	{
		while(true)
		{
			  Scanner sc=new Scanner(System.in);
			try{
				int a=sc.nextInt();
				System.out.println(a);
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("Done");
			}
		}
	}
}


	