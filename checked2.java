import java.util.*;
class A
{
	public static void main(String args[])throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			try{
				Thread.sleep(500);
				System.out.print(i+" ");
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}