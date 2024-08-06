//31 create a java app where we have one cls it contains a static method having parameter and return type,non static method having parameter and return type then invoke these methods under main method without creating or storing the obj by proving dynamic input.

import java.util.*;
class EE{
	static Scanner sc=new Scanner(System.in);
	static EE m1(String a)
	{
		System.out.println(a);
		return new EE();
	}
	float m2(char a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public static void main(String args[])
	{
		EE a=m1(sc.next());
		System.out.println(a.m2(sc.next().charAt(0)));
	}
}