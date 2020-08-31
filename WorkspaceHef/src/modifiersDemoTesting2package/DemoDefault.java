package modifiersDemoTesting2package;

public class DemoDefault {
//if you do not specify any modifier,it will be considered as default
//the access level of default is within the same package.
	
	int number ;

	 DemoDefault() {
		 number =77;
	}


   	 void display()
	{
		System.out.println(number);
		}

}
