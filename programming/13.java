//.13.Declare & initialize a number. Check whether the number is in range 0-100 or not. If not in range print invalid input. Else – if the number is in range 90-100 then print Super Smart, 80-90 print Smart,70-80 print smart enough, 60-70 print just smart, 35-60 print no smart, 0-35 print dump.
import java.util.*;
class M{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n<=100)
		{
			if(n>=90&&n<=100){
				System.out.println("super smart");
			}
			else if(n>=80&&n<=90){
				System.out.println("smart");
			}
			else if(n>=70&&n<=80){
				System.out.println("smart enough");
			}
			else if(n>=60&&n<=70){
				System.out.println(" just smart");
			}
			else if(n>=35&&n<=60){
				System.out.println("no smart");
			}
			else if(n>=0&&n<=35){
				System.out.println("dump");
			}
			else{
				System.out.println("invalid input");
			}
		}
	}
}