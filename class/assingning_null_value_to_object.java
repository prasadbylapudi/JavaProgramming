class Multiple_objects
{
    void display()
    {
        System.out.println("hi i'm in display function");
        
    }
    void show()
    {
        System.out.println("hi i'm in show function");
    }
    
}

public class Main
{
	public static void main(String[] args)
	{
       Multiple_objects ob1=new Multiple_objects();
       Multiple_objects ob2=ob1;
       ob1=null;
       ob1.display();
       ob2.show();
       
	}
}
