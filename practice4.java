import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	static float m1(short a)
	{	
		System.out.println(a);
		return sc.nextFloat();
	}
	String m2(double a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.next();
	}
}
class B extends A
{
	float a=sc.nextFloat();
	static double m3(int a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
	float m4(short a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.nextFloat();
	}
}
class C extends B
{
	String a=sc.next();
	static int m5(double a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	short m6(String a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.nextShort();
	}
	public static void main(String args[])
	{
		A x=new A();
		System.out.println(m1(sc.nextShort()));
		System.out.println(x.m2(sc.nextDouble()));
		B x1 =new B();
		System.out.println(m3(sc.nextInt()));
		System.out.println(x1.m4(sc.nextShort()));
		C x2=new C();
		System.out.println(m5(sc.nextDouble()));
		System.out.println(x2.m6(sc.next()));
	}
}
		


