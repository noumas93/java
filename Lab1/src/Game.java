// TODO: Komplettering. Se över synlighet för metoder/variabler.
// Eran world behöver inte vara publik här.
// Synligheten för metoder skall matcha utformningen. 
// Skall en metod bara användas "internt" av en klass kan den vara dold. 
// Se över detta för alla era klasser. 
// TODO: Kompletering. Fundera på vad en konstruktor skall göra för ert spel 
// skall det "starta spelet" och börja beskriva? Det borde bara "sätta upp" miljön 
// så att run() senare kan "köra spelet". 
// TODO: Komplettering. Saknar några kommandon. Ni verkar ha byggt in några kommandon 
// i era items. T.ex. 'take'. Detta är tänkt att vara generella kommandon som 
// skall svara mot att "ta/plocka upp" ett föremål som finns där man är exempelvis.

import java.util.ArrayList;

import java.util.Scanner;

public class Game {

	private Player player;
	private ArrayList<Location> world = new ArrayList<Location>();

	public Game() {

		createWorld();
	}

	private void createWorld() {

		System.out.println("Welcome to the adventure game!");
		System.out.println("Enter the player name: ");

		Scanner sc = new Scanner(System.in); // Skriver ut information om de
												// olika locations

		Location Linkan = new Room("Linkan",
				" it is a city in southern Sweden, with 153 000 inhabitants.",
				23);
		Location Stockholm = new OutdoorsArea("Stockholm",
				" it is the capital of Sweden and populous"
						+ " city in the Nordic countries. ",
				"The weather is very cold and windy. ");
		Location Gothenburg = new Room("Gothenburg",
				" it is the second largest city in Sweden,"
						+ " and has a population of approximetly 580.000. ",
				512);
		Location Kalmar = new OutdoorsArea(
				"Kalmar",
				" it is situated by the Baltic Sea, and has a good football team. ",
				" The weather is warm and nice");
		Location Lund = new Room("Lund", " it is located in southern Sweden, "
				+ "and has the second-oldest university in Sweden. ", 521);

		// Här lägger vi till grannar till varje location
		Linkan.setPath(Stockholm, Lund, Gothenburg, Kalmar);
		Stockholm.setPath(Lund, Linkan, Gothenburg, Kalmar);
		Lund.setPath(Linkan, Stockholm, Gothenburg, Kalmar);
		Gothenburg.setPath(Stockholm, Lund, Linkan, Kalmar);
		Kalmar.setPath(Stockholm, Lund, Linkan, Gothenburg);
		world.add(Linkan);
		world.add(Stockholm);
		world.add(Lund);
		world.add(Gothenburg);
		world.add(Kalmar);
		player = new Player(sc.nextLine(), Linkan);

		System.out
				.println("Hey "
						+ player.getName()
						+ ". Your health is "
						+ player.getHealth()
						+ "."
						+ " You are now at northen of europe and precicly in Sweden. You can move by typing north/south/west/east. ");

		System.out
				.println("There is a hint command "
						+ "\"help\""
						+ " you can"
						+ " click it if you need any help. If you want to know the items you have enter"
						+ "\"item\"" + ". ");

		Item shovel = new shovel("shovel", 2.64, 200, "dig",
				"You dig and found", 5, 1);
		Item eleven_robe = new WearableItem("elven_robe", 21.24, 1222, "wear",
				"You put on elven_robe",
				player.setHealth(player.getHealth() + 50));
		Item torch = new shovel("torch", 10.12, 500, "light",
				"now it is not dark any more, Wow", 5, 2);
		Item knife = new Tool("knife", 10.12, 500, "hug",
				"It is really bad to use the knife", 5);
		Item gun = new Tool("gun", 10.12, 500, "shot",
				"Don't shot people, it's bad", 10);
		// här lägger vi till item till varje location
		Linkan.add(shovel);
		Linkan.add(knife);
		Gothenburg.add(torch);
		Gothenburg.add(eleven_robe);
		Kalmar.add(torch);
		Kalmar.add(eleven_robe);
		Lund.add(gun);
		Lund.add(shovel);
		Stockholm.add(knife);
		Stockholm.add(torch);

	}

	// Vår spelloop
	private void run() {
		Scanner po = new Scanner(System.in);

		String input = "n";

		while (!input.equals("stop")) {
			input = new String(po.nextLine());

			player.doCommand(input);

			if (input.equals("stop")) {
				System.out.println("Thank for playing, see you next time.");
			}
			System.out.println("What do you want to do?");
		}
	}

	public static void main(String[] args) {

		Game game = new Game();

		game.run();

	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
