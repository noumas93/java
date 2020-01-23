// TODO: Komplettering. För nuvarande har era Tool's ingen reell effekt
// på spelet. Ni borde förgrena eran Tool klass i olika subklasser och där
// implementera en önskad effekt av objektet.
// För eran wearable är det ok att ha det som det är, det finns bara en
// sådan.
// T.ex. Shovel kunde vara en egen klass, med en egen "use"/"dig" etc, så
// att det
// objektet/klassen själv kan kontrollera sin effekt på spelet.
// // TODO: Komplettering. Det går nu att gräva oavsett om jag har en spade
// eller inte. Detta borde enbart kunna ske då en spelare äger en spade.

public class Tool extends Item {

	public Tool(String name, double weight, int price, String act,
			String status, int health) {
		super(name, weight, price, act, status, health);

	}

	public String use() {
		this.getStatus();
		return this.getStatus();

	}

	public void action(Player player) {
		System.out.println(use() + ". ");
		System.out.println("You health now is "
				+ player.setHealth(player.getHealth() - super.getHealth()));

	}

}
