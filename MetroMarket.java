import java.util.*;
class Market
{
	static Scanner sc=new Scanner(System.in);
	double Ricepacket(int quantity)
	{
		if(quantity<=25)
		{
			return 30*quantity;
		}
		else if(quantity<=50)
		{
			return 30*quantity;
		}
		return 30*quantity;
	}
	double Dalpacket(int quantity)
	{
		if(quantity<=25)
		{
			return 70*quantity;
		}
		else if(quantity<=50)
		{
			return 70*quantity;
		}
		return 70*quantity;
	}
	double Wheatflour(int quantity)
	{
		if(quantity<=5)
		{
			return 40*quantity;
		}
		else if(quantity<=10)
		{
			return 40*quantity;
		}
		return 40*quantity;
	}
	double Santoor(int quantity)
	{
		if(quantity>=4)
		{
			return 30*quantity;
		}
		else if(quantity<=10)
		{
			return 30*quantity;
		}
		return 30*quantity;
	}
	double Hairoil(int quantity)
	{
		if(quantity<=1)
		{
			return 50*quantity;
		}
		else if(quantity<=5)
		{
			return 50*quantity;
		}
		return 50*quantity;
	}
}
class MetroMarket extends Market
{
	static double bill;
	void selection()
	{
		System.out.println("1 for Ricepacket\n2 for Dalpacket\n3 for Wheatflour\n4 for Santoor\n5 for Hairoil");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("select quantity");
			bill=bill+Ricepacket(sc.nextInt());
			billing(bill);
		}
		else if(n==2)
		{
			System.out.println("select quantity");
			bill=bill+Dalpacket(sc.nextInt());
			billing(bill);

		}
		else if(n==3)
		{
			System.out.println("select quantity");
			bill=bill+Wheatflour(sc.nextInt());
			billing(bill);

		}
		else if(n==4)
		{
			System.out.println("select quantity");
			bill=bill+Santoor(sc.nextInt());
			billing(bill);

		}
		else if(n==5)
		{
			System.out.println("select quantity");
			bill=bill+Hairoil(sc.nextInt());
			billing(bill);

		}
		else{
			System.out.println("invalid selection");
			System.out.println("1 to order more\n2 any num to exit");
			int n1=sc.nextInt();
			if(n1==1)
			{
				selection();
			}
			else
			{
				billing(bill);
			}
		}
	}
	void billing(double bill)
	{
		System.out.println("Amount="+bill);
		double gst=bill*0.10;
		System.out.println("gst="+gst);
		double disc=0;
		if(bill>=100)
		{
			disc=bill*0.40;
			System.out.println("disc="+disc);
			System.out.println("Total="+(bill+gst));
		}
	}
}
class User
{
	public static void main(String args[])
	{
		MetroMarket x= new MetroMarket();
		x.selection();
	}
}