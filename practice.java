import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	A()
	{
		System.out.println("hi");
	}
	A(A x)
	{
		System.out.println("hello");
	}
	public static void main(String args[])
	{
		A x=new A();
		A x1=new A(x);
	}
}