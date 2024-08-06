interface sb
{
	static java.util.Scanner sc= new java.util.Scanner(System.in);
	void m1(String a);
	static float m2(boolean a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	
}
interface sb1
{
	String m1();
	
}
interface sb2
{
	boolean m1(long a);
	default long m2(int a)
	{
		System.out.println(a);
		return sb.sc.nextLong();
	}
}
abstract class as implements sb,sb1,sb2
{
	abstract char m2(double a);
	
	as(String a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
}
class cc1 extends as
{
	public void m1(String a)
	{
		System.out.println("cc1"+a);
	}
	public boolean m1(long a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	public String m1()
	{
		System.out.println("m1");
		return sc.next();
	}

	char m2(double a)
	{
		System.out.println(a);
		return sc.next().charAt(2);
	}
	cc1()
	{
		super(sc.next(),sc.nextInt());
	}
	
}
class cc2 extends as
{
	public void m1(String a)
	{
		System.out.println("cc2 "+a);
		
	}
	public boolean m1(long a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	public String m1()
	{
		System.out.println("m1");
		return sc.next();
	}

	char m2(double a)
	{
		System.out.println(a);
		return sc.next().charAt(2);
	}
	cc2()
	{
		super(sc.next(),sc.nextInt());
	}
	
}

class cc3 extends as
{
	private String pass="hello";
	public void m1(String pass)
	{
		System.out.println("cc3");
		this.pass=pass;
	}
	public boolean m1(long a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	public String m1()
	{
		return pass;
	}

	char m2(double a)
	{
		System.out.println(a);
		return sc.next().charAt(2);
	}
	cc3(){
		super(sc.next(),sc.nextInt());
	}
	
}

class test
{
	static void calling(as obj)          
	{
		obj.m1(sb.sc.next());
		System.out.println(sb.m2(sb.sc.nextBoolean()));
		System.out.println(obj.m1(sb.sc.nextLong()));
		System.out.println(obj.m1());
		System.out.println(obj.m2(sb.sc.nextInt()));
		System.out.println(obj.m2(sb.sc.nextDouble()));
		
	}
	public static void main(String[]args)
	{
		System.out.println("press 1 for cc1\npress 2 for cc2\n presss 3 for cc3");
		int n=sb.sc.nextInt();
		if(n==1)
		{
			cc1 obj=new cc1();
			calling(obj);
		}
		else if(n==2)
		{
			cc2 obj=new cc2();
			calling(obj);
		}
		else if(n==3)
		{
			cc3 obj=new cc3();
			calling(obj);
		}
		else{
			System.out.println("Invalid");
			main(args);
		}
		
	}
}


















	