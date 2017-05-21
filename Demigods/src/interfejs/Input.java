package interfejs;

class Input{
    private String tekst;
    private int x;
    private int y;
    private int szeroko��;
	private int wysoko��;
    private int[] kolorT�a = new int[4];
    private int[] kolorTekstu = new int[4];
    public Input(String tekst, int x, int y, int szeroko��, int wysoko��) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szeroko�� = szeroko��;
		this.wysoko�� = wysoko��;
	}
	public Input(String tekst, int x, int y, int szeroko��, int wysoko��, int[] kolorT�a, int[] kolorTekstu) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szeroko�� = szeroko��;
		this.wysoko�� = wysoko��;
		this.kolorT�a = kolorT�a;
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
}
