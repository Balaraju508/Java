//20.create a java app where we have 1 cls it contains a static method having no parameters n returns int type of value n non static method m2 having no parameters n returns ntg m1 method contains a local variable then print that local variable under m2 by providing dynamic inputs 

import java.util.Scanner;
class T
{	
	static Scanner sc = new Scanner(System.in);
	static int m1()
	{
		System.out.println("m1");
		int a = sc.nextInt();
		return a;
	}
	void m2()
	{
		System.out.println(m1());
	}
	public static void main(String[] args)
	{
		T obj = new T();
		obj.m2();
	}
}