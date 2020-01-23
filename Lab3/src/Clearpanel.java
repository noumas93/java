import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Clearpanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JButton clear;
	private Data data;
	private DrawPanel drawPanel;

	public Clearpanel(final Data data, DrawPanel drawPanel) {
		this.data = data;
		this.drawPanel = drawPanel;
		this.setPreferredSize(new Dimension(800, 30));
		this.setLayout(new BorderLayout());
		ActionListener();
	}

	// Clearar allt som finns i arraylistorna i dataklassen
	private void ActionListener() {

		clear = new JButton("clear");
		this.add(clear, BorderLayout.WEST);
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Komplettering: Denna if-sats behövs inte. ActionListener
				// hör bara till clear-knappen, så vi vet att det är den vi har
				// tryckt på (och är i) om vi kommer in i metoden.

				data.clear();
				drawPanel.repaint();

			}
		});

	}
}
