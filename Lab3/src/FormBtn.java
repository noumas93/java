import java.awt.Graphics;
import javax.swing.JButton;

//Superklassen för formknapparna 
public abstract class FormBtn extends JButton {
	private int s;

	public FormBtn(int size) {
		this.setS(size);

	}

	public abstract void paintComponent(Graphics g);

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

}
