//7.create a java applivcation where we have one class it contains one static variable and one instance variable and a non static method m1 having no parameters and returns nothing in this method we have a local variable then print all those variables and invoke m1 method under main method.
class G
{
	static char a='d';
	boolean b=true;
	static void m1()
	{
		int c=10;	
		System.out.println(c);
	}
	public static void main(String args[])
	{
		G obj = new G();
		obj.m1();
		System.out.println(a);
		System.out.println(obj.b);
	}
}
