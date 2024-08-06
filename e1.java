//create a java app where we have one cls insta it contains two private fields like username and pswd then provide setter ,getter methods for this variables nd then take a cls user and ask user if we wants to reset the pswd then do the respective operation and show the updated pswd orelse if user wants to reset the user name then do the respective process and show him the updated username or else if user wants to update both by using constructor injuction nd show him the updated values


//if we want to compare two string values then we have to use the operator.equals() method in a if condition.
	
//	  eg:
//	.......
//		if(a.equals("username"))
//		if(b.equals("pswd"))*/

import java.util.*;
class insta{
	static Scanner sc=new Scanner(System.in);
	private String username=sc.next();
	private String pswd=sc.next();
	void setuser(String username)
	{
		this.username=username;
	}
	void setpswd(String pswd)
	{
		this.pswd=pswd;
	}
	String getuser()
	{
		return username;
	}
	String getpswd()
	{
		return pswd;
	}
	insta (String username,String pswd)
	{
		this.username=username;
		this.pswd=pswd;
	}
	insta()
	{
	}
}
class user{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		insta x=new insta();
		System.out.println("enter no to update username&pswd or both");
		String option=sc.next();
		if(option.equals("username"))
		{
			System.out.println("enter new username");
			x.setuser(sc.next());
			System.out.println("your new name "+x.getuser());
		}
		else if(option.equals("pswd"))
		{
			System.out.println("enter new pswd");
			x.setpswd(sc.next());
			System.out.println("your new pswd"+x.getpswd());
		}
		else if(option.equals("both"))
		{
			System.out.println("enter new username");
			String username=sc.next();
			System.out.println("enter new pswd");
			String pswd=sc.next();
			x=new insta(username,pswd);
			System.out.println("your new username "+x.getuser());
			System.out.println("your new pswd "+x.getpswd());
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}
