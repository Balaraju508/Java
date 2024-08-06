//.14 create a java app where we have one cls two static variables and two instance variable s then print these variables under main method by using dynamic inputs.
import java.util.Scanner;
class N{
	static Scanner sc= new Scanner(System.in);
	static int a=sc.nextInt();
	static float b=sc.nextFloat();
	String c=sc.next();
	double d=sc.nextDouble();
	public static void main(String args[])
	{
		System.out.println(a);
		System.out.println(b);
		N obj=new N();
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
	