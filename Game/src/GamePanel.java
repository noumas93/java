import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * @author mohma171 Denna klassen använder klasserna Player, Enemy och Ball. Samt sätter den local highscore.
 */
public class GamePanel extends JPanel {

	private Board board;
	private boolean isHard;
	private Player player;
	private Ball ball;
	private Enemy enemy;
	private int localHs;
	private Highscore h;

	public GamePanel(Board board, boolean isHard) {
		this.board = board;

		this.localHs = 0;
		this.setBackground(Color.BLACK);
		this.isHard = isHard;
		this.setLayout(new BorderLayout());

		player = new Player();
		ball = new Ball();
		enemy = new Enemy();
		h = new Highscore();
	}

	public void Run() {
		boolean running = true;
		do {
			// update
			running = Update();

			// rita spelaren, enemyn, hindrar, bollen
			Draw();

			// try sync
			Toolkit.getDefaultToolkit().sync();

			// väntetid
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} while (running);

		// tillbaka till menyn ifall rundan är slut.
		MenuPanel mp = new MenuPanel(board);
		mp.setSize(800, 600);
		mp.setBorder(new LineBorder(Color.black));
		mp.setLocation(new Point(0, 0));
		mp.setBackground(Color.GREEN);
		board.Switch(mp);
		mp.Init();
	}

	public boolean Update() {
		player.setY((int) (MouseInfo.getPointerInfo().getLocation().getY()
				- this.getLocationOnScreen().getY() - 50));
		int action = ball.update(player.gety(), enemy.gety(), isHard);
		enemy.update(ball.gety());

		if (action == 1)
			return false;
		if (action == 2) {
			localHs++;

			if (localHs > h.getScore()) {
				h.setHs(localHs);
			}

			if (localHs > 3) { // power up
				int score = localHs + 2;
				ball.setVinx(score);
				ball.setViny(score);

			}

			ball.restart();
			return true;
		} else
			return true;
	}

	public void Draw() {

		Graphics g = getGraphics();

		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 600);
		g.setColor(Color.yellow);
		g.fillRect(375, 0, 3, 600);
		g.setColor(Color.GREEN);
		g.drawString("Local highscore: " + localHs, 50, 15);

		player.draw(g);
		ball.draw(g);
		enemy.draw(g);

		if (isHard) {
			enemy.hardspeed(isHard);
			g.setColor(Color.white);
			g.fillRect(350, 100, 50, 50);
			g.fillRect(350, 400, 50, 50);
		}
	}

}