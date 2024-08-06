//15.Write a program to print all numbers which are divisible by 11 from 250 to 550.
import java.util.*;
class O{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(i%11==0)
			{
				System.out.println(i);
			}

		}
	}
}