

import javax.swing.JFrame;

import interfejs.Obraz;

public class Ramka extends JFrame{

	
		 
	    public Ramka() {
	        super("Demigos Strife");
	        Obraz nowetlo=new Obraz("img/t³o.png",0,0,800,600);
	        add(nowetlo);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	        setSize(800,600);
	    }
	
}


