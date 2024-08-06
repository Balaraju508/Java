import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	A(int a)
	{
		System.out.println(a);
	}
}
class B extends A
{
	B()
	{
		super(sc.nextInt());
	}
	public static void main(String args[])
	{
		B x=new B();
	}
}		