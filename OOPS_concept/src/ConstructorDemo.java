class Calc1  //note for editor.that is we don't create two classes with the same name in same project.
{
	int num1;
	int num2;
	int result;
	
	//this is constructor which doesn't take anything as the parameter
	public void Calc1()
	{
		num1=5;
	    num2=5;
		System.out.println("IN constructor");
		
	}
	
	//another constructor with parameters only integers are taking
	public Calc1(int n)
	{
		 num1=n;
		 num2=n;
		
	}
		
	//here is constructor with parameters which is taking double only.
	public Calc1(double d)
	{
		num1=(int) d;//we need to typecast cuz of we declare num1 as integer
		//num2 =d;
	}

}
public class ConstructorDemo {



	public static void main(String[] args) 
	{
		Calc1 obj=new Calc1(9.5); //constructor
		//Calc1 obj=new Calc1(7);
		//Calc1 obj=new Calc1(9.5);
		System.out.println(obj.num1);
		
		
	}

}
/*
NOTE ON CONSTRUCTOR:
1.It is a member method
2.Same as Class name
3.It will never return anything.
4.It is used to allocate memory.
5.The defalut values of variables in java is zero wherre as in c lang we have garbage values. 
6.we can have two different constructors in same classs.
they are like with parameters(arguments) and without(arguments) or privide them different parameters
7.we can pass values from constrctors 
8.we don't need to call the constructor it will call automatically when object is created.

_____________________________>>>>>>>>>>>>>>>>>>>PrasadBylapudi<<<<<<<<<<<<<<<<<<<<<<_______________________________________________

*/
