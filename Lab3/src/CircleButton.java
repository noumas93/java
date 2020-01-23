import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

// Kommentar: Subklasserna till FormBtn hade kunnat ersättas med att istället
// skapa instanser av superklassen FormBtn, om den använde sig av de olika
// form-klasserna. Den hade då behövt ta in en shape i konstruktorn så att
// instansen vetat vilken form den var. Därefter hade den kunnat använda sig av
// draw-metoderna i de olika klasserna beroende på vilken shape den var.

//Skapar cirkelknappen
public class CircleButton extends FormBtn {
	private static final long serialVersionUID = 1L;

	public CircleButton(int size) {
		super(size);

		this.setPreferredSize(new Dimension(super.getS(), super.getS()));
		this.setBackground(Color.yellow);

	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(this.getBackground());
		g.fillOval(0, 0, super.getS(), super.getS());
	}

	// När vi trycker ska det vara grått och när vi inte gult
	protected void paintBorder(Graphics g) {
		g.fillOval(0, 0, super.getS(), super.getS());

	}

}
