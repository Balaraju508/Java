//31 create a java app where we have one cls it contains a static method having parameter and return type,non static method having parameter and return type then invoke these methods under main method without creating or storing the obj by proving dynamic input.

import java.util.*;
class EE{
	static Scanner sc=new Scanner(System.in);
	static int m1(string a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	float m2(char a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public static void main(String args[])
	{
		m1(sc.next());
		new EE().m2(sc.next().charAt(0));
	}
}