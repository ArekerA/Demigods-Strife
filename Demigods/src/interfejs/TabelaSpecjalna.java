package interfejs;

import java.util.ArrayList;

class TabelaSpecialna extends Tabela{
    private int[] kolorTłaDrugi = new int[4];
    private int[] kolorObramowaniaWewnętrzny = new int[4];
	public TabelaSpecialna(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokość, int wysokość, int[] kolorTłaDrugi, int[] kolorObramowaniaWewnętrzny) {
		super(tekst, x, y, szerokość, wysokość);
		this.kolorTłaDrugi = kolorTłaDrugi;
		this.kolorObramowaniaWewnętrzny = kolorObramowaniaWewnętrzny;
	}
	public TabelaSpecialna(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokość, int wysokość, int[] kolorTła, int[] kolorTekstu, int[] kolorObramowania, int[] kolorTłaDrugi, int[] kolorObramowaniaWewnętrzny) {
		super(tekst, x, y, szerokość, wysokość, kolorTła, kolorTekstu, kolorObramowania);
		this.kolorTłaDrugi = kolorTłaDrugi;
		this.kolorObramowaniaWewnętrzny = kolorObramowaniaWewnętrzny;
	}
	public int[] getKolorTłaDrugi() {
		return kolorTłaDrugi;
	}
	public void setKolorTłaDrugi(int[] kolorTłaDrugi) {
		this.kolorTłaDrugi = kolorTłaDrugi;
	}
	public int[] getKolorObramowaniaWewnętrzny() {
		return kolorObramowaniaWewnętrzny;
	}
	public void setKolorObramowaniaWewnętrzny(int[] kolorObramowaniaWewnętrzny) {
		this.kolorObramowaniaWewnętrzny = kolorObramowaniaWewnętrzny;
	}
}