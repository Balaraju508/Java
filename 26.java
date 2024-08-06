//26.create a java app where we have one cls it contains a static method add having parameters as 2 int values and returns the addition of parameters and another styatic method sub having parameters as 2 int values and returns the substraction of parameters and non static method multiply having no parameters and returns the multiplication of add,sub return values then invoke multiply under main method'


import java.util.*;
class Y{
	static Scanner sc=new Scanner(System.in);
	static int add(int a,int b){
		return a+b;
	}
	static int sub(int a,int b){
		return a-b;
	}
	int multiply(){
		int a=add(sc.nextInt(),sc.nextInt());
		int b=sub(sc.nextInt(),sc.nextInt());
		return a*b;
	}
	public static void main(String args[])
	{
		Y obj = new Y();
		System.out.println(obj.multiply());
	}
}
	