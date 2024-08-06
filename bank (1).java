import java.util.*;
public class Bank
{
    static Scanner sc=new Scanner(System.in);
    double balance =10000;
    double withdraw (double amount)
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
    double deposit (double amount)
    {
        balance=balance+amount;
        return balance;
    }
    void transaction()
    {
        System.out.println("1 for withdraw \n2 for deposit");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("enter withdraw amount");
            System.out.println("available balance = "+withdraw(sc.nextDouble()));
            System.out.println("press 1 for one more transaction\npress 2 to exit");
            selection();
        }
        else if(n==2)
        {
            System.out.println("enter deposit amount");
            System.out.println("available balance = "+deposit(sc.nextDouble()));
            System.out.println("press 1 for one more transaction\npress 2 to exit");
            selection();
        }
        else{
            System.out.println("invalid input \npress 1 to try again\npress 2 to exit");
           selection();
        }
    }
    void selection()
    {
        int n1=sc.nextInt();
            if(n1==1)
            {
                transaction();
            }
            else{
                System.out.println("Thank you visit again");
            }
    }
	public static void main(String[] args) {
	    Bank x=new Bank();
	    x.transaction();
	}
}