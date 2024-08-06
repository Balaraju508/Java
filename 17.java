//17.create a java app where we have one cls it contains two instance variable and two non static methods having no parameter and returns ntg then  print those variables under these two methods and invoke these methods under main method and each method by using different object.

import java.util.Scanner;
 class Q{
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	String b=sc.next();
	void m1()
	{
		System.out.println(a+" "+b);
	}
	void m2()
	{
		System.out.println(a+" "+b);
	}
	public static void main(String args[])
	{
		Q obj=new Q();
		obj.m1();
		Q raj=new Q();
		raj.m2();
	}
}

