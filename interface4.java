//create a java app where we have one interface it contains 1 abstract method and another interface contains one abstarct method then inherit these 2 interfaces into abstarct class where we have one abstarct method ,one define method and one parameterised constructor then inherit this abstarct cls into concrete class and provide fuctionalities for all the methods by providing dynamic inputs.

import java.util.*;
interface A
{
	int m1(short a);
}
interface B
{
	String m2(short a);
}
abstract class C implements A,B
{
	static Scanner sc=new Scanner(System.in);
	abstract float m3(int a);
	double m4(short a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
	C(int a)
	{
		System.out.println(a);
	}
}
class D extends C
{
	public int m1(short a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public String m2(short a)
	{
		System.out.println(a);
		return sc.next();
	}
	float m3(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	D()
	{
		super(sc.nextInt());
	}
	public static void main(String args[])
	{
		C x=new D();
		System.out.println(x.m1(sc.nextShort()));
		System.out.println(x.m2(sc.nextShort()));
		System.out.println(x.m3(sc.nextInt()));
		System.out.println(x.m4(sc.nextShort()));
	}
}