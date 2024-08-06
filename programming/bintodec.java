import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		String b=sc.nextLine();
		int dec=0;
		int p=0;
		for(int i=(b.length()-1);i>=0;i--)
		{
			char ch=b.charAt(i);
			if(ch=='0'||ch=='1')
			{
				dec=dec+(ch-48)*(int)Math.pow(2,p++);
			}
		}
		System.out.println(dec);
	}
}
