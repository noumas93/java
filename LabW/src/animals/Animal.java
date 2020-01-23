package animals;

public class Animal {

	int Birth;

	private static int currentYear;
	public String namn;
	int FD;

	public Animal(String name, int birthyear) {
		namn = name;
		FD = birthyear;
		Birth = currentYear - FD;
	}

	public static void setYear(int currentYear) {

		Animal.currentYear = currentYear;

	}

	

	public void introduceYourself() {
		System.out.println("Morr. Jag är ett djur som heter " + namn + Birth);

	}
	
}