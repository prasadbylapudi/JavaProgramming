//this is class
class Calc
{
	int num1;
	int num2;
	int result;
	//NOTE:defaulty every class have the constructor.which has the same name as the class name.
	
	//this is method
	public void perform()
	{
		result=num1+num2;
	}
}


public class ObjectDemo {

	public static void main(String args[]) 
	{
		//Calc obj;//this is reference to and class	
					//object knows something and object does something.
		//obj=new Calc();
		Calc obj=new Calc();//instead of the above we can directly declare this.
							//this is constructor it allocates memory to the object.
							//the use of the constructor is to allocate memory to the object.
		obj.num1=3;
		obj.num2=7;
		
		obj.perform();
		System.out.println(obj.result);
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
7.we can pass values from constrctors unlike i declared for the above Calc class  
8.we don't need to call the constructor it will call automatically when object is created.


_____________________________>>>>>>>>>>>>>>>>>>>PrasadBylapudi<<<<<<<<<<<<<<<<<<<<<<_______________________________________________

*/
