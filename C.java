package test;
import p2.A;
public class C extends A
{
	public int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public static void main(String args[])
	{
		C x= new C(sc.nextFloat());
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextShort()));
		System.out.println(p2.B.m3(sc.nextFloat()));
		p2.B x1=new p2.B(sc.nextFloat());
		System.out.println(x1.m4(sc.nextInt()));
	}
}