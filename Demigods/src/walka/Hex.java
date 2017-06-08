package walka;

import java.util.ArrayList;

import javafx.scene.image.ImageView;

public class Hex extends ImageView{
	int posX;
	int posY;
	ArrayList<Hex> polaczenia = new ArrayList<Hex>();
	/**
	   * Zwraca pozycję X hexa.
	   * @return int Zwraca pozycję X hexa.
	   */
	public int getPosX() {
		return posX;
	}
	/**
	   * Ustawia pozycję X hexa
	   * @param posX Pozycja X hexa
	   * @return void
	   */
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	   * Zwraca pozycję Y hexa.
	   * @return int Zwraca pozycję Y hexa.
	   */
	public int getPosY() {
		return posY;
	}
	/**
	   * Ustawia pozycję Y hexa
	   * @param posX Pozycja Y hexa
	   * @return void
	   */
	public void setPosY(int posY) {
		this.posY = posY;
	}
	/**
	   * Zwraca wszystkie połączenia
	   * @return ArrayList<Hex> lista połączeń
	   */
	public ArrayList<Hex> Polaczenia() {
		return polaczenia;
	}
	/**
	   * Dodaje połączenie
	   * @param polaczenie Hex, z którym ma się utworzyć połączenie
	   * @return boolean false jeśli istnieje już połączenie
	   */
	public boolean dodaj(Hex polaczenie) {
		for(Hex p : polaczenia)
		{
			if(polaczenie.getPosX() == p.getPosX() && polaczenie.getPosY() == p.getPosY())
				return false;
		}
		polaczenia.add(polaczenie);
		return true;
	}
	
}
