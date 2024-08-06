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
		for(int i=1;i<=n;i++)
		{
			System.out.println(Arrays.toString(arr));
			int ele=arr[0];
			for(int j=1;j<n;j++)
			{
				arr[j-1]=arr[j];
			}
			arr[n-1]=ele;
		}
	}
}