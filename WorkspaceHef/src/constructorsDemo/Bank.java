package constructorsDemo;
/*3)	Create a class Bank .Initialize an instance variable ” 
 * amount” with an initial amount of Rs.5000 and assume you have
 *  to add some more amount to it. 
 *  Now make two constructors of  this class as follows:
1	- without any parameter - no amount will be added to the Bank
2	- having a parameter which is the amount that will be added 
to Bank.
 Create object of the 'AddAmount' class and display the final 
 amount in Bank
*/

public class Bank {
	
	int amount = 5000;  //instance variable
	
	
	  Bank()
	  {
		//no amount will be added to the account  
		  System.out.println("No amount has been added to your account");
	  }
	  
	  Bank(int amount)//3000
	  {
		 System.out.println("The amount of "+amount+" has been credited to your account");
		 this.amount = this.amount + amount;
	//	  amount = 5000 +  3000;
	  }
	  
	  void display()
	  {
		  System.out.println("The Account Balance in your account is : "+amount);
	  }
	  
	  

}
