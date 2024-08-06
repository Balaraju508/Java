//cfrreate a java app where we have 2 interfaces containing one abstarct method and one define method each and abstract cls having one abstrct methiod and one parameterised constructor then inherit all these into a concrete cls at a time and provide functionality for all these methods and invoke under main method by providing dynamic inputs

import java.util.*;
interface A
{
	static Scanner sc=new Scanner(System.in);
	int m1(short a);
	static float m2(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
interface B
{
	float m3(double a);
	static String m4(int a)
	{
		System.out.println(a);
		return A.sc.next();
	}
}
abstract class C
{
	abstract String m5(float a);
	C(float a)
	{
		System.out.println(a);
	}
}
class D extends C implements A,B
{
	public int m1(short a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public float m3(double a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public String m5(float a)
	{
		System.out.println(a);
		return sc.next();
	}
	D()
	{
		super(sc.nextFloat());
	}
	public static void main(String args[])
	{
		D x=new D();
		System.out.println(x.m1(sc.nextShort()));
		System.out.println(A.m2(sc.next()));
		System.out.println(x.m3(sc.nextDouble()));
		System.out.println(B.m4(sc.nextInt()));
		System.out.println(x.m5(sc.nextFloat()));
	}
}





	