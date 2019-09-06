
class Calculation
{
    
    void fact(int n)
    {
        int fact=1;
        for (int i=1;i<=n ;i++)
        {
            fact=fact*i;
            
        }
        
        System.out.println("factorial is "+fact);
    }
}
 class Anonymous_object
{
	public static void main(String[] args) 
	{
	    new Calculation().fact(5);//calling method with Anonymous_object
	    
	}
	
}
