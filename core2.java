import java.util.*;
interface A1
{
	static Scanner sc=new Scanner(System.in);
	abstract short m1(String a);
	int m2(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
}
interface A2
{
	abstract String m3(int a);
	short m4(String a)
	{
		System.out.println(a);
		return A1.sc.nextShort();
	}
}
interface A3
{
	abstract float m5(int a);
	double m6(short a)
	{
		System.out.println(a);
		return A1.sc.nextDouble();
	}
}
abstract class B
{
	B(float a)
	{
		System.out.println(a);
	}
	abstract int m7(short a);
	String m8(float a)
	{
		System.out.println(a);
		return A1.sc.next();
	}
}
class C extends B implements A1,A2,A3
{
	public short m1(String a)
	{
		System.out.println(a);
		return A1.sc.nextShort();
	}
	public String m3(int a)
	{
		System.out.println(a);
		return A1.sc.next();
	}
	public float m5(int a)
	{
		System.out.println(a);
		return A1.sc.nextFloat();
	}
	public int m7(short a)
	{
		System.out.println(a);
		return A1.sc.nextInt();
	}
}
class D extends C
{
	A1 display(C x)
	{
		
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextFloat()));
		System.out.println(x.m3(sc.nextInt()));
		System.out.println(x.m4(sc.next()));
		System.out.println(x.m5(sc.nextInt()));
		System.out.println(x.m6(sc.nextShort()));
		System.out.println(x.m7(sc.nextShort()));
		System.out.println(x.m8(sc.nextFloat()));
		return x;
	}
}
class test
{
	public static void main(String args[])
	{
		test x2=new test();
		x2.display();
	}
}
