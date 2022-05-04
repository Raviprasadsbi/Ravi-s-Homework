
public class Test {

	
	int a;
	int b;
	int z;
	public static void main(String[] args) {
		Test t=new Test(10,20);
		t.add(t);;
		

	}
	public Test(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		z=a+b;
		System.out.println("total is "+z);
	}
	void add(Test obj) 
	{
		z=a+b;
		System.out.println("z is"+z);
	}

}

