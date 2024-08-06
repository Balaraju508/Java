
import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static A m1(A obj)
	{
		obj.m2(sc.next(),sc.nextFloat(),sc.nextBoolean());
		return obj;
	}
	
	void m2(String a,float b,boolean c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String args[])
	{
		System.out.println(m1(new A()));
	}
}