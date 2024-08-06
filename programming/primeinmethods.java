import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	public static void isPrime(int n)
	{
		int fc=0;
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				fc++;
			}
		}
		if(fc==0&&n!=0&&n!=1)
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