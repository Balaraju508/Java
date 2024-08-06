import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(float a);
}
abstract class B extends A
{
	abstract String m2(int a);
}
abstract class C extends B
{
	abstract float m3(String a);
	C(int a)
	{
		System.out.println(a);
	}
}
class D extends C
{	
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	String m2(int a)
	{
		System.out.println(a);
		return sc.next();
	}
	float m3(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	D()
	{
		super(sc.nextInt());
	}
	public static void main(String args[])
	{
		A x1=new D();
		System.out.println(x1.m1(sc.nextFloat()));
		B x2=new D();
		System.out.println(x2.m2(sc.nextInt()));
		C x3=new D();
		System.out.println(x3.m3(sc.next()));

	}
}

/*D obj=new D();
A x= obj;
B x=obj;
C x=obj;*/
