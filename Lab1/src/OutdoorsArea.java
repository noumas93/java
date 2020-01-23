public class OutdoorsArea extends Location {
	private String weather;

	public OutdoorsArea(String string, String string2, String string3) {
		super(string, string2);
		this.weather = string3;

	}

	
	// Skriver ut grannar beroende på vilken location man väljer
	public void describeYourself() {
		if (super.isCheck()) {
			
				System.out.print(super.getName());
				System.out.print(super.getDescription());

				System.out.println(weather);
				System.out.println("northen way take you "
						+ this.getNighbors().get(0).getName() + ". "
						+ "southern way take you "
						+ this.getNighbors().get(1).getName() + ". "
						+ "western way take you "
						+ this.getNighbors().get(2).getName() + ". "
						+ "eastern way take you "
						+ this.getNighbors().get(3).getName() + ". ");
				super.setCheck(false);

			}
	 else {

			System.out.print("you are now at " + super.getName() + ". ");
			System.out.println(" You have been here before ;). ");
		}
	}

}
