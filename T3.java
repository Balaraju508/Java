//create a java app where we have one cls it contains a method m1 which prints values from 10m to 20 and 30 to 40 then access this resource from 2 diff threads working on same obj here we should get one by one thread flow  for first and parallel flow for 2nd flow

class A
{
	void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		synchronized(this)
		{
			for(int i=10;i<=20;i++)
			{
				System.out.print(i+" ");
			}
		}
	}
}
class B extends Thread
{
	static A x=new A();
	public void run()
	{
		x.m1();
	}
	public static void main(String args[])
	{
		B t1=new B();
		B t2=new B();
		t1.start();
		t2.start();
	}
}		
