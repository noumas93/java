import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;

//Gör triangelkanppen
public class TriangleButton extends FormBtn {
	private static final long serialVersionUID = 1L;
	private Shape triangle = triangleCoordinates();


	public TriangleButton(int s) {
		super(s);
		this.setBackground(Color.YELLOW);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(this.getBackground());
		((Graphics2D) g).fill(triangle);
	}

	protected void paintBorder(Graphics g) {
		((Graphics2D) g).fill(triangle);
	}

	public Dimension getPreferredSize() {
		return new Dimension(super.getS(), super.getS());
	}

	private Shape triangleCoordinates() {
		Polygon p = new Polygon();
		p.addPoint(0, super.getS());
		p.addPoint(super.getS() - super.getS() / 2, 0);
		p.addPoint(super.getS(), super.getS());
		return p;
	}

}