import java.util.*;
interface A
{
	int m1(float a);
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		A x=(a)->{
			System.out.println(a);
			return sc.nextInt();
		};
		System.out.println(x.m1(sc.nextFloat()));
	}
}