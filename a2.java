// create a java app where we have a one abstract cls it contains 2 abstarct methods and define method and parameterrized constructor themn inherit this cls into an abstract cls which contains one abstract method and one defined method then provide functionality for this method by taking a concrete cls and then invoke all the methods by providing dynamic inputs
import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract float m1(int a);
	abstract String m2(float a);
	int m3(String a)
	{
		System.out.println(a);
	}
	A(int a)
	{
		System.out.println(a);
	}
}
abstract class B extends A
{
	abstract short m4(float a);
	float m5(short a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class C extends B
{
	float m1(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	String m2(float a)
	{
		System.out.println(a);
		return sc.next();
	}
	short m4(float a)
	{
		System.out.println(a);
		return sc.nextShort();
	}
	C()
	{
		super(sc.nextInt());
	}
	public static void main(String args[])
	{
		C x= new C();
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m2(sc.nextFloat()));
		System.out.println(x.m3(sc.next()));
		System.out.println(x.m4(sc.nextFloat()));
		System.out.println(x.m5(sc.nextShort()));
	}



}