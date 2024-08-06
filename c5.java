import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	void m1(int a){
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String args[]){
	A x=new A();
	x.m1(sc.nextInt());
}
}