import java.util.*;
class A{
static Scanner sc = new Scanner(System.in);
public static void main(String args[])
{
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	Range(n1,n2);
}
public static void Range(int n1,int n2)
{
	if(n1<=n2)
	{
		if(factcount(1,n1)==2)
		{
			System.out.println(n1);
		}
		Range(n1+1,n2);
	}
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