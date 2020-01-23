import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Data data;
	private int height;
	private int weight;
	public static Color currentColor;
	private FormsPanel fp;

	public DrawPanel() {
		currentColor = Color.black;
		fp = new FormsPanel();
		setHeight(600);
		setWeight(800);

		data = new Data();
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(weight, height));
		this.setBackground(Color.WHITE);
		this.add(new Clearpanel(data, this), BorderLayout.PAGE_END); // Skapar
		// panelerna
		this.add(new ToolPanel(this), BorderLayout.EAST);

		MouseListener();

	}

	// Kommentar: Om panelerna ligger i DrawPanel och MouseListener för att rita
	// ut formerna ligger i ritytan, så kommer den även att rita ut former om
	// man trycker på panelerna (utanför det vita området), även om panelen
	// ritas ut efteråt och döljer de utritade formerna. Det hade kanske varit
	// bättre om ritytan bara var det vita området och att panelerna inte låg i
	// ritytan?
	// Här ändrar vi form beroende på var man klickar
	public void MouseListener() {

		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				if (FormsPanel.shapenr == 0) {
					data.getShapes().add(
							new triangle(e.getX() - 10, e.getY() - 10, 20,
									currentColor));
				}

				if (FormsPanel.shapenr == 1) {
					data.getShapes().add(
							new square(e.getX() - 10, e.getY() - 10, 20,
									currentColor));
				}

				if (FormsPanel.shapenr == 2) {
					data.getShapes().add(
							new Circle(e.getX() - 10, e.getY() - 10, 20,
									currentColor));
				}

				repaint();
			}
		});

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillOval(0, 0, 800, 600);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		for (shape shapes : data.getShapes()) {
			shapes.draw(g2);
		}

		// data.draw(g);

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

	public Color getCurrentColor() {
		return currentColor;
	}

	public void setCurrentColor(Color currentColor) {
		this.currentColor = currentColor;
	}

}
