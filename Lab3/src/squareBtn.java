import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

//Ritar squareknappen i panelen
public class squareBtn extends FormBtn {
	private static final long serialVersionUID = 1L;

	public squareBtn(int s) {
		super(s);

		this.setPreferredSize(new Dimension(super.getS(), super.getS()));
		this.setBackground(Color.yellow);

	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(this.getBackground());
		g.fillRect(0, 0, super.getS(), super.getS());

	}

	protected void paintBorder(Graphics g) {

		g.fillRect(0, 0, super.getS(), super.getS());

	}
}
