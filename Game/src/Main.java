import javax.swing.JFrame;

/**
 * @author mohma171 Klassen Main använder klassen Board för att kunna köra
 *         spelet.
 */
public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board.setSize(board.getWeight(), board.getHeight());
		board.setVisible(true);
		board.setTitle("Pong Game");
		board.Init();

	}

}
