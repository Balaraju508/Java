import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
}
class B extends A{
	int a=sc.nextInt();
	void m1()
	{
		System.out.println(super.a);
	}
public static void main(String args[])
{
	B obj= new B();
	obj.m1();
}
}
	
