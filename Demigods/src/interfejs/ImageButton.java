package interfejs;

class ImageButton extends Button {
    private String obraz;
    private String obrazAktywny;
    public ImageButton(){

    }
    public ImageButton(int x, int y, String tekst, String obraz, String obrazAktywny){

    }
    public ImageButton(int x, int y, int szeroko��, int wysoko��, String tekst, String obraz, String obrazAktywny){

    }
    public void Rysuj(){

    }
	public String getObraz() {
		return obraz;
	}
	public void setObraz(String obraz) {
		this.obraz = obraz;
	}
	public String getObrazAktywny() {
		return obrazAktywny;
	}
	public void setObrazAktywny(String obrazAktywny) {
		this.obrazAktywny = obrazAktywny;
	}
}
