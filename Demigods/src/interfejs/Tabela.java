package interfejs;

import java.util.ArrayList;
/**
 * Klasa niewykorzystana
 * 
 * @author Zespół
 */
class Tabela{
    private ArrayList<ArrayList<String>> tekst = new ArrayList<ArrayList<String>>();
    private int x;
    private int y;
    private int szerokość;
    private int wysokość;
    private int[] kolorTła = new int[4];
    private int[] kolorTekstu = new int[4];
    private int[] kolorObramowania = new int[4];
	public Tabela(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokość, int wysokość) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokość = szerokość;
		this.wysokość = wysokość;
	}
	public Tabela(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokość, int wysokość, int[] kolorTła, int[] kolorTekstu, int[] kolorObramowania) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokość= szerokość;
		this.wysokość = wysokość;
		this.kolorTła = kolorTła;
		this.kolorTekstu = kolorTekstu;
		this.kolorObramowania = kolorObramowania;
	}
    public void Rysuj() {

    }
	public ArrayList<ArrayList<String>> getTekst() {
		return tekst;
	}
	public void setTekst(ArrayList<ArrayList<String>> tekst) {
		this.tekst = tekst;
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
		this.wysokość= wysokość;
	}
	public int[] getKolorTła() {
		return kolorTła;
	}
	public void setKolorTła(int[] kolorTła) {
		this.kolorTła = kolorTła;
	}
	public int[] getKolorTekstu() {
		return kolorTekstu;
	}
	public void setKolorTekstu(int[] kolorTekstu) {
		this.kolorTekstu = kolorTekstu;
	}
	public int[] getKolorObramowania() {
		return kolorObramowania;
	}
	public void setKolorObramowania(int[] kolorObramowania) {
		this.kolorObramowania = kolorObramowania;
	}
}
