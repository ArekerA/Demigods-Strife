package interfejs;

import java.util.ArrayList;

class TabelaSpecialna extends Tabela{
    private int[] kolorTłaDrugi = new int[4];
    private int[] kolorObramowaniaWewnłtrzny = new int[4];
	public TabelaSpecialna(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokosc, int wysokosc, int[] kolorTłaDrugi, int[] kolorObramowaniaWewnłtrzny) {
		super(tekst, x, y, szerokosc, wysokosc);
		this.kolorTłaDrugi = kolorTłaDrugi;
		this.kolorObramowaniaWewnłtrzny = kolorObramowaniaWewnłtrzny;
	}
	public TabelaSpecialna(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokosc, int wysokosc, int[] kolorTła, int[] kolorTekstu, int[] kolorObramowania, int[] kolorTlaDrugi, int[] kolorObramowaniaWewnłtrzny) {
		super(tekst, x, y, szerokosc, wysokosc, kolorTła, kolorTekstu, kolorObramowania);
		this.kolorTłaDrugi = kolorTłaDrugi;
		this.kolorObramowaniaWewnłtrzny = kolorObramowaniaWewnłtrzny;
	}
	public int[] getKolorTłaDrugi() {
		return kolorTłaDrugi;
	}
	public void setKolorTłaDrugi(int[] kolorTłaDrugi) {
		this.kolorTłaDrugi = kolorTłaDrugi;
	}
	public int[] getKolorObramowaniaWewnłtrzny() {
		return kolorObramowaniaWewnłtrzny;
	}
	public void setKolorObramowaniaWewnłtrzny(int[] kolorObramowaniaWewnłtrzny) {
		this.kolorObramowaniaWewnłtrzny = kolorObramowaniaWewnłtrzny;
	}
}