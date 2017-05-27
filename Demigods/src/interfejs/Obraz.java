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
    private int szerokoœæ;
    private int wysokoœæ;
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
		this.szerokoœæ = image.getWidth();
		this.wysokoœæ = image.getHeight();
		
	}
	public Obraz(String grafika, int x, int y, int szerokoœæ, int wysokoœæ) {
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
		image.getScaledInstance(szerokoœæ, wysokoœæ, Image.SCALE_DEFAULT);
		this.grafika = grafika;
		this.szerokoœæ = szerokoœæ;
		this.wysokoœæ = wysokoœæ;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image, x, y, szerokoœæ, wysokoœæ, (ImageObserver) this);
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
	public int getSzerokoœæ() {
		return szerokoœæ;
	}
	public void setSzerokoœæ(int szerokoœæ) {
		this.szerokoœæ = szerokoœæ;
	}
	public int getWysokoœæ() {
		return wysokoœæ;
	}
	public void setWysokoœæ(int wysokoœæ) {
		this.wysokoœæ = wysokoœæ;
	}

}

