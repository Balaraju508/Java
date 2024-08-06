import java.util.*;
class Software 
{
	static Scanner sc=new Scanner(System.in);
	int empid=sc.nextInt();
	String design=sc.next();
	String location=sc.next();
}
class emp extends Software
{
	void display()
	{
		System.out.println(empid);
		System.out.println(design);
		System.out.println(location);
	}
	public static void main(String args[])
	{
		emp x=new emp();
		x.display();
	}
}	

	
	