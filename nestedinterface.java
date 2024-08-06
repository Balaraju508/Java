import java.util.*;
interface A
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a);
	static float m2(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	interface B
	{
		short m3(float a);
	}
	interface C
	{
		String m4(int a);
	}
}
class D implements A,A.B,A.C
{
	public int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public short m3(float a)
	{
		System.out.println(a);
		return sc.nextShort();
	}
	public String m4(int a)
	{
		System.out.println(a);
		return sc.next();
	}
	public static void main(String args[]) 
	{
		A x=new D();
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(A.m2(sc.next()));
		A.B x2=new D();
		System.out.println(x2.m3(sc.nextFloat()));
		A.C x3=(D)x;
		System.out.println(x3.m4(A.sc.nextInt()));
	}
}



