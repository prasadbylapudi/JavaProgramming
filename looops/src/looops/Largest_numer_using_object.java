package looops;

 class largest
{
	int max;
	int a;
	int b;
	int c;
	
	//method 
	public void  large()    
	{
		if(a>b&& a>c)
			max=a;
		else if(b>a && b>c)
			max=b;T
		else
			max=c;
	}
	
}
public class Largest_numer_using_object {

	public static void main(String[] args) 
	{
		largest obj=new largest();//this is reference tto the class
		obj.a=1;
		obj.b=20;
		obj.c=3;
		
		obj.large();//calling the large function.
		
		System.out.println("the maximum number is "+obj.max);
		

	}

}
