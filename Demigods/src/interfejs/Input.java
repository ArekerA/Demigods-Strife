package interfejs;

class Input{
    private String tekst;
    private int x;
    private int y;
    private int szerokoœæ;
	private int wysokoœæ;
    private int[] kolorT³a = new int[4];
    private int[] kolorTekstu = new int[4];
    public Input(String tekst, int x, int y, int szerokoœæ, int wysokoœæ) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokoœæ = szerokoœæ;
		this.wysokoœæ = wysokoœæ;
	}
	public Input(String tekst, int x, int y, int szerokoœæ, int wysokoœæ, int[] kolorT³a, int[] kolorTekstu) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokoœæ = szerokoœæ;
		this.wysokoœæ = wysokoœæ;
		this.kolorT³a = kolorT³a;
		this.kolorTekstu = kolorTekstu;
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
}
