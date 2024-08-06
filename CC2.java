package test;
import p1.p2.*;
public class CC2 extends Ab2 implements II3
{
	public CC2()
	{
		super(p1.II1.sc.next());
	}
	public float m5(int a)
	{	
		System.out.println(a);
		return p1.II1.sc.nextFloat();
	}
	public double m6(float a)
	{
		System.out.println(a);
		return p1.II1.sc.nextDouble();
	}
}
