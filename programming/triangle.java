import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<n;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				for(int j=i;j<n;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=n-1;i>=1;i--)
			{
				for(int j=i;j<n;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				for(int j=i;j<n;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}