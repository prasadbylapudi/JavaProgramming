
public class Main
{
   static int a=3;
   static int b;
   
   static void  meth(int  x)
   {
      System.out.println("x is"+x);
      System.out.println("a is"+a);
      System.out.println("b is "+b);
   }
   
   static
   {
       System.out.println("static block initialized");
       b=a*2;
       
   }
    
	public static void main(String[] args) 
	{
		meth(42);
	}
}
/*
here first the  class main is loaded and
second then static block is executed.
third then main is called in the program
if you observe output is:

static block initialized                                                                                                                      
x is42                                                                                                                                        
a is3                                                                                                                                         
b is 6 
*/
