import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
}
class B extends A
{
	String m2(float a)
	{
		System.out.println(a);
		System.out.println(x.m1(sc.nextFloat()));
		return sc.next();
	}
}
class C extends A
{
	float m3(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class test extends A
{
	public static void main(String args[])	
	{
		B x=new B();
		System.out.println(x.m1(A.sc.nextFloat()));
		System.out.println(x.m2(A.sc.next()));
	}
}
			