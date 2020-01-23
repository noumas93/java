import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * @author mohma171 Denna klass skapar tre knappar som gör det möjligt att ta
 *         sig runt i menyn, och dessa knappar bestämmer om spelet ska stängas
 *         eller vilken spelnivå som ska spelas.
 */
public class MenuPanel extends JPanel {

	private JButton btnEasy;
	private JButton btnHard;
	private JButton btnExit;
	private Highscore h;
	private Board board;
	private ArrayList<JButton> btnList;
	private HandlerClass handler;
	private int curOption;
	private boolean ishard;

	public MenuPanel(Board board) {
		curOption = 0;
		this.board = board;
		btnList = new ArrayList<JButton>();
		h = new Highscore();
		handler = new HandlerClass();

	}

	// skapa och lagga till knappar
	public void Init() {
		this.setLayout(null);

		// HighScore JLABEL
		JLabel lhs = new JLabel("Current Highscore: " + h.getScore());
		lhs.setBounds(50, 15, 200, 20);
		this.add(lhs);

		// Menu Buttons
		btnEasy = new MenuButton("easy", this, this.getWidth() / 2,
				this.getHeight() / 2);
		btnEasy.addKeyListener(handler);
		btnHard = new MenuButton("Hard", this, this.getWidth() / 2,
				this.getHeight() / 2 + 50);
		btnHard.addKeyListener(handler);
		btnExit = new MenuButton("Exit", this, this.getWidth() / 2,
				this.getHeight() / 2 + 100);
		btnExit.addKeyListener(handler);
		btnList.add(btnEasy);
		btnList.add(btnHard);
		btnList.add(btnExit);
		btnList.get(curOption).requestFocus();

	}

	private class HandlerClass implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {

			if (e.getKeyCode() == KeyEvent.VK_DOWN && curOption < 2) {

				curOption++;
				System.out.println("DOWN");

			} else if (e.getKeyCode() == KeyEvent.VK_UP && curOption > 0) {
				curOption--;
				System.out.println("UP");
			}

			btnList.get(curOption).requestFocus();

			if (e.getKeyCode() == KeyEvent.VK_ENTER) {

				if (btnList.get(0).isFocusOwner()) {
					System.out.println("Easy");
					ishard = false;

				}
				if (btnList.get(1).isFocusOwner()) {
					System.out.println("Hard");
					ishard = true;
				}

				if (btnList.get(2).isFocusOwner()) {
					System.exit(1);
				}

				GamePanel gp = new GamePanel(board, ishard);
				gp.setSize(800, 600);
				gp.setBorder(new LineBorder(Color.green));
				gp.setLocation(new Point(0, 0));
				gp.setBackground(Color.black);
				board.Switch(gp);
			}

		}

		@Override
		public void keyReleased(KeyEvent e) {

		}

		@Override
		public void keyTyped(KeyEvent e) {

		}

	}

}
