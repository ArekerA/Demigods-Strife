package interfejs;

import java.util.ArrayList;

class Tabela{
    private ArrayList<ArrayList<String>> tekst = new ArrayList<ArrayList<String>>();
    private int x;
    private int y;
    private int szerokosc;
    private int wysokosc;
    private int[] kolorTla = new int[4];
    private int[] kolorTekstu = new int[4];
    private int[] kolorObramowania = new int[4];
	public Tabela(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokosc, int wysokosc) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
	}
	public Tabela(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokosc, int wysokosc, int[] kolorTla, int[] kolorTekstu, int[] kolorObramowania) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokosc= szerokosc;
		this.wysokosc = wysokosc;
		this.kolorTla = kolorTla;
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
		this.wysokosc= wysokosc;
	}
	public int[] getKolorTla() {
		return kolorTla;
	}
	public void setKolorTla(int[] kolorTła) {
		this.kolorTla = kolorTła;
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
