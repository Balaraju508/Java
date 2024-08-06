//10.create a java app where we have one cls it contains a non static method m1 having parameter as string and returns ntg and static method m2 having parameter as double and returns ntg and non static method m3 having parametr as long , float and returns ntg then invoke m1 under m2 ,m2 under m3 and m3 under main method
class J{
	static J obj = new J();
	void m1(String a)
	{
		System.out.println(a);
	}
	static void m2(double b)
	{
		System.out.println(b);
		obj.m1("balu");
	}
	void m3(long c,float d)
	{
		System.out.println(c);
		System.out.println(d);
		m2(1.445);
	}
	public static void main(String args[])
	{
		obj.m3(133333l , 1.5f);
	}
}
		