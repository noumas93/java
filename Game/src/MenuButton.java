import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuButton extends JButton {
	private String name;
	private MenuPanel menuPanel;
	private int length;
	private int width;
	private int x;
	private int y;

	public MenuButton(String string, MenuPanel menuPanel, int x, int y) {

		this.x = x;
		this.y = y;
		this.name = string;
		this.setText(name);
		this.menuPanel = menuPanel;

		length = 40;
		width = 100;
		this.setBounds(x, y, width, length);
		addTopanel();

	}

	private void addTopanel() {
		menuPanel.add(this);
	}

}
