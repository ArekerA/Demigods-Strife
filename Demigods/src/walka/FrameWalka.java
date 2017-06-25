package walka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import kreator.Postac;
/**
 * Klasa będąca oknem walki dziedzicząca po javafx.application.Application;
 * 
 * @author Zespół
 */
public class FrameWalka extends Application {
	ArrayList<Hex> poleWalki = new ArrayList<Hex>();
	ArrayList<Postac> gracz1 = new ArrayList<Postac>();
	ArrayList<Postac> gracz2 = new ArrayList<Postac>();
	Postac aktywna;
	boolean gracz = false;//false-1 true-2
	int postacie[] = {0,0};
	int punkty[] = {0,0};
	/**
	 * Konstruktor domyślny
	 */
	public FrameWalka()
	{
		super();
	}
	/**
	 * Konstruktor z postaciami
	 * 
	 * @param ArrayList<Postac> gracz1 postacie gracza 1
	 * @param ArrayList<Postac> gracz2 postacie gracza 2
	 */
	public FrameWalka(ArrayList<Postac> gracz1, ArrayList<Postac> gracz2)
	{
		super();
		this.gracz1 = gracz1;
		this.gracz2 = gracz2;
	}
	/**
	 * Funkcja zawiera układ elementów na ekranie
	 */
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		Pane hexPane = new Pane();
		ImageView iv = new ImageView();
		iv.setImage(new Image("img/temp_bg.png"));
		iv.setPreserveRatio(true);
		iv.setSmooth(true);
		iv.setLayoutX(0);
		iv.setLayoutY(0);
		iv.setFitHeight(600);
		root.getChildren().add(iv);
		for (int y = 0; y < 12; y++)
			for (int x = 0; x < 15; x++) {
				Hex hex = new Hex();
				hex.setPreserveRatio(true);
				hex.setSmooth(true);
				hex.setLayoutX(x * 49 + (y % 2) * 25);
				hex.setLayoutY(y * 42);
				hex.setFitWidth(50);
				hex.setFitHeight(57);
				hex.setPosX(x - y / 2);
				hex.setPosY(y);
				poleWalki.add(hex);
				for (Hex p : poleWalki) {
					if ((p.getPosX() == hex.getPosX() + 1 && p.getPosY() == hex.getPosY() - 1)
							|| (p.getPosX() == hex.getPosX() && p.getPosY() == hex.getPosY() - 1)
							|| (p.getPosX() == hex.getPosX() - 1 && p.getPosY() == hex.getPosY()))
						hex.dodaj(p);
				}
				hex.setOnMouseClicked(new EventHandler<MouseEvent>(){
					@Override
					public void handle(MouseEvent event) {
						if(hex.dostepny)
							Animacja1(aktywna, hex);
					}
				});
				hexPane.getChildren().add(hex);
			}
		hexPane.setLayoutX(20);
		hexPane.setLayoutY(80);
		gracz1.get(0).setPosX(0);
		gracz1.get(0).setPosY(0);
		gracz1.get(1).setPosX(-2);
		gracz1.get(1).setPosY(5);
		gracz1.get(2).setPosX(-2);
		gracz1.get(2).setPosY(10);
		gracz2.get(0).setPosX(14);
		gracz2.get(0).setPosY(0);
		gracz2.get(1).setPosX(11);
		gracz2.get(1).setPosY(5);
		gracz2.get(2).setPosX(5);
		gracz2.get(2).setPosY(10);

		for(int i = 0; i < poleWalki.size(); i++)
		{
			if(poleWalki.get(i).getPosX()==-1 && poleWalki.get(i).getPosY()==3)
			{
				poleWalki.get(i).setAktywny(false);
			}
		}
		for(int i = 0; i < gracz1.size(); i++)
		{
			gracz1.get(i).setFitHeight(57);
			gracz1.get(i).setLayoutX((int)(gracz1.get(i).getPosX()+gracz1.get(i).getPosY()/2)* 49 + (gracz1.get(i).getPosY() % 2) * 25);
			gracz1.get(i).setLayoutY(gracz1.get(i).getPosY() * 42 - gracz1.get(i).getFitWidth()-20);
			
		}
		for(int i = 0; i < gracz2.size(); i++)
		{
			gracz2.get(i).setFitHeight(57);
			gracz2.get(i).setScaleX(-1);
			gracz2.get(i).setLayoutX((int)(gracz2.get(i).getPosX()+gracz2.get(i).getPosY()/2)* 49 + (gracz2.get(i).getPosY() % 2) * 25);
			gracz2.get(i).setLayoutY(gracz2.get(i).getPosY() * 42 - gracz2.get(i).getFitWidth()-20);
			
		}
		hexPane.getChildren().addAll(gracz1);
		hexPane.getChildren().addAll(gracz2);
		root.getChildren().add(hexPane);
		Aktywuj(gracz1.get(0).getPosX(), gracz1.get(0).getPosY(), gracz1.get(0).getSzybkosc());
		Scene scene = new Scene(root, 800, 600);
		// primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
		aktywna = gracz1.get(0);
		
	}

	/**
	 * Resetuje aktywne hexy
	 */
	public void Reset()
	{
		for(int i = 0; i < poleWalki.size(); i++)
		{
			poleWalki.get(i).setAktywny(true);
			poleWalki.get(i).setDostepny(false);
		}
		for(int i = 0; i < gracz1.size(); i++)
		{
			if(poleWalki.get(i).getPosX()==gracz1.get(i).getPosX() && poleWalki.get(i).getPosY()==gracz1.get(i).getPosY())
			{
				poleWalki.get(i).setAktywny(false);
			}
		}
		for(int i = 0; i < gracz2.size(); i++)
		{
			if(poleWalki.get(i).getPosX()==-gracz2.get(i).getPosX() && poleWalki.get(i).getPosY()==gracz2.get(i).getPosY())
			{
				poleWalki.get(i).setAktywny(false);
			}
		}
	}

	/**
	 * Aktywuje hexy
	 * 
	 * @param int x pozycja x
	 * @param int y pozycja y
	 * @param int r zasięg
	 * @return void
	 */
	public void Aktywuj(int x, int y, int r)
	{
		Hex temp = null;
		ArrayList<Hex> dostepne = new ArrayList<Hex>();
		for(int i = 0; i < poleWalki.size(); i++)
		{
			if(poleWalki.get(i).getPosX()==x && poleWalki.get(i).getPosY()==y)
			{
				temp = poleWalki.get(i);
			}
		}
		dostepne.add(temp);
		for(int i = 0; i < r; i++)
		{
			ArrayList<Hex> t = dostepne;
			ArrayList<Hex> t2 = new ArrayList<Hex>();
			for(int j = 0; j < t.size(); j++)
			{
				if(t.get(j).isAktywny())
					t2.addAll(t.get(j).Polaczenia());
			}
			dostepne.addAll(t2);
		}
		for(int i = 0; i < dostepne.size(); i++)
		{
			dostepne.get(i).setDostepny(true);
		}
		//animateUsingScaleTransition(temp);
	}

	/**
	 * Animacja postaci (zwęrzanie)
	 * 
	 * @param Postac p Postać do animacji
	 * @param Hex h Hex docelowy
	 * @return void
	 */
	private void Animacja1(Postac p,Hex h) {
        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(.5f), p);
        if(gracz)
        	scaleTransition.setFromX(-1);
        else
        	scaleTransition.setFromX(1);
        scaleTransition.setFromY(1);
        scaleTransition.setFromZ(1);
        scaleTransition.setToX(0);
        scaleTransition.setToY(1);
        scaleTransition.setToZ(1);
        scaleTransition.setCycleCount(1);
        scaleTransition.play();
        scaleTransition.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                p.setPosX(h.getPosX());
                p.setPosY(h.getPosY());
    			p.setLayoutX((int)(p.getPosX()+p.getPosY()/2)* 49 + (p.getPosY() % 2) * 25);
    			p.setLayoutY(p.getPosY() * 42-p.getFitWidth()-20);
                Animacja2(p);
            }
        });
    }
	/**
	 * Animacja postaci (rozszerzanie)
	 * 
	 * @param Postac p Postać do animacji
	 * @return void
	 */
	private void Animacja2(Postac p) {
        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(.5f), p);
        scaleTransition.setFromX(0);
        scaleTransition.setFromY(1);
        scaleTransition.setFromZ(1);
        if(gracz)
        	scaleTransition.setFromX(-1);
        else
        	scaleTransition.setFromX(1);
        scaleTransition.setToY(1);
        scaleTransition.setToZ(1);
        scaleTransition.setCycleCount(1);
        scaleTransition.play();
        scaleTransition.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if(gracz)
                	if(postacie[1] < gracz2.size()-1)
                		postacie[1]++;
                	else
                		postacie[1]=0;
                else
                	if(postacie[0] < gracz1.size()-1)
                		postacie[0]++;
                	else
                		postacie[0]=0;
                gracz = !gracz;
                aktywna = gracz?gracz2.get(postacie[1]):gracz1.get(postacie[0]);
                Reset();
                Aktywuj(aktywna.getPosX(), aktywna.getPosY(), aktywna.getSzybkosc());
            }
        });
    }
}
