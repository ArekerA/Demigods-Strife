package kreator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

@SuppressWarnings("serial")
public class Postac extends ImageView implements Serializable {
	@Override
	public String toString() {
		return "Postac [id=" + id + ", atak=" + atak + ", obrona=" + obrona + ", hp=" + hp + ", mana=" + mana
				+ ", szybkosc=" + szybkosc + ", nazwa=" + nazwa + ", opis=" + opis +  ", rasa="
				+ rasa + ", klasa=" + klasa + "]" + "\n";
	}

	private static int maxId = 0;
	private int id;
	private int atak;
	private int obrona;
	private int hp;
	private int mana;
	private int szybkosc;
	private int posX;
	private int posY;
	String nazwa;
	private String opis;
	String rasa;
	String klasa;
	
	

	static String[] rasy = { "Człowiek", "Elf", "Ork" };// 0-cz�owiek, 1-elf,
														// 2-ork
	final static String[] klasy = { "Wojownik", "Łucznik", "Mag" };// 0-wojownik,
																	// 1-�ucznik,
																	// 2-mag

	public Postac() {
		this.atak=10;
		this.obrona=3;
		this.hp=50;
		this.mana=20;
		this.szybkosc=5;
	}

	public Postac(int atak, int obrona, int hp, int mana, int szybkosc, String rasa, String klasa) {
		id = maxId++;
		this.atak = atak;
		this.obrona = obrona;
		this.hp = hp;
		this.mana = mana;
		this.szybkosc = szybkosc;
		this.rasa = rasa;
		this.klasa = klasa;
	}
	
	 public void odcz(){
	        System.out.println("testy");
	    }

	public int getAtak() {
		return atak;
	}

	public void setAtak(int atak) {
		this.atak = atak;
	}

	public int getObrona() {
		return obrona;
	}

	public void setObrona(int obrona) {
		this.obrona = obrona;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getSzybkosc() {
		return szybkosc;
	}

	public void setSzybkosc(int szybkosc) {
		this.szybkosc = szybkosc;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public void Grafika(Image im) {
		setImage(im);
		setPreserveRatio(true);
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public String getKlasa() {
		return klasa;
	}

	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}

	public static int getMaxId() {
		return maxId;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}
