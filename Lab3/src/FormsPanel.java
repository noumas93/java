import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Här lägger vi till knapparna i panelen
public class FormsPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private int s;
	private JLabel text;
	public static int shapenr;
	private ArrayList<FormBtn> btn;

	public FormsPanel() {
		super();
		s = 20;
		shapenr = 0;
		btn = new ArrayList<FormBtn>();

		text = new JLabel("form");

		this.add(text);

		FormBtn cir = new CircleButton(s);
		this.add(cir);
		FormBtn sqr = new squareBtn(s);
		this.add(sqr);
		FormBtn tri = new TriangleButton(s);
		this.add(tri);
		btn.add(tri);
		btn.add(sqr);
		btn.add(cir);
		buttonAction();

	}

	// Komando för knapptryck
	public void buttonAction() {
		for (int i = 0; i < btn.size(); ++i) {
			final int nr = i;
			btn.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

					// TODO Komplettering: Denna if-sats behövs inte.
					// ActionListener hör bara till knapparna, så vi vet att det
					// är en av knapparna vi är i om vi kommer in i metoden.
					shapenr = nr;

					if (shapenr == 0) {

						btn.get(0).setBackground(Color.black);
						btn.get(1).setBackground(Color.yellow);
						btn.get(2).setBackground(Color.yellow);
					} else if (shapenr == 1) {

						btn.get(0).setBackground(Color.yellow);
						btn.get(1).setBackground(Color.black);
						btn.get(2).setBackground(Color.yellow);
					} else if (shapenr == 2) {

						btn.get(0).setBackground(Color.yellow);
						btn.get(1).setBackground(Color.yellow);
						btn.get(2).setBackground(Color.black);

					}
					repaint();
				}

			});
		}

	}

}