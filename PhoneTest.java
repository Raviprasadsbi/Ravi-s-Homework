
public class PhoneTest {

	public static void main(String[] args) {
		Phone ph=new Phone();
		ph.dial();
byte speedDial=123;
ph.dial(speedDial);
ph.dial("Ravi");
ph.dial("Ravi", "Prasad");
ph.dial(123, "Ravi Prasad");
ph.dial("Ravi Prasad",123);
	}

}
class Phone{
	
	void dial() {
		System.out.println("dialing no where...");
	}
	void dial(byte speedDial) {
		System.out.println("dialing....."+speedDial);
	}
	
	void dial(String name) {
		System.out.println("dialing....."+name);
	}
	void dial(String name1,String name2) {
		System.out.println("conference call between "+name1+" "+"and"+" "+name2);
	}
	
	void dial(int number,String name) {
		System.out.println("Speed dialing "+number+" "+name);
	}
	void dial(String name,int number) {
		System.out.println("Calling "+name+" " +number);
	}
}