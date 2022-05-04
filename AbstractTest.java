public class AbstractTest {
	public static void main(String[] args) {
		//Instrument i = new Instrument();
	//	MusicalInstrument i = new MusicalInstrument();
//		StringBasedMusicalInstrument i = new StringBasedMusicalInstrument();
		Guitar g = new Guitar();
		g.utilize();//1
		g.play();//2
		g.tuneStrings();//3
		g.pluck();//4
		
	violin v=new violin();
	v.Bow();//5
	v.play();//6
	
	Sitar s=new Sitar();
	s.ting();//7
	
	MusicalInstrument m=new Guitar();
	m.play();//8
	
	}
}
abstract class Instrument
{
	abstract void utilize();
}
abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Guitar strings");
	}

	@Override
	void play() {
		System.out.println("Playing the guitar...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the guitar....");
	}
	
	
	void pluck() {
		System.out.println("Plucking the guitar....");
	}
}

class ElectronicGuitar extends Guitar
{
	
}

class violin extends StringBasedMusicalInstrument
{
	
	void Bow() {
		System.out.println("Violin Bow....");
		
	}

	

	@Override
	void play() {
		System.out.println("Violin is playing");
		
	}
	
	
	}


class Sitar extends StringBasedMusicalInstrument

{
	
	void ting() {
		
		System.out.println("Sitar is Tinging.........");
	}
	
}