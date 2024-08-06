import java.util.*;
interface A
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a);
}
interface B
{
	float m2(String a);
}
interface C
{
	String m3(short a);
}
abstract class D implements A,B,C
{
	int D(short a)
	{
		System.out.println(a);
		return A.sc.nextInt();
	}
	abstract float m4(int a);
	short m5(float a)
	{
		System.out.println(a);
		return A.sc.nextShort();
	}
}
class E extends D
{
	public int m1(float a)
	{
		System.out.println(a);
		return A.sc.nextInt();
	}
	public float m2(String a)
	{
		System.out.println(a);
		return A.sc.nextFloat();
	}
	public String m3(short a)
	{
		System.out.println(a);
		return A.sc.next();
	}
	public float m4(int a)
	{
		System.out.println(a);
		return A.sc.nextFloat();
	}
}
class F extends D
{
	public int m1(float a)
	{
		System.out.println(a);
		return A.sc.nextInt();
	}
	public float m2(String a)
	{
		System.out.println(a);
		return A.sc.nextFloat();
	}
	public String m3(short a)
	{
		System.out.println(a);
		return A.sc.next();
	}
	public float m4(int a)
	{
		System.out.println(a);
		return A.sc.nextFloat();
	}

	void display(D x)
	{
		System.out.println(x.m1(A.sc.nextFloat()));
		System.out.println(x.m2(A.sc.next()));
		System.out.println(x.m3(A.sc.nextShort()));
		System.out.println(x.m4(A.sc.nextInt()));
		System.out.println(x.m5(A.sc.nextFloat()));
	}
}
class test
{
	public static void main(String args[])
	{
		F x1 = new F();
		x1.display(x1);
	}
}

		