//27.cxreate a java app where we have one cls it contains a non static method m1 having parameters and return type and static method m2 having obj as parameter and returns ntg then invoke m1 under m2,m2 under main method by providing dynamic inputs

import java.util.*;
class Z{
	static Scanner sc=new Scanner(System.in);
	int m1(String a){
		System.out.println(a);
		return sc.nextInt();
	}
	static void m2(Z a){
		System.out.println(a.m1(sc.next()));
		System.out.println("m2");
		System.out.println(a);
	}
	public static void main(String args[])
	{
		Z obj = new Z();
		 m2(obj);
	}
}
	 