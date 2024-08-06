//21.create a java app where we have one cls it contains 3 non static methods having parameter and return type and one static variable and one non static variable then print these variables in any one of the method and invoke these methods under main method by using object reference 
import java.util.*;
class U{
	static Scanner sc = new Scanner(System.in);
	static int d=sc.nextInt();
	String e=sc.next();
	int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	float m2(char b)
	{
		System.out.println(b);
		return sc.nextFloat();
	}
	String m3(int c)
	{
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		return sc.next();
	}
	public static void main(String args[])
	{
		System.out.println(new U().m1(sc.next()));
		System.out.println(new U().m2(sc.next().charAt(0)));
		System.out.println(new U().m3(sc.nextInt()));
	}
}
