//23.create a java app where we have one cls it contains a static metohd m1 having integer parameter and returns boolean type of value and another static methiod m2 having parameter as string ,float and returns char type of value then invoke m1 under main method if m1 returns true then invoke m2 method or else print a user friendly msg by providing dynamic input.
import java.util.*;
class W{
	static Scanner sc=new Scanner(System.in);
	static Boolean m1(int a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	static char m2(String b,float c)
	{
		System.out.println(b);
		return sc.next().charAt(0);
	}
	public static void main(String args[])
	{
		int a=m1(sc.nextInt());
		if(a==true)
		{
			System.out.println(m2(sc.next(),sc.nextFloat()));
		}
		else
		{
			System.out.println(sc.next());
		}
	}
}
