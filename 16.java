//16.create a java app where we have one cls it contains non static m1 having parameter as int ,short and returns ntg and static method m2 having parameter as boolean,long,double and returns char type of val then invoke these methods under main method by providing dynamic inputs
import java.util.Scanner;
class P{
	static Scanner sc=new Scanner(System.in);
	void m1(int a,short b)
	{
		System.out.println(a+" "+b);
		
	}
	static char m2(boolean c,long d,double e)
	{
		System.out.println(c+" "+d+" "+e);
		char f=sc.next().charAt(0);
		return f;
	}
	public static void main(String args[])
	{
		P obj=new P();
		int a=sc.nextInt();
		short b=sc.nextShort();
		obj.m1(a,b);
		boolean	c=sc.nextBoolean();
		long d=sc.nextLong();
		double e=sc.nextDouble();
		System.out.println(m2(c,d,e));
	}
}

		
		