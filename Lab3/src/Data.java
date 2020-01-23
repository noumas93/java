import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

// TODO Komplettering: Det finns ingen anledning att ha cirklarna, trianglarna
// och kvadraterna i separata arrayer. Ändra så att ni har alla i samma array.

// Här sparar vi formerna när de ritas i varsin arraylist
public class Data {

	private ArrayList<shape> shapes = new ArrayList<shape>();

	public Data() {
	}

	public void clear() {

		shapes.clear();
	}

	public ArrayList<shape> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<shape> shapes) {
		this.shapes = shapes;
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 800, 600);

	}

}
