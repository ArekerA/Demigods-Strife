package walka;

import kreator.Postac;
import kreator.Umiejetnosc;

public class PostacWalcząca extends Postac {
    private int x;
    private int y;
    private int aAtak;
    private int aObrona;
    private int aHp;
    private int aMana;
    private int aSzybkosc;
    public PostacWalcząca(Postac p, int x, int y) {
	}
    public void Ruch(int x, int y) {
	}
    public boolean CzyRuchDostępny(int x, int y) {
		return false;
	}
    public int X() {
		return x;
	}
    public int Y() {
		return y;
	}
    public int Zaatakuj() {
		return 0;
	}
    public int OtrzymajObrazenia(int o) {
		return 0;
	}
    public void Umrzyj() {
	}
    public void PrzyjmijUmiejetnosc(Umiejetnosc u){

    }
	public int getaAtak() {
		return aAtak;
	}
	public void setaAtak(int aAtak) {
		this.aAtak = aAtak;
	}
	public int getaObrona() {
		return aObrona;
	}
	public void setaObrona(int aObrona) {
		this.aObrona = aObrona;
	}
	public int getaHp() {
		return aHp;
	}
	public void setaHp(int aHp) {
		this.aHp = aHp;
	}
	public int getaMana() {
		return aMana;
	}
	public void setaMana(int aMana) {
		this.aMana = aMana;
	}
	public int getaSzybkosc() {
		return aSzybkosc;
	}
	public void setaSzybkosc(int aSzybkosc) {
		this.aSzybkosc = aSzybkosc;
	}
}
