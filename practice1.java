//create java app where we have one cls it contains one instance variable ,and parametered constructor and m1 method having parameter invoke constructor under main method
import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	A(int a)
	{
		System.out.println(a);
	}
	A()
	{
		this(sc.nextInt());
		this.sc.nextInt();
		m1(sc.nextFloat());
	}
	public static void main(String args[])
	{
		A x =new A();
	}
}