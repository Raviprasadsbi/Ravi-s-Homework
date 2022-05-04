public class FinalTest 
{
	
	 int a;
	int b;
	final int z=1;
	
	public FinalTest(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		int z=a+b;
		System.out.println("sum is "+z);
		
	}
	
	

	public static void main(String[] args) {
		
		
		FinalTest ft=new FinalTest(10,20);
		
	}
}


 class Chess //Abhinav 
{
	void moveBishop() { //math logic
		System.out.println("bishop is moving in cross bi-directional...");
	}
	void moveKnight() { //math logic
		System.out.println("Knight is moving in L Shape..any direction/jump over...");
	}
}
class GraphicalChess extends Chess //Sindhuri
{
	void moveMyBishop() {
		super.moveBishop();
		System.out.println("My own Math logic to move bishop in ");
	}
	void moveKnight() { //math logic
		System.out.println("Knight is moving in L Shape..any direction/jump over...");
	}
	
	
}