//13.creta a java app where we have one cls it contains a static method m1 and returns int type of value and another static method m2 having parameter as int and returns ntg then invoke these two methods under main method here pass m1 methods return value as m2 methods parameter.
class M{
	static int m1()
	{
		System.out.println("m1");
		return 10;
	}
	static void m2(int a)
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		int a = m1();
		m2(a);
	}
}
		