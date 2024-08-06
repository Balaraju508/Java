//c1.create a java app where we have one cls it contains 2 instance variables without initialization then initialize those variables while creating obj by providing dynamic input
import java.util.*;
class c1{
	static Scanner sc= new Scanner(System.in);
	int a;
	int b;
	c1(int c,int d)
	{
		System.out.println(a+" "+b);
		a=c;
		b=d;
		System.out.println(a+" "+b);
	}
	public static void main(String args[])
	{
		new c1(sc.nextInt(),sc.nextInt());
	}
}
		
	
