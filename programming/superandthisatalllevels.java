//.craete a java app where we need to satisfy super at all levels
import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int m1(String a)
	{
		System.out.println(a);
		System.out.println(this.a);
		this.m1(sc.nextBoolean());
		return sc.nextInt();
	}
	void m1(boolean a)
	{
		System.out.println(a);
	}	
	A(long a)
	{
		System.out.println(a);
	}
	A(String a)
	{
		this(sc.nextLong());
		System.out.println(a);
	}
}
class B extends A
{
	int a =sc.nextInt();
	int m1(String a)
	{	
		System.out.println(a);
		System.out.println(super.m1(sc.next()));
		return sc.nextInt();
	}
	B()
	{	
		super(sc.next());
		System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String args[])
	{
		B obj=new B();
		System.out.println(obj.m1(sc.next()));
	}
}
