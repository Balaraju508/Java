import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		int temp=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{

				if(i==n||j==1||i==j)
				{
					System.out.print(temp+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			temp=temp+2;
		}
	}
}
				
		