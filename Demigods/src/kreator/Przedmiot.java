package kreator;


class Przedmiot {
    private String nazwa;
    private String opis;
    private String grafika;
    private int atak;
    private int obrona;
    private int szybkosc;
    private int hp;
    private int mana;
    private Umiejetnosc umiejetnosc;

    public Przedmiot()
    {
        
    }
    public Przedmiot(String nazwa, String opis, String grafika, int atak, int obrona, int szybkosc, int hp, int mana)
    {

    }
    public Przedmiot(String nazwa, String opis, String grafika, int atak, int obrona, int szybkosc, int hp, int mana, Umiejetnosc umiejetnosc)
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
	public int getSzybkosc() {
		return szybkosc;
	}
	public int getHp() {
		return hp;
	}
	public int getMana() {
		return mana;
	}
	public Umiejetnosc getUmiejetnosc() {
		return umiejetnosc;
	}
    
}
