package kreator;

public class Postac {
    private static int maxId = 0;
    private int id;
    private int atak;
    private int obrona;
    private int hp;
    private int mana;
    private int szybkosc;
    String nazwa;
    private String opis;
    private String grafika;
    String rasa;
    String klasa;

    static String[] rasy={"Człowiek","Elf","Ork"};//0-cz�owiek, 1-elf, 2-ork
    final static String[] klasy={"Wojownik","Łucznik","Ork"};//0-wojownik, 1-�ucznik, 2-mag

    public Postac()
    {
      //
    }
    public Postac(int atak, int obrona, int hp, int mana, int szybkosc, String rasa, String klasa)
    {
        id = maxId++;
        this.atak = atak;
        this.obrona = obrona;
        this.hp = hp;
        this.mana = mana;
        this.szybkosc = szybkosc;
        this.rasa=rasa;
        this.klasa=klasa;
    }
	public int getAtak() {
		return atak;
	}
	public void setAtak(int atak) {
		this.atak = atak;
	}
	public int getObrona() {
		return obrona;
	}
	public void setObrona(int obrona) {
		this.obrona = obrona;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getSzybkosc() {
		return szybkosc;
	}
	public void setSzybkosc(int szybkosc) {
		this.szybkosc = szybkosc;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public String getGrafika() {
		return grafika;
	}
	public void setGrafika(String grafika) {
		this.grafika = grafika;
	}
	public String getRasa() {
		return rasa;
	}
	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
	public String getKlasa() {
		return klasa;
	}
	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}
	public static int getMaxId() {
		return maxId;
	}
	public int getId() {
		return id;
	}
}
