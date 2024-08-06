//12.create a java app where we have one cls it contains non static method m1 having parameter as int and returns float type of value and static method m2 having parameter as boolean and returns char then invoke m1 under m2,m2 under main method.
class L{
	
	float m1(int a)		
	{
		System.out.println(a);
		return 2.2f;
	}
	static char m2(boolean b)
	{
		System.out.println(b);
		L obj = new L();
		System.out.println(obj.m1(16));
		return 'c';
		
	}
	public static void main(String args[])
	{
		System.out.println(m2(true));
	}
}
		
