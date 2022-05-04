
public class AssociationTest
{

	public static void main(String[] args) 
	{
		BankAccount x = new BankAccount(101,"Jack",50000);
		x.printBankAccount();
		
		System.out.println("----");
		BankAdmin admin = new BankAdmin();
		// admin.changeMobileNumberOfAccountHolder(x,"9920445566");
		System.out.println("======");
		x.printBankAccount();

		admin.changeNameofAccount(x, "Ravi prasad");
		System.out.println("======After Name change======");
		x.printBankAccount();
		
		
		admin.withdrawamount(x, 5000);
		System.out.println("====After withdrawal======");
		x.printBankAccount();
		
		
		admin.depositAmount(x, 50000);
		System.out.println("====After Deposit======");
		x.printBankAccount();
		
		
	}
}
class BankAdmin
{
/*	void changeMobileNumberOfAccountHolder(BankAccount y, String z) 
	{ // y=x;
		y.setMobileNumber(z);} */
		
		void changeNameofAccount(BankAccount z,String newName) 
		{
			z.changeAccountName(newName);
			
			
		}
		
		void withdrawamount(BankAccount z,int amount)
		{
			
			z.withdraw(amount);
		}
		
		
        void depositAmount(BankAccount z,int amount) 
         {
			
			z.deposit(amount);
		}
}
