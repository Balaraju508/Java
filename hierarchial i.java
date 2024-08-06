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
		test x=new test();
		System.out.println(x.m1(sc.nextFloat());
		System.out.println(x.m2(sc.nextFloat());
		System.out.println(x.m3(sc.next());
	}
}
			