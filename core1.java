import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float m1(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class B
{
	int m2(short a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	A x=new A();
	System.out.println(A.x.m1(sc.next()));
}
class test
{
	public static void main(String args[])
	{
		B x1=new B();
		System.out.println(x1.m2(sc.nextShort()));
	}
}		
	