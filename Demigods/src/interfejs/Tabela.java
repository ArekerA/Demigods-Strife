package interfejs;

import java.util.ArrayList;

class Tabela{
    private ArrayList<ArrayList<String>> tekst = new ArrayList<ArrayList<String>>();
    private int x;
    private int y;
    private int szeroko��;
    private int wysoko��;
    private int[] kolorT�a = new int[4];
    private int[] kolorTekstu = new int[4];
    private int[] kolorObramowania = new int[4];
	public Tabela(ArrayList<ArrayList<String>> tekst, int x, int y, int szeroko��, int wysoko��) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szeroko�� = szeroko��;
		this.wysoko�� = wysoko��;
	}
	public Tabela(ArrayList<ArrayList<String>> tekst, int x, int y, int szeroko��, int wysoko��, int[] kolorT�a, int[] kolorTekstu, int[] kolorObramowania) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szeroko�� = szeroko��;
		this.wysoko�� = wysoko��;
		this.kolorT�a = kolorT�a;
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
	public int getSzeroko��() {
		return szeroko��;
	}
	public void setSzeroko��(int szeroko��) {
		this.szeroko�� = szeroko��;
	}
	public int getWysoko��() {
		return wysoko��;
	}
	public void setWysoko��(int wysoko��) {
		this.wysoko�� = wysoko��;
	}
	public int[] getKolorT�a() {
		return kolorT�a;
	}
	public void setKolorT�a(int[] kolorT�a) {
		this.kolorT�a = kolorT�a;
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
