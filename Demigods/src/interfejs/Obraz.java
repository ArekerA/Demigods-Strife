package interfejs;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
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
    private int szerokość;
    private int wysokość;
	private BufferedImage image;

	public Obraz(String grafika, int x, int y) {
		super();
		
		this.x = x;
		this.y = y;
		File imageFile = new File(grafika);
		try {
			image = ImageIO.read(imageFile);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		this.szerokość = image.getWidth();
		this.wysokość = image.getHeight();
		
	}
	public Obraz(String grafika, int x, int y, int szerokość, int wysokość) {
		super();
		this.x = x;
		this.y = y;
		File imageFile = new File(grafika);
		try {
			image = ImageIO.read(imageFile);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		image.getScaledInstance(szerokość, wysokość, Image.SCALE_DEFAULT);
		this.grafika = grafika;
		this.szerokość = szerokość;
		this.wysokość = wysokość;
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image, x, y, szerokość, wysokość, this);
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
	public int getSzerokość() {
		return szerokość;
	}
	public void setSzerokość(int szerokość) {
		this.szerokość = szerokość;
	}
	public int getWysokość() {
		return wysokość;
	}
	public void setWysokość(int wysokość) {
		this.wysokość = wysokość;
	}
}

