import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author mohma171 Klassen Highscore sparar scoret i en extern fil och läser
 *         sedan in filen i GamePanel och skickar nuvarande highscore till
 *         MenuPanel.
 */
public class Highscore {
	private int hs;
	private String path = "/home/mohma171/TDDE10/highscore.txt";
	private int Score;

	public Highscore() {

	}

	public void setScore(int score) {
		Score = score;
	}

	private void saveScore(int highscore) {

		try {
			File file = new File(path);
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(highscore);
			dos.close();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	int getScore() {

		File file = new File(path);
		FileInputStream fis = null;
		DataInputStream dos = null;

		try {
			fis = new FileInputStream(file);
			dos = new DataInputStream(fis);

			Score = dos.readInt();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return Score;
	}

	public void setHs(int localHs) {
		hs = localHs;
		saveScore(hs);

	}
}
