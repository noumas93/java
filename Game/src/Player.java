import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 * @author mohma171
 * Klassen Player skapar sjävla spelaren som man styr.
 */
public class Player extends JPanel {

	private int y;
	private int x;
	private int weight;
	private int height;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Player() {
		y = 0;
		x = 5;
		setHeight(100);
		setWeight(20);
	}

	public int gety() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, weight, height);
	}
}
