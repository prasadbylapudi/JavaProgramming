class Box
{
    static int a=9;
    static int b=90;
    
    static void display()
    {
        System.out.println("the vlaue updated is a+b is:"+a+b);
    }
    
}

public class Main
{
	public static void main(String[] args) 
	{
	    //int a=4;
	    Box ob1=new Box();
	    ob1.display();
	}
}
