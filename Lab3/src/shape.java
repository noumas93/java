import java.awt.Color;
import java.awt.Graphics;

//Superklass för formerna 
public abstract class shape {
	private int x;
	private int y;
	private int size;
	private Color color;

	public shape(int x, int y, int size, Color color) {
		this.setX(x);
		this.setY(y);
		this.setSize(size);
		this.setColor(color);
	}

	public shape() {

	}

	public abstract void draw(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
