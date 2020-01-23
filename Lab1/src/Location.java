import java.util.ArrayList;

public abstract class Location {

	private String name;
	private String Description;
	private ArrayList<Location> nighbors = new ArrayList<Location>();
	private String Direction[] = { "north", "south", "west", "east" };
	private ArrayList<Item> itemBox = new ArrayList<Item>();
	private boolean check = true;

	public Location(String string, String string2) {

		this.name = string;
		this.Description = string2;

	}

	public void setPath(Location path1, Location path2, Location path3,
			Location path4) {
		getNighbors().add(path1);
		getNighbors().add(path2);
		getNighbors().add(path3);
		getNighbors().add(path4);

	}

	public abstract void describeYourself();

	public void add(Item item) {

		itemBox.add(item);

	}

	public void doCommand(String string, Player player) {

		for (int i = 0; i < 4; i++) {

			if (Direction[i].equals(string)) {

				nighbors.get(i).describeYourself();

				player.moveTo(getNighbors().get(i));

			}

		}
		if (string.equals("help")) {
			System.out
					.println("You can move around and discover the weather and area of Swedish cities"
							+ " by typing north/south/west/east. You can type"
							+ "\"look\""
							+ " if you want se where you are and if there is any matrials in this place. "
							+ "You can finish the game by entering "
							+ "\"stop\"");
		}
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public ArrayList<Location> getNighbors() {
		return nighbors;
	}

	public void setNighbors(ArrayList<Location> nighbors) {
		this.nighbors = nighbors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public ArrayList<Item> getItemBox() {
		return itemBox;
	}

	public void setItemBox(ArrayList<Item> itemBox) {
		this.itemBox = itemBox;
	}

}
