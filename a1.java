//create a java app where we have abstract cls it contains 2 undefined methods and one static method and 1 non stattic method and a parameterised constructor then provide functionality for this abstract methods and invoke all of them under main method by provioding dynamic inputs

import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract String m1(float a);
	abstract int m2(short a);
	static int m3(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	String m4(short a)
	{
		System.out.println(a);
		return sc.next();
	}
	A(int a)
	{
		System.out.println(a);
	}
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
	B()
	{
		super(sc.nextInt());
	}
	public static void main(String args[])
	{
		B obj=new B();
		System.out.println(obj.m1(sc.nextFloat()));
		System.out.println(obj.m2(sc.nextShort()));
		System.out.println(A.m3(sc.nextFloat()));
		System.out.println(obj.m4(sc.nextShort()));
	}
}
