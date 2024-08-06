import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract String m1(float a);
	abstract int m2(short a);
}
class B extends A
{
	String m1(float a)
	{
		System.out.println(a);
		return sc.next();
	}
	int m2(short a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public static void main(String args[])
	{
		B obj=new B();
		System.out.println(obj.m1(sc.nextFloat()));
		System.out.println(obj.m2(sc.nextShort()));
	}
}
