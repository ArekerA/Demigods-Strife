package interfejs;

import javax.swing.JFrame;

public class Ramka extends JFrame{

	
		 
	    public Ramka() {
	        super("Demigos Strife");
	        Obraz nowetlo=new Obraz();
	        add(nowetlo);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	        setSize(1200,720);
	    }
	
}


