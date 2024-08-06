//29.create java app where we have one cls it contains 4 non static methods having parameter and return type then pass m1 methods return type as m2 parameter and m2 methods return type as m3 parameter ,m3methods return type as m4 parameter by storing them and then invoke all these methods by providing dynamic inputs

import java.util.*;
class BB{
	static Scanner sc=new Scanner(System.in);
	int m1(String a){
		System.out.println(a);
		return sc.nextInt();
	}
	String m2(int a){
		System.out.println(a);
		return sc.next();
	}
	float m3(String a){
		System.out.println(a);
		return sc.nextFloat();
	}
	double m4(float a){
		System.out.println(a);
		return sc.nextDouble();
	}
	public static void main(String args[])
	{
		BB obj=new BB();
		int a=obj.m1(sc.next());
		String b=obj.m2(a);
		float c=obj.m3(b);
		System.out.println(obj.m4(c));
	}
}