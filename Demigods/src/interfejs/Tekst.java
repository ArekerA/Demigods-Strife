package interfejs;

class Tekst{
    private String tekst;
    private int x;
    private int y;
    private int szeroko��;
	private int wysoko��;
    private int[] kolor = new int[4];
    public Tekst(String tekst, int x, int y, int szeroko��, int wysoko��) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szeroko�� = szeroko��;
		this.wysoko�� = wysoko��;
		this.kolor[0] = 0;
		this.kolor[1] = 0;
		this.kolor[2] = 0;
		this.kolor[3] = 1;
	}
    public Tekst(String tekst, int x, int y, int szeroko��, int wysoko��, int[] kolor) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szeroko�� = szeroko��;
		this.wysoko�� = wysoko��;
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
	public int[] getKolor() {
		return kolor;
	}
	public void setKolor(int[] kolor) {
		this.kolor = kolor;
	}
}