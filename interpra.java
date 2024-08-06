import java.util.*;
interface A
{
	static Scanner sc=new Scanner(System.in);
	void m1(String a);
	static float m2(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
interface B
{
	String m3();
	
}
interface C
{
	float m4(String a);
	static String m5(int a)
	{
		System.out.println(a);
		return A.sc.next();
	}
}
abstract class D implements A,B,C
{
	abstract float m6(short a);
	D(int a)
	{
		System.out.println(a);
	}
}
class E extends D
{
	public void m1(String a)
	{
		System.out.println(a);
	}
	public String m3()
	{
		System.out.println("m3");
		return sc.next();
	}
	public float m4(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public float m6(short a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	E()
	{
		super(sc.nextInt());
	}
}
class F extends D
{
	public void m1(String a)
	{
		System.out.println(a);
	}
	public String m3()
	{
		System.out.println("m3");
		return sc.next();
	}
	public float m4(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public float m6(short a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	F()
	{
		super(sc.nextInt());
	}
}
class G extends D
{
	private String pass="bala";
	public void m1(String pass)
	{
		System.out.println("m1");
		this.pass=pass;
	}
	public String m3()
	{
		System.out.println("m3");
		return pass;
	}
	public float m4(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public float m6(short a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	G()
	{
		super(sc.nextInt());
	}
}
class Test
{
	static void calling(D obj)
	{
		obj.m1(A.sc.next());
		System.out.println(A.m2(A.sc.nextInt()));
		System.out.println(obj.m3());
		System.out.println(obj.m4(A.sc.next()));
		System.out.println(C.m5(A.sc.nextInt()));
		System.out.println(obj.m6(A.sc.nextShort()));
	}
	public static void main(String args[])
	{
		System.out.println("\npress 1.for E\npress 2.for F\npress3.for G");
		int n=A.sc.nextInt();
		if(n==1)
		{
			E obj=new E();
			calling(obj);

		}	
		else if(n==2)
		{
			F obj =new F();
			calling(obj);
		}
		else if(n==3)
		{
			G obj=new G();
			calling(obj);
		}
		else{
			System.out.println("invalid input");
			main(args);
		}
	}
}
		