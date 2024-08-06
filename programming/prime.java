import java.util.*;
class Main
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
	int d=0;
	float sum=0;
	float altsum=0;
        if(a>0&&b>0){
            for(int i=a;i<=b;i++){
                int fc=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        fc++;
                    }
                }

                if(fc==2){
                    c++;
		    sum=sum+i;
                    if(c%2==1){
		    d++;
		    altsum=altsum+i;
                    if(c!=1){
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    }
                }
	    }
	    System.out.println();
	    System.out.println("sum of all primes "+sum);
	    System.out.println("average of all primes "+(float)(sum/c));
	    System.out.println("alternative sum of primes "+altsum);
	    System.out.println("alternative average of primes "+(float)(altsum/d));
        }
        else{
            System.out.println("Invalid Inputs");
        }
    }
}
