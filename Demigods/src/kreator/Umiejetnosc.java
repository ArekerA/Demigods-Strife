package kreator;


public class Umiejetnosc {
    private String nazwa;
    private String opis;
    private String grafika;
    private int obrazenia;
    private int plusObrazenia;
    private int plusObrazeniaProcent;
    private int manaRegen;
    private int hpRegen;
    private int lifeSteal; //procent
    private int szybkosc;
    private int unik; //procent
    private int minusObrona;
    private int minusObronaProcent;
    private int czasTrwania;
    private int koszt;
    
    
    
    public Umiejetnosc()
    {
    	
    }
    
    public Umiejetnosc(String nazwa, String opis, String grafika, int obrazenia, int plusObrazenia, int plusObrazeniaProcent, int manaRegen, int hpRegen, int lifeSteal,  int szybkosc,  int unik,  int minusObrona,  int minusObronaProcentc,  int czasTrwania,  int koszt )
    {

    }
    public Umiejetnosc ZwrśćUmiejetnosc(){
		return null;

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
	public int getObrazenia() {
		return obrazenia;
	}
	public int getPlusObrazenia() {
		return plusObrazenia;
	}
	public int getPlusObrazeniaProcent() {
		return plusObrazeniaProcent;
	}
	public int getManaRegen() {
		return manaRegen;
	}
	public int getHpRegen() {
		return hpRegen;
	}
	public int getLifeSteal() {
		return lifeSteal;
	}
	public int getSzybkosc() {
		return szybkosc;
	}
	public int getUnik() {
		return unik;
	}
	public int getMinusObrona() {
		return minusObrona;
	}
	public int getMinusObronaProcent() {
		return minusObronaProcent;
	}
	public int getCzasTrwania() {
		return czasTrwania;
	}
	public int getKoszt() {
		return koszt;
	}
}