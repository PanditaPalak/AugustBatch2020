package methodsVarDemo;
/*Elements of class - Variables
  3 types of variables:
  
  
  1. Local variable  
    It is declared inside a class,inside a method or 
   constructor or a block.
   
  A local variable can never be declared as static.
  
  2.Instance variable
    It is declared inside a class,outside a method or
    constructor or a block.
    
   3.Static variable
    static-->keyword
*/
public class VarDemo {

           void display()
           {
        	   int number =87; //local variable
        	   System.out.println("value of number is :"+number);
           }
           
          void displayData(int num1,int num2)
          { 
        	   int result = num1+num2;
        	   System.out.println(result);
        	  
          }
	

}
