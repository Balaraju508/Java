import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		String s=sc.next();
		String arr[]=new String[s];
		for(int i=0;i<=s.length()-1;i=i+2)
		{
			if(arr[i]=="a"||arr[i]=="e"||arr[i]=="i"||arr[i]=="o"||arr[i]=="u")
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
	}
}