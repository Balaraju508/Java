import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float m1(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	A(float a)
	{
		System.out.println(a);
	}
}
class B extends A
{
	float a=sc.nextFloat();
	float m1(int a)
	{
		System.out.println(super.m1(sc.next()));
		return sc.nextFloat();
	}
	String m2(int a)
	{
		System.out.println(a);
		System.out.println(this.m1(sc.nextInt()));
		return sc.next();
	}
	B()
	{
		super(sc.nextFloat());
		System.out.println(super.a);
		System.out.println(this.a);
	}
	public static void main(String args[])
	{
		B x=new B();
		System.out.println(x.m2(sc.nextInt()));
	}
}
