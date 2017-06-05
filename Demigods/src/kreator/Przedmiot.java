package kreator;


class Przedmiot {
    String nazwa;
    private String opis;
    private String grafika;
    private int atak;
    private int obrona;
    private int szybkosc;
    private int hp;
    private int mana;
    private Umiejetnosc umiejetność;
    String rodzaj;
    
    String[] broniewojownik={"Miecz","Topór"};
    String[] bronielucznik={"Kusza","Łuk"};
    String[] broniemag={"Laska","Kostur"};
    String[] miecze={"Wampirze Gardło", "Zapomniane Ostrze", "Promień Nadziei"};
    String[] topory={"Młot Grabarze", "Sekator", "Bukiet Strachu"};
    String[] luki={"Ostatnie Życzenie", "Mantra", "Czwarty Muszkieter"};
    String[] kusze={"Gałąź Wisielca", "Magiczne Ustrojstwo", "Dar Losu"};
    String[] laski={"Pierwsza Dama", "Wdowa", "Morowa Dziewica"};
    String[] kostury={"Konar Potencjału","Kostur Zaparcia", "Noga Enta"};
    

    public Przedmiot()
    {
        
    }
    public Przedmiot(String nazwa, String opis, String grafika, int atak, int obrona, int szybkosc, int hp, int mana)
    {

    }
    public Przedmiot(String nazwa, String opis, String grafika, int atak, int obrona, int szybkosc, int hp, int mana, Umiejetnosc umiejetność)
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
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getHp() {
		return hp;
	}
	public int getMana() {
		return mana;
	}
	public Umiejetnosc getUmiejetnosc() {
		return umiejetność;
	}
    
}
