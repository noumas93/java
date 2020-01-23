import java.util.ArrayList;

public class Player {

	private String name;
	private int gold;
	private int health;
	private Location position;
	private ArrayList<Item> pocket = new ArrayList<Item>();

	public Player(String string, Location start) {

		name = string;
		position = start;
		setHealth(10);
		setGold(1);

	}

	public void setPosition(Location position) {
		this.position = position;
	}

	public Location getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

	public void setName(String namn) {
		name = namn;
	}

	public int getHealth() {
		return health;
	}

	public int setHealth(int health) {
		return this.health = health;

	}

	public Location moveTo(Location position) {

		return this.position = position;

	}

	public void playerDescribition() {
		System.out.println(this.name);
		System.out.println(this.health);

	}

	public void doCommand(String input) {

		position.doCommand(input, this);
		if (input.equals("look")) {
			System.out.print("you are now at ");
			System.out.print(position.getName() + ",");
			System.out.println(position.getDescription());

			System.out.println("here there is:  ");
			for (int i = 0; i < position.getItemBox().size(); ++i) {

				position.getItemBox().get(i).printYourself();
			}
		}

		for (int i = 0; i < position.getItemBox().size(); ++i) {

			if (input.contains(position.getItemBox().get(i).getTake())
					&& input.contains(position.getItemBox().get(i).getName())) {

				System.out.println("you picked up the "
						+ position.getItemBox().get(i).getName());
				pocket.add(position.getItemBox().get(i));

			}

		}

		if (input.equals("item")) {

			if (pocket.isEmpty()) {
				System.out.println("you didnt find any items yet.");

			} else {

				System.out.println("you have following item/items ");
				for (int i = 0; i < pocket.size(); ++i) {

					pocket.get(i).printYourself();

				}
			}

		}

		for (int i = 0; i < pocket.size(); ++i) {
			if (input.contains(pocket.get(i).getAct())) {
				pocket.get(i).doCommand(input, this);
				pocket.remove(i);
			}

		}

		if (this.health < 0) {

			System.out.println("You are dead. Game over!");
			System.exit(1);
		}

	}

	public int getGold() {
		return gold;
	}

	public int setGold(int gold) {
		return this.gold = gold;
	}
}
