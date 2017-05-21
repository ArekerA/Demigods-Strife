package interfejs;

import java.util.ArrayList;

class Tabela{
    private ArrayList<ArrayList<String>> tekst = new ArrayList<ArrayList<String>>();
    private int x;
    private int y;
    private int szerokoœæ;
    private int wysokoœæ;
    private int[] kolorT³a = new int[4];
    private int[] kolorTekstu = new int[4];
    private int[] kolorObramowania = new int[4];
	public Tabela(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokoœæ, int wysokoœæ) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokoœæ = szerokoœæ;
		this.wysokoœæ = wysokoœæ;
	}
	public Tabela(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokoœæ, int wysokoœæ, int[] kolorT³a, int[] kolorTekstu, int[] kolorObramowania) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokoœæ = szerokoœæ;
		this.wysokoœæ = wysokoœæ;
		this.kolorT³a = kolorT³a;
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
	public int[] getKolorT³a() {
		return kolorT³a;
	}
	public void setKolorT³a(int[] kolorT³a) {
		this.kolorT³a = kolorT³a;
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
