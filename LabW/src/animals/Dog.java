package animals;

public class Dog extends Animal {

	public Dog(String string, int i) {
		super(string, i);
	}
		
	
	public void introduceYourself() {
		System.out.println("Morr. Jag är en hund som heter " + this.namn);
		System.out.println("Jag är "+ Birth + "  år gammal");
	}
	
}
