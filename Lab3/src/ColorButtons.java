import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ColorButtons extends JButton {

	private static final long serialVersionUID = 1L;
	private Color color;
	private ColorsPanel cp;

	// Kommentar: I och med att färgen på knappen sätts
	// direkt i konstruktorn används inte denna
	// instansvariabel.

	// Här lägger vi till och sätter färgen samt lägger till i panelen
	public ColorButtons(Color color, ColorsPanel colorspanel) {
		this.setPreferredSize(new Dimension(20, 20));
		this.color = color;
		this.cp = colorspanel;
		setColor(color);
		addToPanel(colorspanel);
//		ColorChange();

	}

	// metoden när vi byter färg
//	private void ColorChange() {
//
//		addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Object source = e.getSource();
//
//				DrawPanel.currentColor = ((JButton) source).getBackground();
//
//				setBorder(BorderFactory.createLoweredBevelBorder());
//			}
//			// setBorder(BorderFactory.createEmptyBorder());
//		});
//	}

	// Kommentar: Vill man verkligen ha en default-konstruktor i denna klass?
	// Man kanske bara vill att en ColorButtons ska kunna skapas med genom att
	// skicka in en färg och en ColorsPanel?

	private void setColor(Color color) {

		this.setBackground(color);

	}

	// Kommentar: Detta skulle kunna göras direkt i ColorsPanel när ColorButtons
	// skapas.
	private void addToPanel(ColorsPanel colorspanel) {
		colorspanel.add(this);

	}

}
