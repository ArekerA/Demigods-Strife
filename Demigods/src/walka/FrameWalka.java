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

public class FrameWalka extends Application {
	ArrayList<Hex> poleWalki = new ArrayList<Hex>();
	ArrayList<Postac> gracz1 = new ArrayList<Postac>();
	ArrayList<Postac> gracz2 = new ArrayList<Postac>();
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
				hexPane.getChildren().add(hex);
			}
		hexPane.setLayoutX(20);
		hexPane.setLayoutY(80);
		root.getChildren().add(hexPane);
		gracz1.get(0).setPosX(0);
		gracz1.get(0).setPosY(0);
		gracz1.get(1).setPosX(0);
		gracz1.get(1).setPosY(3);
		gracz2.get(0).setPosX(14);
		gracz2.get(0).setPosY(0);
		gracz2.get(1).setPosX(14);
		gracz2.get(1).setPosY(5);

		for(int i = 0; i < poleWalki.size(); i++)
		{
			if(poleWalki.get(i).getPosX()==-1 && poleWalki.get(i).getPosY()==3)
			{
				poleWalki.get(i).setAktywny(false);
			}
		}
		
		gracz1.get(0).setFitHeight(100);
		gracz1.get(1).setFitHeight(100);
		gracz2.get(0).setFitHeight(100);
		gracz2.get(1).setFitHeight(100);
		for(int i = 0; i < gracz1.size(); i++)
		{
			gracz1.get(i).setLayoutX(gracz1.get(i).getPosX()* 49 + (gracz1.get(i).getPosY() % 2) * 25);
			gracz1.get(i).setLayoutY(gracz1.get(i).getPosY() * 42 - 70);
		}
		for(int i = 0; i < gracz2.size(); i++)
		{
			gracz2.get(i).setScaleX(-1);
			gracz2.get(i).setLayoutX(gracz2.get(i).getPosX()* 49 + (gracz2.get(i).getPosY() % 2) * 25);
			gracz2.get(i).setLayoutY(gracz2.get(i).getPosY() * 42 - 70);
		}
		

		Aktywuj(gracz1.get(0).getPosX(), gracz1.get(0).getPosY(), gracz1.get(0).getSzybkosc());
		hexPane.getChildren().add(gracz1.get(0));
		hexPane.getChildren().add(gracz1.get(1));
		hexPane.getChildren().add(gracz2.get(0));
		hexPane.getChildren().add(gracz2.get(1));
		Scene scene = new Scene(root, 800, 600);
		// primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
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
	/*private void animateUsingScaleTransition(ImageView heart) {
        ScaleTransition scaleTransition = new ScaleTransition(
                Duration.seconds(1), heart
            );
            scaleTransition.setFromX(1);
            scaleTransition.setFromY(1);
            scaleTransition.setFromZ(1);
            scaleTransition.setToX(0);
            scaleTransition.setToY(0);
            scaleTransition.setToZ(0);
            scaleTransition.setCycleCount(1);
            scaleTransition.play();
        }*/
}
