//30.create java app where we need to satisfy all 8 types methods and invoke any one of the method under main method rest under another method by providing dynamic inputs.

import java.util.*;
class DD{
	static Scanner sc=new Scanner(System.in);
	static int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	static float m2()
	{
		System.out.println("m2");
		System.out.ptintln(m1(sc.next()));
		return sc.nextFloat();
	}
	static void m3(int a)
	{
		System.out.println(a);
		System.out.println(m2());
	}
	static void m4()
	{
		System.out.println("m4");
		System.out.println(m3(sc.nextInt()));
	}
	char m5(String a)
	{
		System.out.println(a);
		m4(sc.nextInt());
		return sc.next().charAt(0);
		
	}
	void m6()
	{
		System.out.println("m6");
		System.out.println(m5(sc.nextInt()));
		return sc.nextInt();
	}
	void m7(int a)
	{
		System.out.println(a);								
		System.out.println(m6());
		
	}
	void m8()
	{
		System.out.println("m8");
		System.out.println(m7(sc.nextInt()));
	}
	public static void main(String args[])
	{
		System.out.println(new DD().m8());
	}
}
		