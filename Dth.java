import java.util.*;
class recharge{
	static Scanner sc=new Scanner(System.in);
	double sundirect(int plan)
	{
		if(plan==1)
		{
			return 240;
		}
		else if(plan==2)
		{
			return 399;
		}
		return 675;
	}
	double airtel(int plan)
	{
		if(plan==1)
		{
			return 270;
		}
		else if(plan==2)
		{
			return 467;
		}
		return 899;
	}
	double tatasky(int plan)
	{
		if(plan==1)
		{
			return 150;
		}
		else if(plan==2)
		{
			return 290;
		}
		return 589;
	}
}
class plan extends recharge{
	void selection()
	{
		System.out.println("select your plan");
		System.out.println("1-for 30days\n2-for 56days\n3-for 84days");
		int n=sc.nextInt();
		if(n==1)
		{
			double bill=sundirect(n);
			billing(bill);
		}
		else if(n==2)
		{
			double bill=airtel(n);
			billing(bill);
		}
		else if(n==3)
		{
			double bill=tatasky(n);
			billing(bill);
		}
		else
		{
			System.out.println("invalid option");
		}
	}
	void billing(double bill)
	{
		System.out.println("your bill:"+bill);
		double tax=bill*0.02;
		System.out.println("tax="+tax);
		System.out.println("total bill="+(bill+tax));
	}
}
class user extends plan
{
	public static void main(String args[])
	{
		user x=new user();
		System.out.println("1.for sundirect\n2.for airtel\n3.for tatasky");
		System.out.println("enter your DTH connection");
		int n1=recharge1.sc.nextInt();
		if(n1==1)
		{
			x.selection();
		}
		else if(n1==2)
		{
			x.selection();
		}
		else if(n1==3)
		{
			x.selection();
		}
		else
		{
			System.out.println("invalid input");
		}
		
	}
}	