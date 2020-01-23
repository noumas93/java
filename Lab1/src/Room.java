public class Room extends Location {

	private int size;

	public Room(String string, String string2, int i) {
		super(string, string2);

		this.setSize(i);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// Sätter ut grannar med room locaiton,
	public void describeYourself() {

		if (super.isCheck()) {

			System.out.print(super.getName());
			System.out.print(super.getDescription());
			System.out.println("The size of the room is " + this.size + "m. ");
			System.out.println("northen door take you to: "
					+ this.getNighbors().get(0).getName() + ". "
					+ "Southern door take you to: "
					+ this.getNighbors().get(1).getName() + ". "
					+ "western door take you to: "
					+ this.getNighbors().get(2).getName() + ". "
					+ "eastern door take you to: "
					+ this.getNighbors().get(3).getName() + ". ");
			super.setCheck(false);

		} else {

			System.out.print("you are now at " + super.getName() + ". ");
			System.out.println(" You have been here before ;). ");

		}
	}

}
