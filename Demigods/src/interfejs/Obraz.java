package interfejs;

class Obraz {
    private String grafika;
    private int x;
    private int y;
    private int szerokoœæ;
    private int wysokoœæ;
	public Obraz(String grafika, int x, int y, int szerokoœæ, int wysokoœæ) {
		super();
		this.grafika = grafika;
		this.x = x;
		this.y = y;
		this.szerokoœæ = szerokoœæ;
		this.wysokoœæ = wysokoœæ;
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
}
