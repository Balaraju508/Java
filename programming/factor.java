import java.util.*;
class R{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int a=sc.nextInt();
		int c=0;
		if(a>0)
		{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					c++;
				}	
			}
			System.out.println(c);
			
		}
	}
}
//no of ways to factors

1.for(int i=1;i<=n;i++)					fc=2
2.for(int i=2;i<=n;i++)					fc=1
3.for(int i=1;i<n;i++)					fc=1
4.for(int i=2;i<n;i++)			(n!=0&&n!=1)	fc=0
5.for(int i=1;i<=n/2;i++)				fc=1
6.for(int i=2;i<=n/2;i++)  		(n!=0&&n!=1)	fc=0
7.for(int i=1;i<=(int)Math.sqrt;i++)	(n!=0&&n!=1)	fc=1
8.for(int i=2;i<=(int)Math.sqrt;i++)	(n!=0&&n!=1)	fc=0