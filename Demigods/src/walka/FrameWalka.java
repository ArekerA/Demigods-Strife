package walka;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import interfejs.Obraz;

public class FrameWalka extends JPanel {
	public FrameWalka() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new Obraz("img/hex.png",0,0));
        add(new Obraz("img/hex.png",80,0));
        add(new Obraz("img/hex.png",160,0));
        add(new Obraz("img/hex.png",240,0));
    }
}
