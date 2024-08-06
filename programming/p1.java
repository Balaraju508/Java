/*import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

/*import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/


/*import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}*/

/*import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}*/

/*import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}*/


/*import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		int c=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
	}
}*/

import java.util.*;
class A{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}


