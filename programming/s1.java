import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		String s=sc.next();
		for(int i=0;i<=s.length()-1;i++)
		{
			System.out.println(s.chatAt(i));
		}
	}
}