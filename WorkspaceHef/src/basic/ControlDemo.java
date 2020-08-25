package basic;

import java.util.Scanner;

public class ControlDemo {
//WAP to find if the number is even or odd

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number of your choice: ");
		int number;
		
		number  = scanner.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println(number+" is even number");
		}
		else
		{
			System.out.println(number+" is odd numver");
		}
		

		

	}

}



/*  Control Statements : 1.Conditional Statement
 *                       2. Iterations
 *  
 * 
 * 1.Conditional statement:
 * 
 *     a) if statement
 *     
 *        if(condition)
 *        {
 *            //code to be executed
 *        }
 *        
 *        code after if block
 *     
 *     b) if else statement
 *     
 *         if(condition)
 *         {
 *             //code to be executed
 *         }
 *         else
 *         {
 *            code to be executed
 *         }
 *         
 *      c) if else if ladder
 *       
 *       if(condition1)
 *       {  
 *       code to be executed
 *       }
 *       else if(conditon2)
 *        {  
 *       code to be executed
 *       }
 *       else if(condition3)
 *        {  
 *       code to be executed
 *       }
 *       else if(condion4)
 *        {  
 *       code to be executed
 *       }
 *       else
 *        {  
 *       code to be executed
 *       }
 *  
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 *      
 *      
 * 
 * 
 * 
 * 
 * 
 */







