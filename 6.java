//6.create a java application where we have one class it contains 2 static variables and 2 instance variables then we have a methos m1 having no parameters and returns nothing and having static property print all those variables under m1 method and invoke m1 under main method.



class F
{
	static char a='d';
	static int b=20;
	float c=3.9f;
	boolean d=true;
	static void m1()
	{
		System.out.println(a);
		System.out.println(b);
		F obj= new F();
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
	public static void main(String args[]){
		m1();
	}
}


			

			
