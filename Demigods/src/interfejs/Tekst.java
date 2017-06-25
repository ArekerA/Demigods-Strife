package interfejs;
/**
 * Klasa niewykorzystana
 * 
 * @author Zespół
 */
class Tekst{
    private String tekst;
    private int x;
    private int y;
    private int szerokosc;
	private int wysokosc;
    private int[] kolor = new int[4];
    public Tekst(String tekst, int x, int y, int szerokosc, int wysokosc) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
		this.kolor[0] = 0;
		this.kolor[1] = 0;
		this.kolor[2] = 0;
		this.kolor[3] = 1;
	}
    public Tekst(String tekst, int x, int y, int szerokosc, int wysokosc, int[] kolor) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
		this.kolor = kolor;
	}
    public void Rysuj() {

    }
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
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
		this.wysokosc = wysokosc;
	}
	public int[] getKolor() {
		return kolor;
	}
	public void setKolor(int[] kolor) {
		this.kolor = kolor;
	}
}