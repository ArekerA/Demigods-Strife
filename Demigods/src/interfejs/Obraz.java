package interfejs;

class Obraz {
    private String grafika;
    private int x;
    private int y;
    private int szeroko��;
    private int wysoko��;
	public Obraz(String grafika, int x, int y, int szeroko��, int wysoko��) {
		super();
		this.grafika = grafika;
		this.x = x;
		this.y = y;
		this.szeroko�� = szeroko��;
		this.wysoko�� = wysoko��;
	}
    public void Rysuj() {

    }
	public String getGrafika() {
		return grafika;
	}
	public void setGrafika(String grafika) {
		this.grafika = grafika;
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
}
