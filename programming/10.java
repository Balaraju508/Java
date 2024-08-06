/*10.Write a Program to print the all alphabets by using character Variable?
import java.util.*;
class J{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch>='a'&&ch<='z')
		{
			for(char i='a';i<='z';i++)
			{
				System.out.println(i+" ");
			}
		}
		else if(ch>='A'&&ch<='Z')
		{
			for(char i='A';i<='Z';i++)
			{
				System.out.println(i+" ");

			}
		}
	}
}*/
