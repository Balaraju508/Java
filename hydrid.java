import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
}
class B extends A{
	int b=sc.nextInt();
}
class C extends B{
	int c=sc.nextInt();
}

class D extends C{
	int d=sc.nextInt();
}
class E extends D implements A{
	int e=sc.nextInt();
	int sum= a+b+c+d;
	void display(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(sum);
	}

}
class main{
public static void main(String args[])
{
	E x=new E();
	x.display();
}
}
