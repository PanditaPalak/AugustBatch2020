package modifiersDemo;

//the access level is within the package and outside
//the package through child class


public class DemoProtected {
	
	protected int number ;

	protected DemoProtected() {
		 number =77;
	}


	protected void display()
	{
		System.out.println(number);
		}

}
