import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	void m1()
	{
		try
		{
			int n=sc.nextInt();
			System.out.println(n/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	void m2()
	{		
		try
		{
			int a[]={10,20,3};
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundException e)
		{
			e.printStackTrace();
		}
	}
	void m3()
	{
		try
		{
			float f=sc.nextFloat();
			System.out.println(f);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
		}
	
	}
	public static void main(String args[])
	{
		A x=new A();
		x.m1();
		x.m2();
		x.m3();
	}
}
		