package looops;

class prime
{
	int num;
	int count=0;
	int result;
	
	
	// method
	public void  prime(int n)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(n +" is not a prime number");
				count=1;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(n+" is prime number");
		}
	
			
		
	}
}

public class prime_using_objects {

	public static void main(String[] args)
	{
		prime obj1=new prime(5);
		
		
		
	}

}
