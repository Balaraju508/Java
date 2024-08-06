/*16.Write programs to print the following series. 
A) 100,200,300........10000
B) 5^2, 7^2,9^2.....25^2
C) 5,10,5,10,5,10,5,10...... 10 times
D) 5*4,5*3,5*2,......5*(-12)       (Print in two ways – patter & multiplied value)
E) 1,even,3,even,5,even,.......35,even
F)  1,2,factor of three,4,5,factor of three, 7,8,factor of three,..........22,23,factor of three.                                          
G) 1,3, divisible by five, 7,9, 11,13, divisible by five,.....21,23, divisible by five                                                                   
h) 20,30,40,Oh! I got fifty, 60,70,80,90,100 
i) 0.5^2, 0.7^2,0.9^2....5.1^2*/

/*a

import java.util.*;
class P{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i=i+100)
		{
			System.out.print(i+" ");
		}
	}
}*/

/*b
import java.util.*;
class P{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		for(int i=a;i<=b;i=i+2)
		{
			System.out.println(i+"^"+c);
		}

	}
}*/

/*c
import java.util.*;
class P{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			if (a==5&&b==10)
			{
				System.out.println(a+","+b);
			}
		}
	}
}*/

/*d

import java.util.*;
class P{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=b;i>=-12;i--)
		{
			System.out.print(a+"*"+i+",");
		}
		
	}
}*/

/*e

import java.util.*;
class P{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String c=sc.next();
		for(int i=a;i<=b;i++)
		{
			if(i%2==1)
			{
				
				System.out.println(i+","+c);
			}
		}
	}
}*/

//f

import java.util.*;
class P{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String c=sc.next();
		for(int i=a;i<=b;i=i+3)
		{	
			System.out.println(i);
		}
		for(int j=2;j<=b;j=j+3)
		{	
			System.out.println(j);
		}
		System.out.println(c);
	}
}
		
		
