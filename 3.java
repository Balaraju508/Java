//2.create a java app where we have one cls it contains two static variables and two instance variables then print all those variables under main method

class C{
	static int a=10;
	static int b=20;
	boolean c=true;
	char d='a';
	public static void main(String args[])
	{
		System.out.println(a);
		System.out.println(b);
		C obj=new C();
		System.out.println(obj.c);
		System.out.println(obj.d);

	}
}
	
	
	
