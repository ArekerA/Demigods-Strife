package kreator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

@SuppressWarnings("serial")
/**
 * Klasa będąca reprezentacją postaci dziedzicząca po javafx.scene.image.ImageView i implementująca java.io.Serializable;
 * 
 * @author Zespół
 */
public class Postac extends ImageView implements Serializable {
	@Override
	public String toString() {
		return nazwa + " " + rasa + " " + klasa + "\n";
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
/**
 *  kosntruktor domyślny
 */
	public Postac() {
		this.atak=10;
		this.obrona=3;
		this.hp=50;
		this.mana=20;
		this.szybkosc=5;
	}
	/**
	 * Konstruktor z parametrami
	 * @param atak
	 * @param obrona
	 * @param hp
	 * @param mana
	 * @param szybkosc
	 * @param rasa
	 * @param klasa
	 */
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
	
	/**
	 *  Zwraca atak
	 * @return int atak
	 */
	public int getAtak() {
		return atak;
	}
	/**
	 * Ustawia atak
	 * @param atak
	 */
	public void setAtak(int atak) {
		this.atak = atak;
	}
/**
 * Zwraca obronę
 * @return int obrona
 */
	public int getObrona() {
		return obrona;
	}
/**
 * Ustawia obronę
 * @param obrona
 */
	public void setObrona(int obrona) {
		this.obrona = obrona;
	}
/**
 * Zwraca HP
 * @return int HP
 */
	public int getHp() {
		return hp;
	}
/**
 * Ustawia HP
 * @param hp
 */
	public void setHp(int hp) {
		this.hp = hp;
	}
/**
 * Zwraca manę
 * @return int mana
 */
	public int getMana() {
		return mana;
	}
/**
 * Ustawia manę
 * @param mana
 */
	public void setMana(int mana) {
		this.mana = mana;
	}
/**
 * Zwraca szybkość
 * @return int szybkość
 */
	public int getSzybkosc() {
		return szybkosc;
	}
/**
 * Ustawia szybkość
 * @param szybkosc
 */
	public void setSzybkosc(int szybkosc) {
		this.szybkosc = szybkosc;
	}
/**
 * Zwraca nazwę
 * @return String nazwa
 */
	public String getNazwa() {
		return nazwa;
	}
/**
 * Ustawia nazwę
 * @param nazwa
 */
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
/**
 * Zwraca opis
 * @return
 */
	public String getOpis() {
		return opis;
	}
/**
 * Ustawia opis
 * @param opis
 */
	public void setOpis(String opis) {
		this.opis = opis;
	}
/**
 * Ustawia grafikę
 * @param im
 */
	public void Grafika(Image im) {
		setImage(im);
		setPreserveRatio(true);
	}
	/**
	 * Zwraca rasę
	 * @return
	 */
	public String getRasa() {
		return rasa;
	}
/**
 * Ustawia rasę
 * @param rasa
 */
	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
/**
 * Zwraca klasę
 * @return
 */
	public String getKlasa() {
		return klasa;
	}
/**
 * Ustawia klasę
 * @param klasa
 */
	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}
/**
 * Zwraca maksymalne ID
 * @return
 */
	public static int getMaxId() {
		return maxId;
	}
/**
 * Zwraca pozycję X
 * @return 
 */
	public int getPosX() {
		return posX;
	}
/**
 * Ustawia pozycję X
 * @param posX
 */
	public void setPosX(int posX) {
		this.posX = posX;
	}
/**
 * Zwraca pozycję Y
 * @return
 */
	public int getPosY() {
		return posY;
	}
/**
 * Ustawia pozycję Y
 * @param posY
 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
