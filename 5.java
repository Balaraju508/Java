//5.create a java app where we have one cls it contains two static variables and one two non static variables without initialization then print these variables under main method and initialize these variable after that print these variables.

class E{
	static char a;
	static float b;
	int c;
	public static void main(String args[])
	{
		E obj =new E();
		System.out.println(obj.c);
		a='b';
		b=5.5f;
		obj.c=10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(obj.c);
	}
}
	
	