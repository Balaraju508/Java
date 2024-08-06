import java.util.*;
abstract class RBI
{
	static Scanner sc=new Scanner(System.in);
	double balance=1000000;
	abstract double withdraw(double amount);
	abstract double deposit(double amount);
	abstract double balanceenquery(double amount);
}
class UNIONBANK extends RBI
{
	public double withdraw(double amount)
	{
		if(balance!=0)
		{
			balance=balance-amount;
		}
		else{
			System.out.println("insufficient funds");
		}
		return sc.nextDouble();
	}
	public double deposit(double amount)
	{
		double deposit=0;
		deposit=deposit+amount;
		return sc.nextDouble();
	}
	public double balanceenquery(double amount)
	{
		if(balance!=0)
		{
			System.out.println(balance);
		}
		else
		{
			System.out.println("insufficient funds");
		}
		return sc.nextDouble();
	}
}
class KOTAK extends RBI
{
	double withdraw(double amount)
	{
		if(balance!=0)
		{
			balance=balance-amount;
		}
		else{
			System.out.println("insufficient funds");
		}
		return sc.nextDouble();
	}
	double deposit(double amount)
	{
		double deposit=0;
		deposit=deposit+amount;
		return sc.nextDouble();
	}
	double balanceenquery(double amount)
	{
		if(balance!=0)
		{
			System.out.println(balance);
		}
		else
		{
			System.out.println("insufficient funds");
		}
		return sc.nextDouble();
	}
}
class user
{
	public static void main(String args[])
	{
		System.out.println("\n1.for union bank\n2.for kotak bank");
		int n=RBI.sc.nextInt();
		if(n==1)
		{
			UNIONBANK x=new UNIONBANK();
			System.out.println(x.withdraw(RBI.sc.nextDouble()));
			System.out.println(x.deposit(RBI.sc.nextDouble()));
			System.out.println(x.balanceenquery(RBI.sc.nextDouble()));
		}
		else if(n==2)
		{
			KOTAK x=new KOTAK();
			System.out.println(x.withdraw(RBI.sc.nextDouble()));
			System.out.println(x.deposit(RBI.sc.nextDouble()));
			System.out.println(x.balanceenquery(RBI.sc.nextDouble()));
		}
		else{
			System.out.println("Invalid input");
		}
	}
}	
	