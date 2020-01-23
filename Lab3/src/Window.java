import javax.swing.JFrame;

// TODO Komplettering: När man trycker på clear-knappen bör ritytan rensas
// och bli helt vit direkt, inte efter att man har tryckt på ritytan och
// ritat ut ytterligare en form.

// TODO Komplettering: Vald färg/form ska vara markerad med en ram runt knappen
// för att visa vilken som är vald. Jag ser att ni har något sådant i er kod,
// men jag kan inte se det när jag kör programmet.

//Vår main
public class Window extends JFrame {
	public Window() {

		super("Vällkomen till ritprogrammet");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(new DrawPanel());
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {

		Window window = new Window();

	}

}
