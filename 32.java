//32.
import java.util.*;
class aa{
	int a=sc.nextInt();
	float b=sc.nextFloat();
	String c=sc.next();
	void m1(float a,boolean b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	static boolean m2(String a)
	{
		System.out.println(a);
		return nextBoolean();
	}
	public static void main(String args[])
	{
		aa e=new aa();
		e.m1(sc.nextFloat(),sc.nextBoolean);
		m2(sc.next());
	}
}
	