//create a java app where we need to create 2 custom defined threads one thread will print values from 1 to 15.and another thread will print the values from 20 to 30

import java.util.*;
class AA12 extends Thread
{
	public void run()
	{
		for(int i=1;i<=15;i++)
		{						
			System.out.print(i+" ");
		}
	}
}
class BB12 extends Thread 
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{						
			System.out.print(i+" ");
		}
	}	
	public static void main(String[] args)
	{
		AA12 t1=new AA12();
		t1.start();
		BB12 t2=new BB12();
		t2.start();
	}
}
