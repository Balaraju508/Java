import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	static String b=sc.next();
	A(){
	System.out.println(a);
	System.out.println(b);
	}
	A(boolean a){
	System.out.println(a);
	}
	A(int a,long b){
	System.out.println(a+" "+b);
	new A(sc.nextBoolean());
	}
	A(short a,char b,float c){
	System.out.println(a+" "+b+" "+c);
	new A(sc.nextInt(),sc.nextLong());
	}
	A(A obj)
	{
	System.out.println(obj.a);
	System.out.println(b);
	}
	public static void main(String args[]){
	A x=new A(sc.nextShort(),sc.next().charAt(0),sc.nextFloat());
	new A(x);
	}
}
	