//1.Write a program to covert temperature from degree C to F. (Input 80C)
import java.util.Scanner;
class A{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	float a= sc.nextFloat();
	float b=((a*9)/5)+32;
	System.out.println(b);
	}
}