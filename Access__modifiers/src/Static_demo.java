class Emp
{
	int eid;
	int salary;
	String ceo;
	
	//this is method
	public void show()
	{
		System.out.println(eid +" : "+salary +" : " + ceo);
	}
	
}

public class Static_demo {

	public static void main(String[] args)
	{
		Emp prasad=new Emp();
		prasad.eid=45;
		prasad.salary=40_000;//this means that fourty thousand
		prasad.ceo="BillGates";
		
		
		Emp praveen=new Emp();
		praveen.eid=40;
		praveen.salary=40000;
		praveen.ceo="BillGates";
		
	//now i want to update the ceo of praveen 
		praveen.ceo="MarkZukenberg";
		
		prasad.show();
		praveen.show();
		
		
		
	}
	

}

/*
NOTE:To access static variables we don't need object.



____________________________>>>>>>>>>>>>>>>>>>>PrasadBylapudi<<<<<<<<<<<<<<<<<<<<<<_______________________________________________

*/



