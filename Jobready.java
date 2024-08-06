import java.util.*;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(float a);
	float m2(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
}
interface I2
{
	abstract float m3(int a);
	String m4(short a)
	{
		System.out.println(a);
		return I1.sc.next();
	}
}
abstract class A implements I1,I2
{
	abstract int m5(float a);
	float m6(String a)
	{
		System.out.println(a);
		return I1.sc.nextFloat();
	}
	A(I1 x)
	{
	}
}
class B extends A 
{
	public int m1(float a)
	{
		System.out.println(a);
		return I1.sc.nextInt();
	}
	public float m3(int a)
	{
		System.out.println(a);
		return I1.sc.nextFloat();
	}
	public int m5(float a)
	{
		System.out.println(a);
		return I1.sc.nextInt();
	}
}
class C extends A 
{
	public int m1(float a)
	{
		System.out.println(a);
		return I1.sc.nextInt();
	}
	public float m3(int a)
	{
		System.out.println(a);
		return I1.sc.nextFloat();
	}
	public int m5(float a)
	{
		System.out.println(a);
		return I1.sc.nextInt();
	}
}
class Test
{
	static int m6(String a)
	{
		System.out.println(a);
		return I1.sc.nextInt();
	}
	float m7(short a)
	{
		System.out.println(a);
		return I1.sc.nextFloat();
	}
	Test(int a)
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		C x= new C();
		System.out.println(x.m1(I1.sc.nextFloat()));
		System.out.println(x.m2(I1.sc.next()));
		System.out.println(x.m3(I1.sc.nextInt()));
		System.out.println(x.m4(I1.sc.nextShort()));
		System.out.println(x.m5(I1.sc.nextFloat()));
		System.out.println(m6(I1.sc.nextFloat()));
		Test x1=new Test(I1.sc.nextInt());
		System.out.println(x1.m7(I1.sc.nextFloat()));
	}
}








			

	