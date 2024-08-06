import java.util.*;
class aa{
	static Scanner sc =new Scanner(System.in);
	public static void main(String args[])
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(temp);
		System.out.println(a);
	}
}