import java.util.*;
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
}