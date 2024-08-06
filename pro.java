import java.util.*;
class Phonepe
{
	static Scanner sc=new Scanner(System.in);
	double balance =sc.nextInt();
    	double send(double amount)
    	{
        	if(balance>=amount)
        	{
            		balance=balance-amount;
            		System.out.println("transaction successfull");
        	}
        	else
        	{ 
            		System.out.println("Insuffient funds");
        	}
        	return balance;
    	}
   	double recieve(double amount)
    	{
        	balance=balance+amount;
        	return balance;
    	}
	double checkbalance(double amount)
	{
		if(balance != 0)
		{
			return balance;
		}
		else
		{
			System.out.println("insufficient balance");
		}
		return balance;
	}
	double tomobile(double phno)
	{
		if(
