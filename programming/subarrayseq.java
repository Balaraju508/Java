import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter array ele: - "+i+" ");
			arr[i]=sc.nextInt();	
		}
		for(int i=1;i<(int)Math.pow(2,n);i++)
		{
			int dup=i;
			int c=0;
			int sum=0;
			while(dup>0)
			{
				int r=dup%2;
				dup=dup/2;
				if(r==1)
				{
					System.out.print(arr[c]);
					sum=sum+arr[c];
				}
				c++;
			}
			System.out.print("->"+sum);
		System.out.println();
		}
	}
}