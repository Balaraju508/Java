import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	
	String m1(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.m1(sc.nextFloat()));
		return sc.next();
	}
	A(int a)
	{
		System.out.println(a);
	}
	A()
	{
		this(sc.nextInt());
	}
}
class B extends A
{
	String a=sc.next();
	String m1(int a)
	{
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(super.m1(sc.nextInt()));
		return sc.next();
	}
	B(float a)
	{	
		super();
		System.out.println(a);
		
	}
	public static void main(String args[])
	{
		B x=new B(sc.nextFloat());
		System.out.println(x.m1(sc.nextInt()));
	}
}