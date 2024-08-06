import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	void m1(float a,boolean b)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(m2(sc.next()));
	}
	static boolean m2(String a)
	{
		System.out.println(a);
		A x=new A();
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		return sc.nextBoolean();
	}
	public static void main(String args[])
	{
		A y=new A();
		y.m1(sc.nextFloat(),sc.nextBoolean());
		System.out.println(m2(sc.next()));
	}
}