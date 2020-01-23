import java.awt.Color;
import java.awt.Graphics;

//Ritar trianglen 
public class triangle extends shape {

	public triangle(int x, int y, int size, Color color) {
		super(x, y, size, color);

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.fillPolygon(
				new int[] { super.getX(), super.getX() + super.getSize() / 2,
						super.getX() + super.getSize() },
				new int[] { super.getY() + super.getSize(), super.getY(),
						super.getY() + super.getSize() }, 3);
	}

}
