import java.util.*;
class Facebook{
	static Scanner sc=new Scanner(System.in);
	private String username=sc.next();
	private String pswd=sc.next();
	void setter(String username,String pswd)
	{
		this.username=username;
		this.pswd=pswd;
	}
	String getuser()
	{
		return username;
	}
	String getter()
	{
		return pswd;
	}
}
class user{
	public static void main(String args[])
	{
		Facebook x=new Facebook();
		x.setter("Balaraju","raju@123");
		System.out.println(x.getuser());
		System.out.println(x.getter());
	}
}