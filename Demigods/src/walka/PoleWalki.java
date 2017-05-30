package walka;

import java.util.ArrayList;
import kreator.*;

class PoleWalki {
    private int[][] pole = new int[12][20];//+7
    private PostaćWalcząca[] postacieGracz1;
    private PostaćWalcząca[] postacieGracz2;
    private String tło;
    private int tura;
    private ArrayList<String> przebieg = new ArrayList<String>();
	public PoleWalki(PostaćWalcząca[] postacieGracz1, PostaćWalcząca[] postacieGracz2, String tło) {
		this.postacieGracz1 = postacieGracz1;
		this.postacieGracz2 = postacieGracz2;
		this.tło = tło;
	}
	public void PrzesuńPostać(int gracz, int postać) {
	}
	public void ZaatakujPostać(int aGracz, int aPostać, int bGracz, int bPostać) {
	}
    public void Rysuj() {

    }
}
