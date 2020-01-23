import java.awt.Color;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

/**
 * @author mohma171 Klassen Board funkar som en dynamisk panel. Då den sköter
 *         switchen mellan MenuPanel och GamePanel.
 */
public class Board extends JFrame {

	private int height;
	private int weight;

	public Board() {
		setHeight(600);
		setWeight(800);
		pack();
	}

	public void Init() {
		MenuPanel mp = new MenuPanel(this);
		mp.setSize(getWeight(), getHeight());
		mp.setBorder(new LineBorder(Color.black));
		mp.setBackground(Color.GREEN);
		mp.Init();

		this.getContentPane().add(mp);
	}

	public void Switch(MenuPanel mpp) {
		this.getContentPane().removeAll();
		this.getContentPane().add(mpp);
		this.revalidate();
	}

	public void Switch(GamePanel gpp) {
		this.getContentPane().removeAll();
		this.getContentPane().add(gpp);
		gpp.setBackground(Color.BLACK);
		this.revalidate();
		gpp.Run();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
