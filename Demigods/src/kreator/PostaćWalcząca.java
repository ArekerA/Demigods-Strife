package kreator;


public class Posta�Walcz�ca extends Posta� {
    private int x;
    private int y;
    private int aAtak;
    private int aObrona;
    private int aHp;
    private int aMana;
    private int aSzybko��;
    public Posta�Walcz�ca(Posta� p, int x, int y) {
	}
    public void Ruch(int x, int y) {
	}
    public boolean CzyRuchDost�pny(int x, int y) {
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
    public int OtrzymajObra�enia(int o) {
		return 0;
	}
    public void Umrzyj() {
	}
    public void PrzyjmijUmiej�tno��(Umiej�tno�� u){

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
	public int getaSzybko��() {
		return aSzybko��;
	}
	public void setaSzybko��(int aSzybko��) {
		this.aSzybko�� = aSzybko��;
	}
}
