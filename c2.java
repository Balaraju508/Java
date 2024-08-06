//c2.create a java app wheere we have 1 cls it contains 2 instance variables and a default constructor and single parameterised constructor and double and triple then invoke default under single para,single under double ,double under triple and triple under main method by providing dynamioc inputs.
import java.util.*;
class c2{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String b=sc.next();
	c2()
	{
		System.out.println(a+" "+b);
	}
	c2(int a){
		System.out.println(a);
		new c2();
	}
	c2(int a,float b)
	{
		System.out.println(a+" "+b);
		new c2(sc.nextInt());
	}
	c2(int a,float b,String c) 
	{
		System.out.println(a+" "+b+" "+c);
		new c2(sc.nextInt(),sc.nextFloat());
	}
	public static void main(String args[])
	{
		new c2(sc.nextInt(),sc.nextFloat(),sc.next());
	}
}