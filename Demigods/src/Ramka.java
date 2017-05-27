


import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import interfejs.Obraz;
import walka.FrameWalka;

public class Ramka extends JFrame{

	
		 
	    public Ramka() {
	        super("Demigos Strife");
	        Obraz obraz=new Obraz("img/hex.png",0,0);
	        Obraz obraz2=new Obraz("img/hex.png",92,92);
	        JPanel mainPanel= new JPanel();
	        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	        mainPanel.add(obraz);
	        mainPanel.add(obraz2);
        	add(mainPanel);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	        setSize(800,600);
	    }
	
}


