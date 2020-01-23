import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;



/**
 * @author mohma171
 * Klassen Enemy ritar fiendestöten som kombineras med bollens position samt hastighet.
 */
public class Enemy extends JPanel {
	private Ball ball;
	private int y;
	private int x;
	private int enemySpeed;
	private int weight;
	private int height;

	public Enemy() {
		ball = new Ball();
		y = 0;
		x = 760;
		enemySpeed = 4;
		setHeight(100);
		setWeight(20);
	}

	public void hardspeed(boolean hard) {

		if (hard) {
			enemySpeed = 5;
		}

	}

	public int getEnemySpeed() {
		return enemySpeed;
	}

	public void setEnemySpeed(int enemySpeed) {
		this.enemySpeed = enemySpeed;
	}

	public int gety() {
		return this.y;
	}

	// s�tta hur enemyn beeter sig med hj�lp av bollen y-kord
	public void update(int ballY) {
		int ballMid = ballY + 10;
		int enemyMid = this.y + 50;

		if (ballMid < enemyMid)
			this.y -= enemySpeed;
		else if (ballMid > enemyMid)
			this.y += enemySpeed;
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, weight, height);
	}

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
}