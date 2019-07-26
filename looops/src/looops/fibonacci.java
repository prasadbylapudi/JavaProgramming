package looops;

public class fibonacci {

	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		System.out.println(a + b);
		int fib=20;
		for(int i=2;i<fib;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
			
	}

}
