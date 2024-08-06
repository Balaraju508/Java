import java.util.*;
class STUDENT{
	static Scanner sc=new Scanner(System.in);
	static int m1()
	{
		int STUDENT_ID=sc.nextInt();
		return sc.nextInt();
	}
	static int m2()
	{
		String STUDENT_NAME=sc.next();
		return sc.nextInt();
	}
	static int m3()
	{
		int STUDENT_MARKS=sc.nextInt();
		return sc.nextInt();
	}
	STUDENT(int STUDENT_ID,String STUDENT_NAME,int STUDENT_MARKS)
	{
		System.out.println(STUDENT_ID);
		System.out.println(STUDENT_NAME);
		System.out.println(STUDENT_MARKS);
	}
	public static void main(String args[])
	{
		System.out.println(m1());
		System.out.println(m2());
		System.out.println(m3());
		new STUDENT(sc.nextInt(),sc.next(),sc.nextInt());
	}
}