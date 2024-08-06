//.craete a java app where we need to satisfy super at all levels
import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	A(int a)
	{
		System.out.println(a);
	}
}
class B extends A
{
	int a =sc.nextInt();
	int m1(float a)
	{
		System.out.println(super.m1(sc.nextFloat()));
		return sc.nextInt();
	}
	B(float a)
	{	
		super(sc.nextInt());
		System.out.println(super.a);
		System.out.println(this.a);
	}
	public static void main(String args[])
	{
		B obj=new B(sc.nextFloat());
		System.out.println(obj.m1(sc.nextFloat()));
	}
}
