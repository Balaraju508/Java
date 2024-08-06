package test;
import p1.*;
public class CC1 extends Ab1 implements II1,II2
{
	public CC1()
	{
		super(p1.II1.sc.next());
	}
	public float m1(int a)
	{	
		System.out.println(a);
		return p1.II1.sc.nextFloat();
	}
	public float m2(short a)
	{
		System.out.println(a);
		return p1.II1.sc.nextShort();
	}
	public String m4(int a)
	{
		System.out.println();
		return p1.II1.sc.next();
	}
}
