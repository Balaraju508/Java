//create a java app where we need to satisfy both method overloading and method overriding.

import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	float m1(String a)
	{	
		System.out.println(a);
		System.out.println(this.m1(sc.nextInt()));
		return sc.nextFloat();
	}
}
class B extends A
{
	float m1(String a)
	{	
		System.out.println(a);
		System.out.println(super.m1(sc.next()));
		return sc.nextInt();
	}	
	public static void main(String args[])
	{	
		B obj=new B();
		System.out.println(obj.m1(sc.next()));
	}
}
