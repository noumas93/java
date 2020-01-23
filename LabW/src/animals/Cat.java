package animals;

public class Cat extends Animal {

	public Cat(String string, int i) {
		super(string, i);

	}

	public void introduceYourself() {
		System.out.println("Morr. Jag är en cat som heter " + this.namn);
		System.out.println("Jag är  " + Birth + " år gammal");
	}

}