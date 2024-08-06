//craete a java app where we need to deal with null pointer exception

import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	void m1()
	{
		try
		{
			String a=null;
			System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			System.out.print(e);
		}
		int b[]=null;
		try
		{
			System.out.println(b[0]);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		A x=null;
		try
		{
			x.m1();
		}
		catch(NullPointerException e)
		{
			System.out.print(e);
		}
	}

}
						
		