package walka;

import javax.swing.JFrame;

import interfejs.Obraz;

public class FrameWalka extends JFrame {
	public FrameWalka() {
        super("Hello World");

        Obraz nowetlo=new Obraz("img/hex.png",0,0);
        add(nowetlo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,600);
    }
}
