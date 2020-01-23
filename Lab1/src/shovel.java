public class shovel extends Item {

	public shovel(String namn, double vikt, int pris, String act,
			String status, int gold, int health) {
		super(namn, vikt, pris, act, status, gold);

	}

	@Override
	public void action(Player player) {
		System.out.print(super.getStatus());

		System.out.println(" "
				+ player.setGold(player.getGold() + super.getHealth())
				+ " golds.");

		System.out.println("Your health "
				+ player.setHealth(player.getHealth() + super.getHealth()));
	}
}
