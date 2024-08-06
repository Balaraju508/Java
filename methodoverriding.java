import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
}
class B extends A
{
	int m1(float a)
	{
		System.out.println(a);
		System.out.println(super.m1(sc.nextFloat()));
		return sc.nextInt();
	}
	public static void main(String args[])
	{
		B obj=new B();
		System.out.println(obj.m1(sc.nextFloat()));
	
	}
}
