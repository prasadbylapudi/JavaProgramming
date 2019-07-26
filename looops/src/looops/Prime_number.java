package looops;

public class Prime_number {

	public static void main(String[] args) 
	{
		
		int prime;
		prime=10;
		int count=0;
		for(int i=1;i<prime;i++)
		{
			if(prime%i==0)
			{
				count++;
			}
			
		}
		if(count==1)
		{
			System.out.println(prime+"is prime number");
			
		}
		else
			System.out.println(prime +"  is not a prime number");
		

	}

}
