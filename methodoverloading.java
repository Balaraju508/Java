import java.util.*;
class a{
	static Scanner sc=new Scanner(System.in);
	int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	String m1(float a)
	{
		System.out.println(a);
		System.out.println(m1(sc.next()));
		return sc.next();
	}
	float m1(int a)
	{
		System.out.println(a);
		System.out.println(m1(sc.nextFloat()));
		return sc.nextFloat();
	}
	public static void main(String args[])
	{
		a obj= new a();
		System.out.println(obj.m1(sc.nextInt()));
	}
}