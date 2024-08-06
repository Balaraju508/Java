//18.create java app where we have one cls it contins two static variables and two instance variables and non static method m1 having parameter and return type and static method m2 having parameter and return type and a non static method m3 having no parameters and return sting type of values then invoke m1 under m2 m2 under m3 m3 under main method and print those variables under m2 method by providing dynamic inputs.
//.note: do not create object globally

import java.util.*;
class R{
	static Scanner sc=new Scanner(System.in);
	static String a=sc.next();
	static boolean b=sc.nextBoolean();
	int c=sc.nextInt();
	float d=sc.nextFloat();
	char m1(String a)
	{
		System.out.println(a);
		return sc.next().charAt(0);
	}
	static int m2(float c)
	{
		System.out.println(c);
		R obj =new R();
		System.out.println(obj.m1(sc.next()));
		System.out.println(R.a);
		System.out.println(R.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		return sc.nextInt();
		
	}
	String m3()
	{
		System.out.println("m3");
		System.out.println(m2(sc.nextFloat()));
		return sc.next();
	}
	public static void main(String args[])
	{
		R obj=new R();
		System.out.println(obj.m3());
	}
}
		