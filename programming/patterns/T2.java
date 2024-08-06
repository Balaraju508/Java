class A implements Runnable
{
	void sychronized m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class B implements Runnable
{
	void synchronized run()
	{
		m1();
	}
	public static void main(String args[])
	{
		A x=new A();
		Thread t1=new Thread(x);
		t1.start();
		Thread t2=new Thread(x);
		t2.start();
	}
}
		