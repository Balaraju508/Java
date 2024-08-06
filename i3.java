//create a java app where we have one cls bank it contains a variable balance with static input and we have 2 non static methods like withdraw and deposit then inherit these class into class user and based on user requirement invoke the respective methods
import java.util.*;
class bank
{
	static Scanner sc=new Scanner(System.in);
	double balance=2000;
	double withdraw(double a)
	{
		balance	=balance-a;
		return balance;
	}
	double deposit(double a)
	{
		if(balance>=a)
		{
			balance =balance+a;
			System.out.println("successful");
		}
		else{
			System.out.println("insufficient funds");
		}
		return balance;
	}
}
class user extends bank
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("1.withdraw\n2.deposit");
		user obj=new user();
		int n=sc.nextInt();
		if(n==1)
		{
		System.out.println("enter a amount");
		System.out.println("avail balance="+obj.withdraw(sc.nextDouble()));
		}
		else if(n==2)
		{
		System.out.println("enter a amount");
		System.out.println("avail balance="+obj.deposit(sc.nextDouble()));	
		}
		else{
			System.out.println("invalid input");
		}
	}
}