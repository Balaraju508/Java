//create a java app where we have one cls it contains 2 non static methods then inherit these cls into another cls where we have 2 non static methods then invoke all these methods under main method of derived cls
import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	float m2(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class B extends A{
	String m3(short a)
	{
		System.out.println(a);
		return sc.next();
	}
	int m4(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public static void main(String args[])
	{
		B x=new B();
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(x.m2(sc.next()));
		System.out.println(x.m3(sc.nextShort()));
		System.out.println(x.m4(sc.nextFloat()));
	}
}