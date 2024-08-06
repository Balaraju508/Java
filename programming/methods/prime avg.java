import java.util.*;
class A{
static Scanner sc = new Scanner(System.in);
public static void main(String args[])
{
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.println(Range(n1,n2));
}
public static int Range(int n1,int n2)
{
	int sum=0;
	if(n1<=n2)
	{
		if(factcount(1,n1)==2)
		{
			sum=n1;
		}
		sum=sum+Range(n1+1,n2);
	}
	return sum;
}
public static int factcount(int i,int n)
{
	int c=0;
	if(i<=n)
	{
		if(n%i==0)
		{
			c=1;
		}
		return c+factcount(i+1,n);
	}
	return c;
}
}