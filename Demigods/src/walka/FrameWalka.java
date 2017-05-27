package walka;

import javax.swing.JPanel;

import interfejs.Obraz;

public class FrameWalka extends JPanel {
	public FrameWalka() {
        Obraz nowetlo=new Obraz("img/hex.png",0,0);
        add(nowetlo);
    }
}
