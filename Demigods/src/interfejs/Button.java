package interfejs;

class Button{
    private int x;
    private int y;
    private int szeroko��;
    private int wysoko��;
    private String tekst;
    private int[] kolorT�a = new int[4];
    private int[] kolorTekstu = new int[4];
    private int[] kolorT�aAktywny = new int[4];
    private int[] kolorTekstuAktywny = new int[4];
    public Button(){

    }
    public Button(int x, int y, String tekst){

    }
    public Button(int x, int y, int szeroko��, int wysoko��, String tekst){

    }
    public Button(int x, int y, int szeroko��, int wysoko��, String tekst, int[] kolorT�a, int[] kolorTekstu, int[] kolorT�aAktywny, int[] kolorTekstuAktywny){

    }
    public void Rysuj(){

    }
    /*public void DodajAkcj�(ActionListener a)
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
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
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
	public int[] getKolorT�aAktywny() {
		return kolorT�aAktywny;
	}
	public void setKolorT�aAktywny(int[] kolorT�aAktywny) {
		this.kolorT�aAktywny = kolorT�aAktywny;
	}
	public int[] getKolorTekstuAktywny() {
		return kolorTekstuAktywny;
	}
	public void setKolorTekstuAktywny(int[] kolorTekstuAktywny) {
		this.kolorTekstuAktywny = kolorTekstuAktywny;
	}
}
