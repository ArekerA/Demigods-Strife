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
    private int szerokosc;
    private int wysokosc;
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
		this.szerokosc = image.getWidth();
		this.wysokosc = image.getHeight();
		
	}
	public Obraz(String grafika, int x, int y, int szerokosc, int wysokosc) {
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
		image.getScaledInstance(szerokosc, wysokosc, Image.SCALE_DEFAULT);
		this.grafika = grafika;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image, x, y, szerokosc, wysokosc, this);
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
	public int getSzerokosc() {
		return szerokosc;
	}
	public void setSzerokosc(int szerokosc) {
		this.szerokosc = szerokosc;
	}
	public int getWysokosc() {
		return wysokosc;
	}
	public void setWysokosc(int wysokosc) {
		this.wysokosc = wysokosc;
	}
}

