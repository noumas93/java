import java.awt.Color;
import java.awt.Graphics;


//Ritar cirkelformen
public class Circle extends shape {

	public Circle(int x, int y, int size, Color color) {
		super(x, y, size, color);

	}

	public Circle() {

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.fillOval(super.getX(), super.getY(), super.getSize(), super.getSize());

	}

}
