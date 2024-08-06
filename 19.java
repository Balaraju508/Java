//19.crete a java app where we have one cls it contains two non static methods having parameter and return type then invoke these methods under main method without storing object by providing dynamic inputs.
import java.util.*;
class S{
	static Scanner sc= new Scanner(System.in);
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
	public static void main(String args[])
	{
		System.out.println(new S().m1(sc.nextFloat()));
		System.out.println(new S().m2(sc.nextInt()));
	}
}