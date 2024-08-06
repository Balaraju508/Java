import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int t[]=new int[arr[j]];
				for(int k=i;k<=j;k++)
				{
					t[k]=arr[k];
					System.out.print(t[k]);
				}
				System.out.println();
			}
		}
	}
}