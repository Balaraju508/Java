//9.create a java app where we have one cls it contains a non static method m1 having parametres as int string,boolen returns ntg and static method m2 having parameters as char and returns ntg then invoke these two method under main method.

class I{
	void m1(int a, String b, boolean c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void m2(char d)
	{
		System.out.println(d);
	}
	public static void main(String args[])
	{
		I obj=new I();
		obj.m1(10,"bala",true);
		m2('d');
	}
}
	