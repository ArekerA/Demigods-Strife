package walka;

import kreator.Umiejetnosc;
import kreator.Postac;

/**
 * Interfejs niewykorzystany
 * 
 * @author Zespół
 */
public interface InterfejsPostaci {
    public void Ruch(Hex h);
    public void setPozycja(Hex h);
    public void getPozycja();
    public int Zaatakuj(Postac p);
    public int OtrzymajObrazenia(int x);
    public void Umrzyj();
    public void PrzyjmijUmiejetnosc(Umiejetnosc u);
}
