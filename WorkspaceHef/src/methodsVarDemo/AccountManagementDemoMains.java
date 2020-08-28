package methodsVarDemo;

public class AccountManagementDemoMains {
	
	public static void main(String[] args)
	{
		AccountManagement customer = new AccountManagement();
		
		customer.insertData();
		customer.depositAmount();
		customer.withdrawAmount();
		customer.amountBalance();
		customer.displayData();
	}

}
