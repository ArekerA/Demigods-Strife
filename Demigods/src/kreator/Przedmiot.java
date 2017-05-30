package kreator;


class Przedmiot {
    private String nazwa;
    private String opis;
    private String grafika;
    private int atak;
    private int obrona;
    private int szybkość;
    private int hp;
    private int mana;
    private Umiejętność umiejętność;

    public Przedmiot()
    {
        
    }
    public Przedmiot(String nazwa, String opis, String grafika, int atak, int obrona, int szybkość, int hp, int mana)
    {

    }
    public Przedmiot(String nazwa, String opis, String grafika, int atak, int obrona, int szybkość, int hp, int mana, Umiejętność umiejętność)
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
	public int getSzybkość() {
		return szybkość;
	}
	public int getHp() {
		return hp;
	}
	public int getMana() {
		return mana;
	}
	public Umiejętność getUmiejętność() {
		return umiejętność;
	}
    
}
