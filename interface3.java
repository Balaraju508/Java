//create a java app where we have 1 interface it contains one abstract method and 1 define method then inherit this interface into another interface it contains one abstarct method and one define method then inherit this interface into a concrete cls and provide functionality for abstract method and invoke them under main method .

import java.util.*;
interface A
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a);
	static short m2(String a)
	{
		System.out.println(a);
		return sc.nextShort();
	}
}
interface B extends A

{
	String m3(int a);
	default float m4(double a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class C implements B
{
	public int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public String m3(int a)
	{
		System.out.println(a);
		return sc.next();
	}
	public static void main(String args[])
	{
		C x=new C();
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(A.m2(sc.next()));
		System.out.println(x.m3(sc.nextInt()));
		System.out.println(x.m4(sc.nextDouble()));
	}
}


	