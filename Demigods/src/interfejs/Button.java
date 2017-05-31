package interfejs;

class Button{
    private int x;
    private int y;
    private int szerokosc;
    private int wysokosc;
    private String tekst;
    private int[] kolorTla = new int[4];
    private int[] kolorTekstu = new int[4];
    private int[] kolorTlaAktywny = new int[4];
    private int[] kolorTekstuAktywny = new int[4];
    public Button(){

    }
    public Button(int x, int y, String tekst){

    }
    public Button(int x, int y, int szerokosc, int wysokosc, String tekst){

    }
    public Button(int x, int y, int szerokosc, int wysokosc, String tekst, int[] kolorTła, int[] kolorTekstu, int[] kolorTłaAktywny, int[] kolorTekstuAktywny){

    }
    public void Rysuj(){

    }
    /*public void DodajAkcję(ActionListener a)
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
		this.wysokosc = wysokosc;
	}
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	public int[] getKolorTla() {
		return kolorTla;
	}
	public void setKolorTla(int[] kolorTla) {
		this.kolorTla = kolorTla;
	}
	public int[] getKolorTekstu() {
		return kolorTekstu;
	}
	public void setKolorTekstu(int[] kolorTekstu) {
		this.kolorTekstu = kolorTekstu;
	}
	public int[] getKolorTlaAktywny() {
		return kolorTlaAktywny;
	}
	public void setKolorTlaAktywny(int[] kolorTlaAktywny) {
		this.kolorTlaAktywny = kolorTlaAktywny;
	}
	public int[] getKolorTekstuAktywny() {
		return kolorTekstuAktywny;
	}
	public void setKolorTekstuAktywny(int[] kolorTekstuAktywny) {
		this.kolorTekstuAktywny = kolorTekstuAktywny;
	}
}
