import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	static float m1(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	String m2(float b)
	{
		System.out.println(b);
		return sc.next();
	}
}
class B extends A{
	public static void main(String args[]){
	B obj=new B();
	System.out.println(obj.a);
	System.out.println(m1(sc.nextInt()));
	System.out.println(obj.m2(sc.nextFloat()));
	}
}