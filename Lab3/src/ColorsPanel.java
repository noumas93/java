import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorsPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel text;
	private ArrayList<ColorButtons> colors;
	private int oldbutton;

	public ColorsPanel(DrawPanel draw) {
		super();

		text = new JLabel("colors");
		this.add(text);
		setColors(new ArrayList<ColorButtons>());

		addButtons();
		ColorChange();

	}

	// Skapar färgknapparna

	private void addButtons() {
		ColorButtons black = new ColorButtons(Color.black, this);
		ColorButtons white = new ColorButtons(Color.white, this);
		ColorButtons blue = new ColorButtons(Color.blue, this);
		ColorButtons red = new ColorButtons(Color.red, this);
		ColorButtons yellow = new ColorButtons(Color.yellow, this);
		ColorButtons green = new ColorButtons(Color.green, this);
		ColorButtons pink = new ColorButtons(Color.pink, this);
		ColorButtons cyan = new ColorButtons(Color.cyan, this);
		getColors().add(black);
		getColors().add(white);
		getColors().add(blue);
		getColors().add(red);
		getColors().add(yellow);
		getColors().add(green);
		getColors().add(pink);
		getColors().add(cyan);

	}

	private void ColorChange() {

		for (int i = 0; i < colors.size(); ++i) {
			final int nr = i;
			colors.get(i).addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					Object source = e.getSource();

					DrawPanel.currentColor = ((JButton) source).getBackground();

					colors.get(nr).setBorder(
							BorderFactory.createLoweredBevelBorder());
					colors.get(oldbutton).setBorder(
							BorderFactory.createEmptyBorder());
					oldbutton = nr;

				}
			});

		}
	}

	public ArrayList<ColorButtons> getColors() {
		return colors;
	}

	public void setColors(ArrayList<ColorButtons> colors) {
		this.colors = colors;
	}

}
