package iterations;
//WAP to display fibonacci series
import java.util.Scanner;

public class FiboDemo {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number upto which you want to display series:");
    int userNumber = sc.nextInt();

    int firstNumber , secondNumber, thirdNumber;
    
    firstNumber = 0;
    secondNumber = 1;
    
    System.out.print(firstNumber+"  "+secondNumber);
    
    for(int i=0;i<userNumber-2;i++)
    {
    	thirdNumber = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
    	System.out.print("  "+thirdNumber);
    	
    }
	}

}
