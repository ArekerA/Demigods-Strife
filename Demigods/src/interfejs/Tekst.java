package interfejs;

class Tekst{
    private String tekst;
    private int x;
    private int y;
    private int szerokoœæ;
	private int wysokoœæ;
    private int[] kolor = new int[4];
    public Tekst(String tekst, int x, int y, int szerokoœæ, int wysokoœæ) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokoœæ = szerokoœæ;
		this.wysokoœæ = wysokoœæ;
		this.kolor[0] = 0;
		this.kolor[1] = 0;
		this.kolor[2] = 0;
		this.kolor[3] = 1;
	}
    public Tekst(String tekst, int x, int y, int szerokoœæ, int wysokoœæ, int[] kolor) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokoœæ = szerokoœæ;
		this.wysokoœæ = wysokoœæ;
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
	public int[] getKolor() {
		return kolor;
	}
	public void setKolor(int[] kolor) {
		this.kolor = kolor;
	}
}