//24.create a java app where we have a cls batch126 it contains data of 5 girls and 5 boys firstly user need to enter the data and then we have a method display this method will display the require data based on usewr input it doesn't hve any parameter or return type then based on user input if user want dispaly boys data then display pr else user want to display girls data then dispaly display user data or else user want dispaly both data then display

import java.util.*;
class Batch126{
	static Scanner sc=new Scanner(System.in);
	String a= sc.nextLine();
	String b=sc.nextLine();
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String args[])
	{
		System.out.println("enter boys data:");
		Batch126 boys=new Batch126();
		System.out.println("enter girls data:");
		Batch126 girls=new Batch126();
		System.out.println("enter boys/girls data:");
		String n=sc.nextLine();
		switch(n){
			case "boys":
				boys.display();
				break;
			case "girls":
				girls.display();
				break;
			case "both":
				boys.display();
				girls.display();
				break;
			default:
				System.out.println("Invalid");
		}
			
	}
	
}