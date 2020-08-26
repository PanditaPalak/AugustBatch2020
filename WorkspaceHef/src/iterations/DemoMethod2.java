package iterations;

import java.util.Scanner;

public class DemoMethod2 {
	
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter num1: ");
		num1= sc.nextInt();
		System.out.println("Enter num2: ");
		num2 =sc.nextInt();
		
		int result = operation(num1, num2);//method calling
		display(result);
	}
	
	int operation(int num1,int num2)
	{
		int result = num1+num2;
		return result;
		
	}
	
	void display(int result)
	{
		System.out.println("Result is : "+result);
	}
	
	
	
	

}
