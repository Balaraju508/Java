import java.util.*;
class A{
static Scanner sc = new Scanner(System.in);
public static void main(String args[])
{
	int n=sc.nextInt();
	System.out.println(fact(1,n));
}
public static int fact(int n1,int n2)
{
	int c=0;
	if(n1<=n2)
	{
		if(n2%n1==0)
		{
			c=1;
		}
		return c+fact(n1+1,n2);
	}
	return c;
}
}