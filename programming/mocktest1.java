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
		System.out.println(A.a);
		System.out.println(A.b);
		System.out.println(A.c);
	}
	static boolean m2(String a)
	{
		System.out.println(a);
		A x=new A();
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
	}
	public static void main(String args[])
	{
		A y=new A();
		y.m1(sc.nextFloat(),sc.nextBoolean());
		m2(sc.next());
	}
}