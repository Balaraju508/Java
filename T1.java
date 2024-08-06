class A
{
	static synchronized void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	void m2()
	{
		for(int i=10;i<=20;i++)
		{
			System.out.println(i);
		}
	}
}
class B extends Thread
{
	static A x=new A();
	public void run()
	{
		new A().m1();
		x.m2();
	}
	public static void main(String args[])
	{
		B t1=new B();
		t1.start();
		B t2=new B();
		t2.start();
	}
}
		