import java.util.*;
interface A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int m1(float a);
	String m2(short a);
}
class B implements A
{
	public int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public String m2(short a)
	{
		System.out.println(a);
		return sc.next();
	}
	public static void main(String args[])
	{
		B x=new B();
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(x.m2(sc.nextShort()));
	}
}