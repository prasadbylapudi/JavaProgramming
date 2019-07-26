package looops;

public class Palindrome {

	public static void main(String[] args)
	{
				
				int sum=0;
				int n=101;
				int temp=n;
				while(n>0)
				{
		     	int	r=n%10;
		     	sum=(sum*10)+r;
		     	n=n/10;
				}
				if(temp==sum)
				{
					System.out.println("it is palindrome");
					
				}
				else
					System.out.println("not a palindrome");

	}

}
