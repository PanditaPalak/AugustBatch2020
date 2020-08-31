package modifiersDemo;
/*Access modifiers
 * 
 * Access modifiers specifies the accessiblity or scope 
 * of an element(field,constructor,method) in a class
 *  
 *  Types of access modifiers:
 *  public,private,protected and default.
 *  
 *  1.private :the scope of private modifier is within a class
 * */

public class ModifierPrivateDemo {
	
	private int number ; //instance variable
	
	
   private ModifierPrivateDemo() //zero args constructor
	{
		number =4000;
	}
	
private	void display() //method
	{
		System.out.println("the value is: "+number);
	}

  
//public static void main(String[] args)
//  {
//checking private accessibility
//	ModifierPrivateDemo ob = new ModifierPrivateDemo();
//	  ob.number = 98;
//	  ob.display();
//  }

}
