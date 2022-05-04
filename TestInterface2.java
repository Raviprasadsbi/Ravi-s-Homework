
public class TestInterface2 {

	public static void main(String[] args) {
		Z obj=new Z();
		obj.bMethod1();
		obj.xMethod1();

	}

}

class X
{
	void xMethod1() {
		System.out.println("X method1");
	}
	void xMethod2() {
		
		System.out.println("X method2");
	}
	
}
class Y extends X
{  void yMethod1() {}
   void yMethod2() {}
	
}
interface A
{   void aMethod1();
    void aMethod2();
	
}
interface B extends A
{
	void bMethod1();
	void bMethod2();

}
interface P
{
	void pMethod1();
	void pMethod2();

}
interface Q extends P
{
	void qMethod1();
	void qMethod2();

}

interface R extends Q
{
	void rMethod1();
	void rMethod2();

}

class Z extends Y implements B,R
{

	@Override
	public void pMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void qMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void qMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bMethod2() {
		// TODO Auto-generated method stub
		
	}
	
}