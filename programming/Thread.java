import java.util.*;
class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			i=a+i;
		}
	}
	public static void main(String args[])
	{
		A x=new A();
		Thread t1=new Thread(x);
		Thread t2=new Thread(x);
		Thread t3=new Thread(x);
		System.out.println(t1.getName()+" "+t1.isAlive());
		System.out.println(t2.getName()+" "t2.isAlive());
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t1.setName("hi");
		t2.setName("hello");
		t3.setName("bye");
		
	}
}

		