package walka;

import java.util.ArrayList;
import kreator.*;

class PoleWalki {
    private int[][] pole = new int[12][20];//+7
    private Posta�Walcz�ca[] postacieGracz1;
    private Posta�Walcz�ca[] postacieGracz2;
    private String t�o;
    private int tura;
    private ArrayList<String> przebieg = new ArrayList<String>();
	public PoleWalki(Posta�Walcz�ca[] postacieGracz1, Posta�Walcz�ca[] postacieGracz2, String t�o) {
		this.postacieGracz1 = postacieGracz1;
		this.postacieGracz2 = postacieGracz2;
		this.t�o = t�o;
	}
	public void Przesu�Posta�(int gracz, int posta�) {
	}
	public void ZaatakujPosta�(int aGracz, int aPosta�, int bGracz, int bPosta�) {
	}
    public void Rysuj() {

    }
}
