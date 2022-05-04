
public class MobilePhones {

	public static void main(String[] args) {
		Mobiles m=new Mobiles();
		m.addStock("Realme", "Gt Neo",29999);
		m.addStock("Realme1", "Gt Neo1",29999111);
		System.out.println("Stock added");
	    m.getPrice("Realme");
		System.out.println("Total mobiles available are "+m.getStock());
	}

}
class Mobiles{
	
	String Company;
	String ModelName;
	int price;
	int numberOfMobiles;
	
	void addStock(String x,String y,int z) 
	{   
		Company=x;
		 ModelName=y;
		 price=z;
		 numberOfMobiles=numberOfMobiles+1;
	}
	int getPrice(String s) {
		
		if(s.equals("Realme") ) {
			
			System.out.println("Price is "+price);
		} 
		else 
			System.out.println("Price not found");
		return price;
	}
	
	int getStock() {
		return numberOfMobiles;
		
	}
	
	
}