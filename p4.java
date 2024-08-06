package p4
import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	private int a=sc.next();		
	private float m1(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class B extends C
{
	interface D
	{	
		default String m2(short a)
		{
			System.out.println(a);
			return sc.next();
	}
	protected double m3(float a)
	{
		System.out.println(a);