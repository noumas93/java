import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
//Gemensam panel för färg och form panelerna
public class ToolPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private DrawPanel draw;

	public ToolPanel(DrawPanel dras) {
		this.setPreferredSize(new Dimension(40, 600));
		this.setLayout(new GridLayout(2, 0));
		this.add(new ColorsPanel(draw));
		this.add(new FormsPanel());
	}
}