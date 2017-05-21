package kreator;


class Przedmiot {
    private String nazwa;
    private String opis;
    private String grafika;
    private int atak;
    private int obrona;
    private int szybkoœæ;
    private int hp;
    private int mana;
    private Umiejêtnoœæ umiejêtnoœæ;

    public Przedmiot()
    {
        
    }
    public Przedmiot(String nazwa, String opis, String grafika, int atak, int obrona, int szybkoœæ, int hp, int mana)
    {

    }
    public Przedmiot(String nazwa, String opis, String grafika, int atak, int obrona, int szybkoœæ, int hp, int mana, Umiejêtnoœæ umiejêtnoœæ)
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
	public int getSzybkoœæ() {
		return szybkoœæ;
	}
	public int getHp() {
		return hp;
	}
	public int getMana() {
		return mana;
	}
	public Umiejêtnoœæ getUmiejêtnoœæ() {
		return umiejêtnoœæ;
	}
    
}
