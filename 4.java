//3.create a java app where we have one cls it contains one static varialbe and one local variable then print all these variables
class D{
	static int a=10;
	float b=1.7f;
	public static void main(String args[])
	{
		char c='d';
		System.out.println(a);
		D obj=new D();
		System.out.println(obj.b);
		System.out.println(c);
	}
}