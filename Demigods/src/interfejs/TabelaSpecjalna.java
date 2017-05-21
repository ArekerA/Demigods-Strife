package interfejs;

import java.util.ArrayList;

class TabelaSpecialna extends Tabela{
    private int[] kolorT�aDrugi = new int[4];
    private int[] kolorObramowaniaWewn�trzny = new int[4];
	public TabelaSpecialna(ArrayList<ArrayList<String>> tekst, int x, int y, int szeroko��, int wysoko��, int[] kolorT�aDrugi, int[] kolorObramowaniaWewn�trzny) {
		super(tekst, x, y, szeroko��, wysoko��);
		this.kolorT�aDrugi = kolorT�aDrugi;
		this.kolorObramowaniaWewn�trzny = kolorObramowaniaWewn�trzny;
	}
	public TabelaSpecialna(ArrayList<ArrayList<String>> tekst, int x, int y, int szeroko��, int wysoko��, int[] kolorT�a, int[] kolorTekstu, int[] kolorObramowania, int[] kolorT�aDrugi, int[] kolorObramowaniaWewn�trzny) {
		super(tekst, x, y, szeroko��, wysoko��, kolorT�a, kolorTekstu, kolorObramowania);
		this.kolorT�aDrugi = kolorT�aDrugi;
		this.kolorObramowaniaWewn�trzny = kolorObramowaniaWewn�trzny;
	}
	public int[] getKolorT�aDrugi() {
		return kolorT�aDrugi;
	}
	public void setKolorT�aDrugi(int[] kolorT�aDrugi) {
		this.kolorT�aDrugi = kolorT�aDrugi;
	}
	public int[] getKolorObramowaniaWewn�trzny() {
		return kolorObramowaniaWewn�trzny;
	}
	public void setKolorObramowaniaWewn�trzny(int[] kolorObramowaniaWewn�trzny) {
		this.kolorObramowaniaWewn�trzny = kolorObramowaniaWewn�trzny;
	}
}