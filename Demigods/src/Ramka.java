


import java.beans.FeatureDescriptor;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import interfejs.Obraz;
import walka.FrameWalka;

public class Ramka extends JFrame{

	
		 
	    public Ramka() {
	        super("Demigos Strife");
        	add(new FrameWalka());
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	        setSize(800,600);
	    }
	
}


