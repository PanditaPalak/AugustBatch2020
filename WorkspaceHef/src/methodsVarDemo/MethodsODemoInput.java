package methodsVarDemo;

import java.util.Scanner;

public class MethodsODemoInput {
	int length,breadth;
	int base,height;
	
	MethodsODemo object = new MethodsODemo();
	Scanner sc = new Scanner(System.in);
	
	void inputRectangleData()
	{
	
		
		System.out.println("Enter length of rectangle: ");
		length = sc.nextInt();
		
		System.out.println("Enter breadth of rectangle");
		breadth=sc.nextInt();
		
		object.area(length, breadth);
		
	}
	
	void inputTriangleData()
	{
	
		
		System.out.println("Enter base of triangle: ");
		base = sc.nextInt();
		
		System.out.println("Enter height of triangle");
		height=sc.nextInt();
		
		object.area(base,height,0.5f);
		
	}


}
