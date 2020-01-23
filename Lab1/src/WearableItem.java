public class WearableItem extends Item {

	private int bonusHealth;

	public WearableItem(String name, double weight, int price, String act,
			String status, int health) {
		super(name, weight, price, act, status, health);
		bonusHealth = 50;
	}

	private String putOn() {
		return this.getStatus();
	}

	public void action(Player player) {
		player.setHealth(player.getHealth() + this.getBonusHealth());
		System.out.println(putOn() + ". ");
		System.out.println("your health now "
				+ player.setHealth(player.getHealth() + this.getBonusHealth()));
	}

	public int getBonusHealth() {
		return bonusHealth;
	}

	public void setBonusHealth(int bonusHealth) {
		this.bonusHealth = bonusHealth;
	}

}
