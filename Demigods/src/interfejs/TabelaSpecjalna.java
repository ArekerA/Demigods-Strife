package interfejs;

import java.util.ArrayList;

class TabelaSpecialna extends Tabela{
    private int[] kolorTlaDrugi = new int[4];
    private int[] kolorObramowaniaWewnetrzny = new int[4];
	public TabelaSpecialna(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokosc, int wysokosc, int[] kolorTlaDrugi, int[] kolorObramowaniaWewnętrzny) {
		super(tekst, x, y, szerokosc, wysokosc);
		this.kolorTlaDrugi = kolorTlaDrugi;
		this.kolorObramowaniaWewnetrzny = kolorObramowaniaWewnętrzny;
	}
	public TabelaSpecialna(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokosc, int wysokosc, int[] kolorTla, int[] kolorTekstu, int[] kolorObramowania, int[] kolorTlaDrugi, int[] kolorObramowaniaWewnetrzny) {
		super(tekst, x, y, szerokosc, wysokosc, kolorTla, kolorTekstu, kolorObramowania);
		this.kolorTlaDrugi = kolorTlaDrugi;
		this.kolorObramowaniaWewnetrzny = kolorObramowaniaWewnetrzny;
	}
	public int[] getKolorTlaDrugi() {
		return kolorTlaDrugi;
	}
	public void setKolorTlaDrugi(int[] kolorTlaDrugi) {
		this.kolorTlaDrugi = kolorTlaDrugi;
	}
	public int[] getKolorObramowaniaWewnetrzny() {
		return kolorObramowaniaWewnetrzny;
	}
	public void setKolorObramowaniaWewnetrzny(int[] kolorObramowaniaWewnetrzny) {
		this.kolorObramowaniaWewnetrzny = kolorObramowaniaWewnetrzny;
	}
}