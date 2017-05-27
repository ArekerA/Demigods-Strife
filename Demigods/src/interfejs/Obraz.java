package interfejs;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Obraz extends JPanel{
    private String grafika;
    private int x;
    private int y;
    private int szeroko��;
    private int wysoko��;
	public Obraz(String grafika, int x, int y, int szeroko��, int wysoko��) {
		super();
		this.grafika = grafika;
		this.x = x;
		this.y = y;
		this.szeroko�� = szeroko��;
		this.wysoko�� = wysoko��;
	}
	private BufferedImage image;

	public Obraz() {
		//super();

		File imageFile = new File("img/t�o.png");
		try {
			image = ImageIO.read(imageFile);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}

		Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
		setPreferredSize(dimension);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image, 0, 0, (ImageObserver) this);
	}
    public void Rysuj() {

    }
	public String getGrafika() {
		return grafika;
	}
	public void setGrafika(String grafika) {
		this.grafika = grafika;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSzeroko��() {
		return szeroko��;
	}
	public void setSzeroko��(int szeroko��) {
		this.szeroko�� = szeroko��;
	}
	public int getWysoko��() {
		return wysoko��;
	}
	public void setWysoko��(int wysoko��) {
		this.wysoko�� = wysoko��;
	}

}

