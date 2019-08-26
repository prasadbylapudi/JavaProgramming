
class A
{
   void display1()
    {
        System.out.println("A's display1");
    }
    void display2()
    {
        System.out.println("A's display2");
    }
    void display3()
    {
        System.out.println("A's display 3");
    }
}

class  B extends A
{
    void display1()
    {
        System.out.println("B 's display1");
    }
    void display4()
    {
        System.out.println("B 's display4 ");
    }
        
    
}
class C extends B
{
     void display3()
    {
        System.out.println("c 's display 3");
    }
}
public class Main
{
	public static void main(String[] args)
	{
	 A a=new A();
	 a.display1();
	 B b=new B();
	 b.display1();
	 B c=new C();
	 c.display3();
	}
}
