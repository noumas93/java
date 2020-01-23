import java.awt.Color;
import java.awt.Graphics;

//Ritar square
public class square extends shape {

	public square(int x, int y, int size, Color color) {
		super(x, y, size, color);

	}
	
	@Override
	public void draw(Graphics g) {

		g.setColor(super.getColor());
		g.fillRect(super.getX(), super.getY(), super.getSize(), super.getSize());

	}

}
