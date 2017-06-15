package walka;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Klasa przechowująca dane hexów rozszerzająca javafx.scene.image.ImageView;
 * 
 * @author Zespół
 */
public class Hex extends ImageView {
	int posX;
	int posY;
	boolean dostepny = false;
	private Image im_hex = new Image("img/hex.png");
	private Image im_hex2 = new Image("img/hex2.png");
	private Image im_hex3 = new Image("img/hex3.png");
	ArrayList<Hex> polaczenia = new ArrayList<Hex>();
	Hex()
	{
		super();
		setOnMouseEntered(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
					setImage(im_hex3);
			}
		});
		setOnMouseExited(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				if(dostepny)
					setImage(im_hex2);
				else
					setImage(im_hex);
			}
		});
		setImage(im_hex);
	}

	/**
	 * Zwraca pozycję X hexa.
	 * 
	 * @return int Zwraca pozycję X hexa.
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * Ustawia pozycję X hexa
	 * 
	 * @param posX
	 *            Pozycja X hexa
	 * @return void
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * Zwraca pozycję Y hexa.
	 * 
	 * @return int Zwraca pozycję Y hexa.
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * Ustawia pozycję Y hexa
	 * 
	 * @param posX
	 *            Pozycja Y hexa
	 * @return void
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}

	/**
	 * Zwraca wszystkie połączenia
	 * 
	 * @return ArrayList<Hex> lista połączeń
	 */
	public ArrayList<Hex> Polaczenia() {
		return polaczenia;
	}

	/**
	 * Dodaje połączenie
	 * 
	 * @param polaczenie
	 *            Hex, z którym ma się utworzyć połączenie
	 * @return boolean false jeśli istnieje już połączenie
	 */
	public boolean dodaj(Hex polaczenie) {
		for (Hex p : polaczenia) {
			if (polaczenie.getPosX() == p.getPosX() && polaczenie.getPosY() == p.getPosY())
				return false;
		}
		polaczenia.add(polaczenie);
		polaczenie.dodaj(this);
		return true;
	}

	/**
	 * Sprawdz, czy pole dostępne
	 * 
	 * @return boolean dostępność
	 */
	public boolean isDostepny() {
		return dostepny;
	}

	/**
	 * Ustawia dostępność
	 * 
	 * @param boolean
	 *            dostepny
	 * @return void
	 */
	public void setDostepny(boolean dostepny) {
		this.dostepny = dostepny;
		if(dostepny)
			setImage(im_hex2);
		else
			setImage(im_hex);
	}
}
