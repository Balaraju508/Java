//22.create a java app where we have one cls it contains 3 non static methods and 3 static methods then invoke these non static methods one in another static method respectivily and invoke all these static methods under main method by providing dynamic inputs.
import java.util.Scanner;
class V
{
	static Scanner sc = new Scanner(System.in);
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	String m2(int b)
	{
		System.out.println(b);
		return sc.next();
	}
	Boolean m3(char c)
	{
		System.out.println(c);
		return sc.nextBoolean();
	}
	static int m4(float d)
	{
		System.out.println(d);
		System.out.println(new V().m1(sc.nextFloat()));
		return sc.nextInt();
	}
	static String m5(int e)
	{
		
		System.out.println(e);
		System.out.println(new V().m2(sc.nextInt()));
		return sc.next();
	}
	static char m6(float f)
	{
		System.out.println(f);
		System.out.println(new V().m3(sc.next().charAt(0)));
		return sc.next().charAt(0);
	}
	public static void main(String args[])
	{
		
		System.out.println(m4(sc.nextFloat()));
		System.out.println(m5(sc.nextInt()));
		System.out.println(m6(sc.nextFloat()));
	}
}




		