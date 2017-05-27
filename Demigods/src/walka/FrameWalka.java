package walka;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import interfejs.Obraz;

public class FrameWalka extends JPanel {
	public FrameWalka() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		/*for(int y = 0; y < 2; y++)
			for(int x = 0; x < 3; x++)
			{
				add(new Obraz("img/hex.png",x*40+20*(y%2),y*34));
			}*/
		add(new Obraz("img/hex.png",0,0));
		add(new Obraz("img/hex.png",40,0));
		add(new Obraz("img/hex.png",80,0));
		add(new Obraz("img/hex.png",20,34));
		add(new Obraz("img/hex.png",60,34));
		/*add(new Obraz("img/hex.png",100,34));
		add(new Obraz("img/hex.png",0,68));
		add(new Obraz("img/hex.png",40,68));
		add(new Obraz("img/hex.png",80,68));*/
    }
}
