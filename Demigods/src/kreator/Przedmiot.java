package kreator;


class Przedmiot {
    private String nazwa;
    private String opis;
    private String grafika;
    private int atak;
    private int obrona;
    private int szybko��;
    private int hp;
    private int mana;
    private Umiej�tno�� umiej�tno��;

    public Przedmiot()
    {
        
    }
    public Przedmiot(String nazwa, String opis, String grafika, int atak, int obrona, int szybko��, int hp, int mana)
    {

    }
    public Przedmiot(String nazwa, String opis, String grafika, int atak, int obrona, int szybko��, int hp, int mana, Umiej�tno�� umiej�tno��)
    {

    }
	public String getNazwa() {
		return nazwa;
	}
	public String getOpis() {
		return opis;
	}
	public String getGrafika() {
		return grafika;
	}
	public int getAtak() {
		return atak;
	}
	public int getObrona() {
		return obrona;
	}
	public int getSzybko��() {
		return szybko��;
	}
	public int getHp() {
		return hp;
	}
	public int getMana() {
		return mana;
	}
	public Umiej�tno�� getUmiej�tno��() {
		return umiej�tno��;
	}
    
}
