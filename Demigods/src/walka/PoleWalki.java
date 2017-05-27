package walka;

import java.util.ArrayList;
import kreator.*;

class PoleWalki {
    private int[][] pole = new int[12][20];//+7
    private PostaæWalcz¹ca[] postacieGracz1;
    private PostaæWalcz¹ca[] postacieGracz2;
    private String t³o;
    private int tura;
    private ArrayList<String> przebieg = new ArrayList<String>();
	public PoleWalki(PostaæWalcz¹ca[] postacieGracz1, PostaæWalcz¹ca[] postacieGracz2, String t³o) {
		this.postacieGracz1 = postacieGracz1;
		this.postacieGracz2 = postacieGracz2;
		this.t³o = t³o;
	}
	public void PrzesuñPostaæ(int gracz, int postaæ) {
	}
	public void ZaatakujPostaæ(int aGracz, int aPostaæ, int bGracz, int bPostaæ) {
	}
    public void Rysuj() {

    }
}
