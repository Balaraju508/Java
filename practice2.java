import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
	float m1(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.nextFloat();
	}
	A(String a)
	{
		System.out.println(this.m1(sc.nextInt()));
		System.out.println(a);
	}
	A(float a)
	{
		this(sc.next());
		System.out.println(a);
	}
	public static void main(String args[])
	{
		A x=new A(sc.nextFloat());
	}
}