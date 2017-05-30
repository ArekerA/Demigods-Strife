package kreator;


public class PostaćWalcząca extends Postać {
    private int x;
    private int y;
    private int aAtak;
    private int aObrona;
    private int aHp;
    private int aMana;
    private int aSzybkość;
    public PostaćWalcząca(Postać p, int x, int y) {
	}
    public void Ruch(int x, int y) {
	}
    public boolean CzyRuchDostępnyy(int x, int y) {
		return false;
	}
    public int X() {
		return x;
	}
    public int Y() {
		return y;
	}
    public int Zaatakuj() {
		return 0;
	}
    public int OtrzymajObrażenia(int o) {
		return 0;
	}
    public void Umrzyj() {
	}
    public void PrzyjmijUmiejętność(Umiejętność u){

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
	public int getaAtak() {
		return aAtak;
	}
	public void setaAtak(int aAtak) {
		this.aAtak = aAtak;
	}
	public int getaObrona() {
		return aObrona;
	}
	public void setaObrona(int aObrona) {
		this.aObrona = aObrona;
	}
	public int getaHp() {
		return aHp;
	}
	public void setaHp(int aHp) {
		this.aHp = aHp;
	}
	public int getaMana() {
		return aMana;
	}
	public void setaMana(int aMana) {
		this.aMana = aMana;
	}
	public int getaSzybkość() {
		return aSzybkość;
	}
	public void setaSzybkość(int aSzybkość) {
		this.aSzybkość = aSzybkość;
	}
}
