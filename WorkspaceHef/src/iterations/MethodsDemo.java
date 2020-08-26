package iterations;
//Methods in Java
public class MethodsDemo {
	
	//No returnType & no args
	public void addition()
	{
		  int num1,num2,result;
			num1 = 34;
			num2 =76;
			result = num1+num2;
			System.out.println("Sum of num1 & num2 is: "+result);
	}
	
	
	//No returnType but with args
	public void multiplication(int num1,int num2)  //method definition
	{
		 int result;
		
			result = num1*num2;
			System.out.println("Multiplication of num1 & num2 is: "+result);
	
	}

    
	//Method with returnType but no args
	public int subtraction()
	{
		 int num1,num2,result;
			num1 = 34;
			num2 =76;
			result = num1-num2;
			System.out.println(result);
        	return 0;
		
	}

	
	//Method with returnType & with args
	
	public int division(int num1,int num2)
	{
		int result = num1/num2;
		return result;
		
	}

}
