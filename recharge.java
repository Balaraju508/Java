import java.util.*;
class recharge{
	static Scanner sc=new Scanner(System.in);
	double Jio(int plan)
	{
		if(plan==1)
		{
			return 265;
		}
		else if(plan==2)
		{
			return 366;
		}
		return 900;
	}
	double Airtel(int plan)
	{
		if(plan==1)
		{
			return 275;
		}
		else if(plan==2)
		{
			return 396;
		}
		return 999;
	}
	double Bsnl(int plan)
	{
		if(plan==1)
		{
			return 175;
		}
		else if(plan==2)
		{
			return 296;
		}
		return 599;
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
			double bill=Jio(n);
			billing(bill);
		}
		else if(n==2)
		{
			double bill=Airtel(n);
			billing(bill);
		}
		else if(n==3)
		{
			double bill=Bsnl(n);
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
		System.out.println("1.for Jio\n2.for Airtel\n3.for Bsnl");
		System.out.println("enter your sim type");
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