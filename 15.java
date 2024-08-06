//15.create a java app where we have one cls it contains static m1 having int as parameter and returns string type of val and m2 having parameter as boolean and returns float type of value then invoke these methods under main method by providing dyanmic input
import java.util.Scanner;
class O{
	static Scanner sc=new Scanner(System.in);
	static String m1(int a)
	{
		System.out.println(a);
		String s=sc.next();
		return s;
	}
	static float m2(boolean b)
	{
		System.out.println(b);
		float t=sc.nextFloat();
		return t;
	}
	public static void main(String args[])
	{
		int c=sc.nextInt();
		System.out.println(m1(c));
		boolean d= sc.nextBoolean();
		System.out.println(m2(d));
	}
}		