public abstract class Item {

	private double weight;
	private String name;
	private int price;
	private String take;
	private String act;
	private String status;
	private int health;

	public Item(String namn, double vikt, int pris, String act, String status,
			int health) {

		this.name = namn;
		this.weight = vikt;
		this.price = pris;
		this.setTake("take");
		this.act = act;
		this.status = status;
		this.setHealth(health);

	}

	public void printYourself() {

		System.out.println("(" + this.name + ")");
		System.out.println("(" + this.price + " kr)");
		System.out.println("(" + this.weight + " G)");
		System.out.println("------");
	}

	// Hämtar players position och i den finns ett item
	public void doCommand(String input, Player player) {

		if (input.contains(act)) {
			this.action(player); // Ska innehålLA action för att skriva ut

		}

	}

	public abstract void action(Player player);

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTake() {
		return take;
	}

	public void setTake(String take) {
		this.take = take;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}