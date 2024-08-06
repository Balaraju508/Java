import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int m1(int a)
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
class B extends A
{
	float m3(String a)
	{
		System.out.println(a);
		System.out.println(m1(sc.nextInt()));
		System.out.println(m2(sc.next()));
		return sc.nextFloat();
	}
}
class C
{
	static B x =new B();
	String m4(short a)
	{	
		System.out.println(a);
		System.out.println(x.m3(A.sc.next()));
		return A.sc.next();
	}
}
class D
{
	int m5(float a)
	{
		System.out.println(a);
		C obj = new C();
		System.out.println(obj.m4(A.sc.nextShort()));
		return A.sc.nextInt();
	}
	public static void main(String args[])
	{
		System.out.println(new D().m5(A.sc.nextFloat()));
	}
}