//create java app where we have one cls it contains two instance varialbes with out initialise then initialize these variabnles while craeting objectand them print those variables under a method display

import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int a;
	String b;
	A(int a,String b){
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String args[])
	{
		A x=new A(sc.nextInt(),sc.next());
		x.display();
		
	}
}
	