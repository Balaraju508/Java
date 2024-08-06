//.create a java app wheere we have cls restarent in contains 2 ns methods like chicken and mjutton biryani having parameter as quantity and returns toatal amount then inherit these restarent into 2 diff clses swiggy and zomato here we ahve a method selection which dispalys the items and based on user input ask the quantity and call respective method then tak ea static variable bill and add the respective amount amnd user complets\es all these order then take a separate method biling and pass bill as parameter to that method in that method dispaly amount and add 15 percent doiscount and the bill is above 1500 thenm give a discount of 10% and dispaly y]the  then take seperste cls user if user want to zomato or else user wanyt to order in swiggy then invoke these clses in main method
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