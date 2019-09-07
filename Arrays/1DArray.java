class Printarray
{
    //array declaration
    /*
    we can declare array in two ways int Array[]; or int [] Array;
    */
    //int Array[];//declaring array
    int [] Array=new int [10];//allocating memory to array.
    Array [0]=1;
    Array [1]=1;
    Array [2]=1;
    Array [3]=1;
    Array [4]=1;
    
}
public class Main
{
	public static void main(String[] args)
	{
		for (int i=0;i<Array.length; i++)
		{
		 System.out.println("Element at index " + i +" : "+ Array[i]);   
		}
	}
}
