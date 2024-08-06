import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		String s=sc.next();
		for(int i=0;i<=s.length()-1;i=i+2)
		{
			if(i=="a"||i=="e"||i=="i"||i=="o"||i=="u")
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
	}
}