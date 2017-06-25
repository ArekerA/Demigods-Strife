package walka;

import java.util.ArrayList;

/**
 * Klasa niewykorzystana
 * 
 * @author Zespół
 */
class PoleWalki {
    private int[][] pole = new int[12][20];//+7
    private PostacWalcząca[] postacieGracz1;
    private PostacWalcząca[] postacieGracz2;
    private String tlo;
    private int tura;
    private ArrayList<String> przebieg = new ArrayList<String>();
	public PoleWalki(PostacWalcząca[] postacieGracz1, PostacWalcząca[] postacieGracz2, String tlo) {
		this.postacieGracz1 = postacieGracz1;
		this.postacieGracz2 = postacieGracz2;
		this.tlo = tlo;
	}
	public void PrzesunPostać(int gracz, int postac) {
	}
	public void ZaatakujPostać(int aGracz, int aPostac, int bGracz, int bPostac) {
	}
    public void Rysuj() {

    }
}
