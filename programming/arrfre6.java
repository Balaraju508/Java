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
			int t=0;
			int ir=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					t++;
				}
			}
			for(int j=i;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					ir++;
				}
			}
			if(t==ir)
			{
				System.out.println(arr[i]+"->"+t);
			}
		}
	}
}