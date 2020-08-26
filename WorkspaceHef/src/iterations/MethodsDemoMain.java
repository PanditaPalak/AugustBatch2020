package iterations;

public class MethodsDemoMain {

	public static void main(String[] args) {
		
		MethodsDemo object = new MethodsDemo();
		
		object.addition();  //method calling
		
		
		object.multiplication(12,12);
		
		int num = object.subtraction();
		System.out.println("subtraction: "+num);
		
		
	    int result=object.division(20, 10);
	    System.out.println("Division :"+result);

	}

}
