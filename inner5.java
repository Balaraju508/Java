//create a java app where we have one inteface it conmtains one abstarct method and one default method then inherit abstrct clas which contains abstrct method one parameterised  constructor then provide functionality by using anonymous inner cls

import java.util*;
static Scanner sc=new Scanner(System.in);
interface A
{
	abstract int m1(float a);
	default float m2(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
abstract class B implements A
{
	abstract String m3(short a);
	B(float a)
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		B x=new B(sc.nextFloat())
		{
			public int m1(float a)
			{
				System.out.println(a);
				return sc.nextInt();
			}
			String m3(short a)
			{
				System.out.println(a);
				return sc.next();
			}
		};
		System.out.println(x.m1(sc.nextFloat());
		System.out.println(x.m2(sc.next());
		System.out.println(x.m3(sc.nextShort());
	}
}


	
				
