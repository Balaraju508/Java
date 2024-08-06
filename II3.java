package p1.p2;
public interface II3
{
	public abstract double m6(float a);
	default String m7(int a)
	{
		System.out.println(a);
		return p1.II1.sc.next();
	}
}

