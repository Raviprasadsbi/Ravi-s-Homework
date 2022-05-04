class Kite
{
	
	public Kite(String kiteColor, String kiteOwner, int length) {
		super();
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.length = length;
	}
	private String kiteColor;
	private String kiteOwner;
	private int length;
	 static int kiteCount;//class's data but not object;s data
	@Override
	public String toString() {
		return "Kite [kiteColor=" + kiteColor + ", kiteOwner=" + kiteOwner + ", length=" + length + "]";
	}
}




public class StaticTest {

	public static void main(String[] args) {  
		System.out.println("Kite count is "+Kite.kiteCount);
		Kite k1=new Kite("red","jack",50);
	
	}

}


