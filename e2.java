import java.util.*;
class Insta {
    private String username="hello";
    private String password="hi";
    private long phno=9876543211l;
    Insta(String username,String password,long phno)
    {
        this.username=username;
        this.password=password;
        this.phno=phno;
    }
    Insta(){}
    void setName(String username)
    {
        this.username=username;
    }
    void setPass(String password)
    {
        this.password=password;
    }
    String getName()
    {
        return username;
    }
    String getPass()
    {
        return password;
    }
    long getPh()
    {
        return phno;
    }
}
class User
{
    static Scanner sc=new Scanner(System.in);  
    static Insta x=new Insta();
    static void login()
    {
        System.out.println("please enter your credentials to login");
        System.out.println("please enter your username");
        String name=sc.next();
        System.out.println("please enter your password");
        String pass=sc.next();
        if(name.equals(x.getName()) && pass.equals(x.getPass()))
        {
            System.out.println("Login successfull");
        }
        else if(!(name).equals(x.getName()) && !(pass).equals(x.getPass()))
        {
            System.out.println("Invalid credentials....");
            while(true){
                System.out.println("please enter your mobile number to know your username");
                long phno=sc.nextLong();
                if(phno==x.getPh())
                {
                    System.out.println("your username : "+x.getName());
                    login();
                    break;
                }
                else{
                    System.out.println("Incorrect mobile number press 1 to renter press any number to exit application");
                    int n=sc.nextInt();
                    if(n!=1)
                    {
                        break;
                    }
                }
            }
        }
        else if(!(name).equals(x.getName()))
        {
            System.out.println("Invalid username\n press 1 to reset press any key to exit");
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.println("Please enter your new username");
                x.setName(sc.next());
                System.out.println("Username updated successfully");
                System.out.println("Your new username : "+x.getName());
                login();
            }
        }
        else{
             System.out.println("Invalid password\n press 1 to reset press any key to exit");
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.println("Please enter your new password");
                x.setPass(sc.next());
                System.out.println("Password updated successfully");
                System.out.println("Your new Password : "+x.getPass());
                login();
            }
        }
    }
    static void signup()
    {
        System.out.println("please enter your credentials to create a new account");
        System.out.println("enter usename");
        String name=sc.next();
        System.out.println("enter Password");
        String pass=sc.next();
        System.out.println("enter your mobile number");
        long phno=sc.nextLong();
        x=new Insta(name,pass,phno);
        System.out.println("account created successfully ");
        login();
    }
	public static void main(String[] args) {
	    System.out.printf("%50s%n","Instagram lite");
	    System.out.println("1 signup\n2 login");
	    int n=sc.nextInt();
	    if(n==1){
	        signup();
	    }
	    else if(n==2){
	       login();   
	    }
	    else{
	        System.out.println("Invalid selection");
	        main(args);
	    }
	  
	}
}