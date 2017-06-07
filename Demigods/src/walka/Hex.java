package walka;

import javafx.scene.image.ImageView;

public class Hex extends ImageView{
	int posX;
	int posY;
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
	
}
