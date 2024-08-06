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
		for(int i=1;i<n;i++)
		{
			int ele=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>ele)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=ele;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}