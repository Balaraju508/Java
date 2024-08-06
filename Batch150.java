import cvcorp.BatchFilledException;
class Batch150
{
	static void M1(int n)throws BatchFilledException
	{
		if(n<=50)
		{
			System.out.println("seat confirmed");
		}
		else
		{
			BatchFilledException obj=new BatchFilledException("seats filled from next Batch");
			throw obj;
		}
	}
	public static void main(String args[])throws BatchFilledException
	{
		for(int i=0;i>=0;i++)
		{
			M1(i);
		}
	}
}