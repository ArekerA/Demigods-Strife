package interfejs;

import javax.swing.JFrame;

public class Ramka extends JFrame{

	
		 
	    public Ramka() {
	        super("Demigos Strife");
	        Obraz nowetlo=new Obraz("img/t�o.png",100,100);
	        add(nowetlo);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	        setSize(800,600);
	    }
	
}


