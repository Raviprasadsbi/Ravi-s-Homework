
public class TestOverriding {

	public static void main(String[] args) {
		Account a=new Account();
		a.disp();
		SavingsAccount2 sa=new SavingsAccount2();
		sa.disp();
		FixedAccount fa=new FixedAccount();
		fa.disp();
		System.out.println("====================");
		
		
		Account obj=new Account();
		obj.disp(); //1
		obj=new SavingsAccount2();
		obj.disp(); //2
		
		Account obj3=new SavingsAccount2();
	obj3.
		sa.savingsAccountDisp();
		
				
		obj=new FixedAccount();
		obj.disp(); //3
	
			System.out.println("---------------------------------");
	
		
		obj = new  CurrentAccount();
		
		Auditor.doAudit(obj);
		
		Auditor.doAudit(new SavingsAccount2());
		Auditor.doAudit(new FixedAccount());
	}

}
class CurrentAccount extends Account
{
	
}

class Auditor
{
	static void doAudit(FixedAccount obj)
	{
		System.out.println("auditing.....");
		obj.disp();
		obj.scan();
		obj.verify();
		//some logic
		//some logic
	}
}

class Account
{
	
void disp() {
	
	System.out.println("Account class....disp() function");
}
void scan() {}
void verify() { }


}
class SavingsAccount2 extends Account

{
	
	void disp()
	{
		
		System.out.println("SavingsAccount class....disp() function");
	}
	
	
	void savingsAccountDisp()
	{
		
		System.out.println("SavingsAccount class  specific ....disp() function");
	}
}

class FixedAccount extends SavingsAccount2

{
	
	void disp()
	{
		
		System.out.println("Fixed Account class....disp() function");
	}

}

class Employee
{
	void work() { }
}

class Executive extends Employee
{
	void work() { }
	void execute() { }
}

class Manager extends Executive
{
	void work() { }
	void execute() { }
	void manage() { }
}


class Seminar
{
	void performMeetings(Manager e)
	{
		e.work();
		e.execute();
		e.manage();
	}
}

























