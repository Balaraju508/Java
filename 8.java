//8.create a java app where we have one cls it contains non static m1 having integer as parameter and returns nothing and non static method m2 having parameters as float, boolean and retrun ntg then invoke thesee two methods under main method
class H{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(float b,boolean c)
	{
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String args[])
	{
	H obj = new H();
	obj.m1(12);
	obj.m2(1.67f,false);
	}
}

	