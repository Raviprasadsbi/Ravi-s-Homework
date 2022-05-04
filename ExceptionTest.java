import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest 
{

	public static void main(String[] args)
	{
		TestString obj=new TestString();
	     obj.stringTest();

	}

}
class TestString
{
	void stringTest()
	{
	
		try
		{
			
				System.out.println("Enter string....");
				
				Scanner scan = new Scanner(System.in);
				
					   String str=scan.next();
					  
					 System.out.println("character at 5th location:"+str.charAt(5));
					 System.out.println("=========================================");
					 System.out.println(str.toUpperCase());
							
				
		}
			    catch(Exception e) 
		            {   System.out.println("Please supply string with 5 characters....");
			       }
				
			
			
	}
}