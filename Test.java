
public class Test
{

	public static void main(String[] args)
	   {

		Calculator calc = new Calculator();
		calc.fun1();
		System.out.println("---------------------1");
		calc.fun2(10, 20);
		System.out.println("---------------------2");
		int output=calc.fun3(20,30);		
		System.out.println("sum of X and y is "+output);
		System.out.println("---------------------3");
		int out=calc.fun4();
		System.out.println("Sum is "+out);
		System.out.println("---------------------4");
	   }

}

class Calculator 
{

	void fun1() {
		int x = 10;
		int y = 20;
		int z = (x + y)/2;
		System.out.println("Average of x and y is:" + z);

	}

	void fun2(int x, int y) {
		int z = (x + y)/2;
		System.out.println("" + z);
	}

	

int fun3(int x,int y) 
{
	  int z=(x+y)/2;
	  return z;
}

int fun4() 
{     int x=30;
       int y=50;
	  int z=x+y;
	  return z;
	  }
}
