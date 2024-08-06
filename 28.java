//28.create a java app where we have one cls it contains a 2 non static methods having parameter and return tyope then invoke these methids under main methid in single line.

import java.util.*;
class AA{
	static Scanner sc=new Scanner(System.in);
	int add(int a ,int b){
		System.out.println(a);
		System.out.println(b);
		return a+b;
	}
	int sub(int a,int b){

		return a-b;
	}
	public static void main(String args[])
	{
		AA obj=new AA();
		System.out.println(obj.add(obj.sub(sc.nextInt(),sc.nextInt()),sc.nextInt()));
	}
}
	