package interfejs;

class Tekst{
    private String tekst;
    private int x;
    private int y;
    private int szerokość;
	private int wysokość;
    private int[] kolor = new int[4];
    public Tekst(String tekst, int x, int y, int szerokość, int wysokość) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokość = szerokość;
		this.wysokość = wysokość;
		this.kolor[0] = 0;
		this.kolor[1] = 0;
		this.kolor[2] = 0;
		this.kolor[3] = 1;
	}
    public Tekst(String tekst, int x, int y, int szerokość, int wysokość, int[] kolor) {
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		this.szerokość = szerokość;
		this.wysokość = wysokość;
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
	public int getSzerokość() {
		return szerokość;
	}
	public void setSzerokość(int szerokość) {
		this.szerokość = szerokość;
	}
	public int getWysokość() {
		return wysokość;
	}
	public void setWysokość(int wysokość) {
		this.wysokość = wysokość;
	}
	public int[] getKolor() {
		return kolor;
	}
	public void setKolor(int[] kolor) {
		this.kolor = kolor;
	}
}