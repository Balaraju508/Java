//create a java app where we have one interface it contains 2 abstarct methods and 2 define methods then invoke then provide functionality for this methods in concreete cls and invoke all of them main method of concrete cls.

import java.util.*;
interface A
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(short a);
	abstract float m2(String a);
	String m3(int a)
	{
		System.out.println(a);
		return sc.next();
	}
	double m4(float a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
}
class B implements A
{
	public int m1(short a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public float m2(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public static void main(String args[])
	{
		B x=new B();
		System.out.println(x.m1(sc.nextShort()));
		System.out.println(x.m2(sc.nextString()));
		System.out.println(x.m3(sc.nextInt()));
		System.out.println(x.m4(sc.nextFloat()));
	}
}