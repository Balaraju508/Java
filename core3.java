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
	static A x=new A();
	Scanner sc=new Scanner(System.in);
	int m2(short a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
}
class test
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		B x1=new B();
		System.out.println(x1.m2(sc.nextShort()));
		System.out.println(B.x.m1(sc.next()));
	}
}		
	