import java.util.*;
class A{
	public static void isPrime(int n)
	{
		int fc=0;
		for(int i=n;i<=n;i++)
		{
			if(n%i==0)
			{
				fc++;
			}
		}
		if(fc==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	public static void main(String args[])
	{
		int a=sc.nextInt();
		isPrime(a);
	}
}