package interfejs;

import java.util.ArrayList;

class TabelaSpecialna extends Tabela{
    private int[] kolorT³aDrugi = new int[4];
    private int[] kolorObramowaniaWewnêtrzny = new int[4];
	public TabelaSpecialna(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokoœæ, int wysokoœæ, int[] kolorT³aDrugi, int[] kolorObramowaniaWewnêtrzny) {
		super(tekst, x, y, szerokoœæ, wysokoœæ);
		this.kolorT³aDrugi = kolorT³aDrugi;
		this.kolorObramowaniaWewnêtrzny = kolorObramowaniaWewnêtrzny;
	}
	public TabelaSpecialna(ArrayList<ArrayList<String>> tekst, int x, int y, int szerokoœæ, int wysokoœæ, int[] kolorT³a, int[] kolorTekstu, int[] kolorObramowania, int[] kolorT³aDrugi, int[] kolorObramowaniaWewnêtrzny) {
		super(tekst, x, y, szerokoœæ, wysokoœæ, kolorT³a, kolorTekstu, kolorObramowania);
		this.kolorT³aDrugi = kolorT³aDrugi;
		this.kolorObramowaniaWewnêtrzny = kolorObramowaniaWewnêtrzny;
	}
	public int[] getKolorT³aDrugi() {
		return kolorT³aDrugi;
	}
	public void setKolorT³aDrugi(int[] kolorT³aDrugi) {
		this.kolorT³aDrugi = kolorT³aDrugi;
	}
	public int[] getKolorObramowaniaWewnêtrzny() {
		return kolorObramowaniaWewnêtrzny;
	}
	public void setKolorObramowaniaWewnêtrzny(int[] kolorObramowaniaWewnêtrzny) {
		this.kolorObramowaniaWewnêtrzny = kolorObramowaniaWewnêtrzny;
	}
}