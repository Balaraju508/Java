import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=(n-2)+1;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}	
}