import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	static A x=new A();
	static int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	static float m2()
	{
		System.out.println("m2");
		System.out.println(m1(sc.next()));
		return sc.nextFloat();
	}
	static void m3(float a)
	{
		System.out.println(a);
		System.out.println(m2());
	}
	static void m4()
	{
		System.out.println("m4");
		m3(sc.nextFloat());
	}
	int m5(short a)
	{
		System.out.println(a);
		m4();
		return sc.nextInt();
	}
	float m6()
	{
		System.out.println("m6");
		System.out.println(x.m5(sc.nextShort()));
		return sc.nextFloat();
	}
	void m7(String a)
	{

		System.out.println(a);
		System.out.println(x.m6());
		System.out.println("m7");
	}
	void m8()
	{	
		System.out.println("m8");
		x.m7(sc.next());
	}
	public static void main(String args[])
	{
		A y=new A();
		y.m8();
	}
}
