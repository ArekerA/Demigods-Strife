package interfejs;

class Button{
    private int x;
    private int y;
    private int szerokoœæ;
    private int wysokoœæ;
    private String tekst;
    private int[] kolorT³a = new int[4];
    private int[] kolorTekstu = new int[4];
    private int[] kolorT³aAktywny = new int[4];
    private int[] kolorTekstuAktywny = new int[4];
    public Button(){

    }
    public Button(int x, int y, String tekst){

    }
    public Button(int x, int y, int szerokoœæ, int wysokoœæ, String tekst){

    }
    public Button(int x, int y, int szerokoœæ, int wysokoœæ, String tekst, int[] kolorT³a, int[] kolorTekstu, int[] kolorT³aAktywny, int[] kolorTekstuAktywny){

    }
    public void Rysuj(){

    }
    /*public void DodajAkcjê(ActionListener a)
    {

    }*/
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
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
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
	public int[] getKolorT³aAktywny() {
		return kolorT³aAktywny;
	}
	public void setKolorT³aAktywny(int[] kolorT³aAktywny) {
		this.kolorT³aAktywny = kolorT³aAktywny;
	}
	public int[] getKolorTekstuAktywny() {
		return kolorTekstuAktywny;
	}
	public void setKolorTekstuAktywny(int[] kolorTekstuAktywny) {
		this.kolorTekstuAktywny = kolorTekstuAktywny;
	}
}
