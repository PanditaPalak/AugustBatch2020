package constructorsDemo;

import java.util.Scanner;

public class AddAmount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int amount = 0;
		
		System.out.println("Do you want to add amount in your account?");
		char ans = sc.next().charAt(0);
		
		if(ans == 'y')
		{
			System.out.println("Enter amount to be added: ");
			 amount = sc.nextInt();
			 Bank bank1 = new Bank(amount);
		        bank1.display();
		}
		else
		{
			Bank bank = new Bank();
			bank.display();
		}
		
       
		
//		Bank bank = new Bank();
//		bank.display();
		
		

	}

}
