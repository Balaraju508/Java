import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int c=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter array ele: - "+i+" ");
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<n;i++)
		{
			int key =20;
			for(int j=i;j<n;j++)
			{
				for(int k=i;k<=j;k++)
				{
					sum=arr[i]+arr[j];
					if(sum==key)
					{
						System.out.println(arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}
}