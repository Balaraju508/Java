//11.create a java app where we have one cls it contains a non static method m1 having parameters string and returns integer type of value and static method m2 having parameter as boolean and retrns ntg and another static method m3 having parameter as float and returns string type of value then invoke all these methods under main method
class K{
	int m1(String a)
	{
		System.out.println(a);
		return 10;
	}	
	static void m2(boolean b)
	{
		System.out.println(b);
	}
	static String m3(float c)
	{
		System.out.println(c);
		return "balu";
	}
	public static void main(String args[])
	{
		K obj = new K();
		System.out.println(obj.m1("n"));
		m2(true);
		System.out.println(m3(1.5f));
		

	}
}