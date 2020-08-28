package methodsVarDemo;
/*2)	Write a program to show method overloading by 
 * performing following steps:

Create a class to print the area of a square, a rectangle 
and a triangle. 

The class has 3 methods with the same name 
but different number of parameters. 

The method for printing area of rectangle has two parameters
 which are length and  breadth respectively, 
 
 for printing the area of triangle  method has 3 parameters
  
  and while the other method for printing area of square 
  has one parameter which is side of square.
*/
public class MethodsODemo {
	
	
	
	void area(int base,int height,float A)//3 parameters
	{
		//area of triangle
	     int area = (int) (A*base*height);
		
		System.out.println("The area of triangle is : "+area);
	}
	
	
	void area(int length,int breadth)//2 parameters
	{
		//area of rectangle
		int area = length* breadth;
		System.out.println("The area of reactangle is : "+area);
	
	}
	
	
	
	void area(int side)//1 parameter
	{
		
		//area of square
		int area = side*side;
		System.out.println("The area of square is : "+area);
	}
	

}
