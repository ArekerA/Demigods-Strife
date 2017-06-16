package kreator;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import dane.Dane;
import interfejs.Ramka;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import walka.FrameWalka;

public class OknoKreatora extends Ramka {
	
	static ArrayList<Postac> gracz1 = new ArrayList<Postac>();
	static ArrayList<Postac> gracz2 = new ArrayList<Postac>();
	@Override
	public void start(Stage primaryStage) {
		
		

		Image Obraz = new Image("img/tło.png");

		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		Button btn5 = new Button();
		Button btn6 = new Button();
		Button btn7 = new Button();
		Button btn8 = new Button();
		Button btn9 = new Button();
		Button btn10 = new Button();
		Button btn11 = new Button();
		Button btn12 = new Button();
		Button btn13 = new Button();
		Button btn14 = new Button();
		Button btn15 = new Button();
		Button btn16 = new Button();
		Button btn17 = new Button();
		Button btn18 = new Button();
		Button btn19 = new Button();
		Button btn20 = new Button();
		Button btn21 = new Button();

		Text text1 = new Text();
		Text text2 = new Text();
		Text text3 = new Text();
		Text text4 = new Text();

		TextArea textarea1 = new TextArea();
		TextArea textarea2 = new TextArea();

		Rectangle rect1 = new Rectangle(320, 50, 200, 200);
		Rectangle rect2 = new Rectangle(320, 310, 200, 200);

		text1.setLayoutX(20);
		text1.setLayoutY(20);
		text1.setStyle("-fx-font: 25 arial; -fx-base: #b6e7c9;");

		text2.setLayoutX(20);
		text2.setLayoutY(280);
		text2.setStyle("-fx-font: 25 arial; -fx-base: #b6e7c9;");

		text3.setLayoutX(320);
		text3.setLayoutY(20);
		text3.setStyle("-fx-font: 25 arial; -fx-base: #b6e7c9;");

		text4.setLayoutX(320);
		text4.setLayoutY(280);
		text4.setStyle("-fx-font: 25 arial; -fx-base: #b6e7c9;");

		btn1.setText("Losowa Drużyna");
		btn1.setLayoutX(20);
		btn1.setLayoutY(50);
		btn1.setPrefWidth(200);
		btn1.setPrefHeight(50);
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {

					//OknoKreatora.dodajp(primaryStage);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btn2.setText("Wczytaj Drużynę");
		btn2.setLayoutX(20);
		btn2.setLayoutY(120);
		btn2.setPrefWidth(200);
		btn2.setPrefHeight(50);
		btn3.setText("Zapisz Drużynę");
		btn3.setLayoutX(20);
		btn3.setLayoutY(190);
		btn3.setPrefWidth(200);
		btn3.setPrefHeight(50);
		btn4.setText("Losowa Drużyna");
		btn4.setLayoutX(20);
		btn4.setLayoutY(310);
		btn4.setPrefWidth(200);
		btn4.setPrefHeight(50);
		btn5.setText("Wczytaj Drużynę");
		btn5.setLayoutX(20);
		btn5.setLayoutY(380);
		btn5.setPrefWidth(200);
		btn5.setPrefHeight(50);
		btn6.setText("Zapisz Drużynę");
		btn6.setLayoutX(20);
		btn6.setLayoutY(450);
		btn6.setPrefWidth(200);
		btn6.setPrefHeight(50);
		btn7.setText("Powrót");
		btn7.setLayoutX(20);
		btn7.setLayoutY(530);
		btn7.setPrefWidth(150);
		btn7.setPrefHeight(35);
		btn8.setText("Graj...");
		btn8.setLayoutX(630);
		btn8.setLayoutY(530);
		btn8.setPrefWidth(150);
		btn8.setPrefHeight(35);
		btn9.setText("Losuj Postać");
		btn9.setLayoutX(550);
		btn9.setLayoutY(60);
		btn9.setPrefWidth(90);
		btn9.setPrefHeight(40);
		btn10.setText("Edytuj Postać");
		btn10.setLayoutX(660);
		btn10.setLayoutY(60);
		btn10.setPrefWidth(90);
		btn10.setPrefHeight(40);
		btn11.setText("Losuj Postać");
		btn11.setLayoutX(550);
		btn11.setLayoutY(200);
		btn11.setPrefWidth(90);
		btn11.setPrefHeight(40);
		btn12.setText("Edytuj Postać");
		btn12.setLayoutX(660);
		btn12.setLayoutY(200);
		btn12.setPrefWidth(90);
		btn12.setPrefHeight(40);
		btn13.setText("Losuj Postać");
		btn13.setLayoutX(550);
		btn13.setLayoutY(130);
		btn13.setPrefWidth(90);
		btn13.setPrefHeight(40);
		btn14.setText("Edytuj Postać");
		btn14.setLayoutX(660);
		btn14.setLayoutY(130);
		btn14.setPrefWidth(90);
		btn14.setPrefHeight(40);
		btn15.setText("Losuj Postać");
		btn15.setLayoutX(550);
		btn15.setLayoutY(320);
		btn15.setPrefWidth(90);
		btn15.setPrefHeight(40);
		btn16.setText("Edytuj Postać");
		btn16.setLayoutX(660);
		btn16.setLayoutY(320);
		btn16.setPrefWidth(90);
		btn16.setPrefHeight(40);
		btn17.setText("Losuj Postać");
		btn17.setLayoutX(550);
		btn17.setLayoutY(460);
		btn17.setPrefWidth(90);
		btn17.setPrefHeight(40);
		btn19.setText("Edytuj Postać");
		btn19.setLayoutX(660);
		btn19.setLayoutY(460);
		btn19.setPrefWidth(90);
		btn19.setPrefHeight(40);
		btn20.setText("Losuj Postać");
		btn20.setLayoutX(550);
		btn20.setLayoutY(390);
		btn20.setPrefWidth(90);
		btn20.setPrefHeight(40);
		btn21.setText("Edytuj Postać");
		btn21.setLayoutX(660);
		btn21.setLayoutY(390);
		btn21.setPrefWidth(90);
		btn21.setPrefHeight(40);

		text1.setText("Gracz 1:");
		text2.setText("Gracz 2:");
		text3.setText("Nazwa Drużyny:");
		text4.setText("Nazwa Drużyny:");
		textarea1.setLayoutX(550);
		textarea1.setLayoutY(0);
		textarea1.setPrefWidth(200);
		textarea1.setPrefHeight(20);
		textarea2.setLayoutX(550);
		textarea2.setLayoutY(260);
		textarea2.setPrefWidth(200);
		textarea2.setPrefHeight(20);

		ImageView iv1 = new ImageView();
		iv1.setImage(Obraz);
		iv1.setPreserveRatio(true);
		iv1.setSmooth(true);

		HBox box = new HBox();
		box.getChildren().add(iv1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		ChoiceBox cb1 = new ChoiceBox(FXCollections.observableArrayList(Dane.odczyt()));
		cb1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue ov, Number value, Number new_value) {
				gracz1.add(Dane.odczytp(new_value.intValue()));				
			}
		});

		cb1.setLayoutX(150);
		cb1.setLayoutY(160);
		cb1.setPrefWidth(200);
		cb1.setPrefHeight(40);
		
		
		
		

		Pane root = new Pane();
		
		root.getChildren().add(box);
		root.getChildren().add(btn1);
		root.getChildren().add(text1);
		root.getChildren().add(btn2);
		root.getChildren().add(btn3);
		root.getChildren().add(btn4);
		root.getChildren().add(text2);
		root.getChildren().add(btn5);

		root.getChildren().add(btn6);
		root.getChildren().add(btn7);
		root.getChildren().add(btn8);
		root.getChildren().add(btn9);
		root.getChildren().add(btn10);
		root.getChildren().add(btn11);
		root.getChildren().add(btn12);
		root.getChildren().add(btn13);
		root.getChildren().add(btn14);
		root.getChildren().add(btn15);
		root.getChildren().add(btn16);
		root.getChildren().add(btn17);
		root.getChildren().add(btn18);
		root.getChildren().add(btn19);
		root.getChildren().add(btn20);
		root.getChildren().add(btn21);
		root.getChildren().add(text3);
		root.getChildren().add(text4);
		root.getChildren().add(textarea1);
		root.getChildren().add(textarea2);
		root.getChildren().add(rect1);
		root.getChildren().add(rect2);
		root.getChildren().add(cb1);
		
	

		Scene scene = new Scene(root, 800, 600);

		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
		btn10.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					OknoKreatora.TworzeniePostaci(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	
	/*static void dodajp(Stage primaryStage) {
		Pane root = new Pane();
		Scene scene = new Scene(root, 800, 600);
		Image Obraz = new Image("img/tło.png");
		ImageView iv1 = new ImageView();
		iv1.setImage(Obraz);
		iv1.setPreserveRatio(true);
		iv1.setSmooth(true);
		

		ChoiceBox cb1 = new ChoiceBox(FXCollections.observableArrayList(Dane.odczyt()));
		cb1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue ov, Number value, Number new_value) {
				gracz1.add(Dane.odczytp(new_value.intValue()));
				Postac postac=Dane.odczytp(new_value.intValue());
			}
		});

		cb1.setLayoutX(150);
		cb1.setLayoutY(160);
		cb1.setPrefWidth(200);
		cb1.setPrefHeight(40);

		Text text1 = new Text();
		text1.setLayoutX(300);
		text1.setLayoutY(40);
		text1.setStyle("-fx-font: 30 verdana; -fx-base: #b6e7c9;");
		text1.setText("Podsumowanie");

		Button powrot = new Button();
		powrot.setText("Powrot");
		powrot.setLayoutX(20);
		powrot.setLayoutY(530);
		powrot.setPrefWidth(90);
		powrot.setPrefHeight(40);
		powrot.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					OknoKreatora.WyborBroni(postac, primaryStage);
					}
					
					catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Button dalej = new Button();
		if (gracz1.size()<1)
		dalej.setText("Gracz 1 - Zapisz");
		else if (gracz2.size()<1)
		dalej.setText("Gracz 2 - Zapisz");
		else
		dalej.setText("Graj");
		dalej.setLayoutX(270);
		dalej.setLayoutY(530);
		dalej.setPrefWidth(90);
		dalej.setPrefHeight(40);
		dalej.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					if (gracz1.size()<2)
					{
						gracz1.add(postac);
						Dane.dodaj(postac);
						OknoKreatora.TworzeniePostaci(primaryStage);
						
					}
						else if(gracz2.size()<2)
					{
						gracz2.add(postac);
						Dane.dodaj(postac);
						OknoKreatora.TworzeniePostaci(primaryStage);
					}
					else
					{
					FrameWalka walka=new FrameWalka(gracz1, gracz2);
					walka.start(primaryStage);
					}
					} 
					catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		ImageView iv2 = new ImageView();
		
		Image czlmiecz1 = new Image("img/czł-woj-miecz1.png");
		Image czlmiecz2 = new Image("img/czł-woj-miecz2.png");
		Image czlmiecz3 = new Image("img/czł-woj-miecz3.png");
		
		Image czltopor1 = new Image("img/czł-woj-topor1.png");
		Image czltopor2 = new Image("img/czł-woj-topor2.png");
		Image czltopor3 = new Image("img/czł-woj-topor3.png");
		
		Image czlluk1 = new Image("img/cz strzelec-łuk1.png");
		Image czlluk2 = new Image("img/cz strzelec-łuk2.png");
		Image czlluk3 = new Image("img/cz strzelec-łuk3.png");

		Image czlkusza1 = new Image("img/cz strzelec-łuk4.png");
		Image czlkusza2 = new Image("img/cz strzelec-łuk5.png");
		Image czlkusza3 = new Image("img/cz strzelec-łuk6.png");

		Image czlkostur1 = new Image("img/czł-mag-kostur1.png");
		Image czlkostur2 = new Image("img/czł-mag-kostur2.png");
		Image czlkostur3 = new Image("img/czł-mag-kostur3.png");

		Image czlwend1 = new Image("img/czł-mag-wend1.png");
		Image czlwend2= new Image("img/czł-mag-wend2.png");
		Image czlwend3 = new Image("img/czł-mag-wend3.png");
		
		Image orkmiecz1 = new Image("img/czł-woj-miecz1.png");
		Image orkmiecz2 = new Image("img/czł-woj-miecz2.png");
		Image orkmiecz3 = new Image("img/czł-woj-miecz3.png");
		
		Image orktopor1 = new Image("img/czł-woj-topor1.png");
		Image orktopor2 = new Image("img/czł-woj-topor2.png");
		Image orktopor3 = new Image("img/czł-woj-topor3.png");
		
		Image orkluk1 = new Image("img/ork strzelec-łuk1.png");
		Image orkluk2 = new Image("img/ork strzelec-łuk2.png");
		Image orkluk3 = new Image("img/ork strzelec-łuk3.png");

		Image orkkusza1 = new Image("img/ork strzelec-łuk4.png");
		Image orkkusza2 = new Image("img/ork strzelec-łuk5.png");
		Image orkkusza3 = new Image("img/ork strzelec-łuk6.png");

		Image orkkostur1 = new Image("img/ork-mag-kostur1.png");
		Image orkkostur2 = new Image("img/ork-mag-kostur2.png");
		Image orkkostur3 = new Image("img/ork-mag-kostur3.png");

		Image orkwend1 = new Image("img/ork-mag-wend1.png");
		Image orkwend2= new Image("img/ork-mag-wend2.png");
		Image orkwend3 = new Image("img/ork-mag-wend3.png");
		
		Image elfmiecz1 = new Image("img/elf-woj-miecz1.png");
		Image elfmiecz2 = new Image("img/elf-woj-miecz2.png");
		Image elfmiecz3 = new Image("img/elf-woj-miecz3.png");
		
		Image elftopor1 = new Image("img/elf-woj-topor1.png");
		Image elftopor2 = new Image("img/elf-woj-topor2.png");
		Image elftopor3 = new Image("img/elf-woj-topor3.png");
		
		Image elfluk1 = new Image("img/elf-strzelec-łuk1.png");
		Image elfluk2 = new Image("img/elf-strzelec-łuk2.png");
		Image elfluk3 = new Image("img/elf-strzelec-łuk3.png");

		Image elfkusza1 = new Image("img/elf-strzelec-łuk4.png");
		Image elfkusza2 = new Image("img/elf-strzelec-łuk5.png");
		Image elfkusza3 = new Image("img/elf-strzelec-łuk6.png");

		Image elfkostur1 = new Image("img/elf-mag-kostur1.png");
		Image elfkostur2 = new Image("img/elf-mag-kostur2.png");
		Image elfkostur3 = new Image("img/elf-mag-kostur3.png");

		Image elfwend1 = new Image("img/elf-mag-wend1.png");
		Image elfwend2= new Image("img/elf-mag-wend2.png");
		Image elfwend3 = new Image("img/elf-mag-wend3.png");



	    if(postac.getRasa()=="Człowiek")
			{
				if(przedmiot.getNazwa()=="Wampirze Gardło")
				{
				//textarea3.setText("Z każdą kolejna kroplą, stajesz się silniejszy...");
				iv2.setImage(czlmiecz1);
				postac.Grafika(czlmiecz1);
				}
				else if(przedmiot.getNazwa()=="Zapomniane Ostrze")
				{
				//textarea3.setText("Nikt nie pamięta jego historii, ale każdy może poznać jego siłę...");
				iv2.setImage(czlmiecz2);
				postac.Grafika(czlmiecz2);
				}
				else if(przedmiot.getNazwa()=="Promień Nadziei")
				{
				//textarea3.setText("Tym razem to ty umrzesz ostatni...");
				iv2.setImage(czlmiecz3);
				postac.Grafika(czlmiecz3);
				}
				else if(przedmiot.getNazwa()=="Młot Grabarza")
				{
				//textarea3.setText("Następny cios jest gwoździem do trumny...");
				iv2.setImage(czltopor1);
				postac.Grafika(czltopor1);
				}
				else if(przedmiot.getNazwa()=="Sekator")
				{
				//textarea3.setText("Nie daj się zwieść...");
				iv2.setImage(czltopor2);
				postac.Grafika(czltopor2);
				}
				else if(przedmiot.getNazwa()=="Bukiet Strachu")
				{
				//textarea3.setText("Dobry prezent na każdą okazję..");
				iv2.setImage(czltopor3);
				postac.Grafika(czltopor3);
				}
				else if(przedmiot.getNazwa()=="Ostatnie Życzenie")
				{
				//textarea3.setText("Wypowiedz szybko...");
				iv2.setImage(czlluk1);
				postac.Grafika(czlluk1);
				}
				else if(przedmiot.getNazwa()=="Mantra")
				{
				//textarea3.setText("Powtarzaj do skutku...");
				iv2.setImage(czlluk2);
				postac.Grafika(czlluk2);
				}
				else if(przedmiot.getNazwa()=="Czwarty Muszkieter")
				{
				//textarea3.setText("Jednym na wszystkich...");
				iv2.setImage(czlluk3);
				postac.Grafika(czlluk3);
				}
				else if(przedmiot.getNazwa()=="Gałąź Wisielca")
				{
				//textarea3.setText("Podobno okrywa ją klątwa...");
				iv2.setImage(czlkusza1);
				postac.Grafika(czlkusza1);
				}
				else if(przedmiot.getNazwa()=="Magiczne Ustrojstwo")
				{
				//textarea3.setText("Obsługa do końca nie jest bezpieczna...");
				iv2.setImage(czlkusza2);
				postac.Grafika(czlkusza2);
				}
				else if(przedmiot.getNazwa()=="Dar Losu")
				{
				//textarea3.setText("Kto nie strzela, ten nie trafia...");
				iv2.setImage(czlkusza3);
				postac.Grafika(czlkusza3);
				}
				else if(przedmiot.getNazwa()=="Pierwsza Dama")
				{
				//textarea3.setText("Jej życzenie może stać się rozkazem...");
				iv2.setImage(czlwend1);
				postac.Grafika(czlwend1);
				}
				else if(przedmiot.getNazwa()=="Wdowa")
				{
				//textarea3.setText("Bo to zła kobieta była...");
				iv2.setImage(czlwend2);
				postac.Grafika(czlwend2);
				}
				else if(przedmiot.getNazwa()=="Morowa Dziewica")
				{
				//textarea3.setText("Od powietrza, głodu, ognia i wojny...");
				iv2.setImage(czlwend3);
				postac.Grafika(czlwend3);
				}
				else if(przedmiot.getNazwa()=="Konar Potencjału")
				{
				//textarea3.setText("Legenda głosi, że kiedyś zapłonie...");
				iv2.setImage(czlkostur1);
				postac.Grafika(czlkostur1);
				}
				else if(przedmiot.getNazwa()=="Kostur Zaparcia")
				{
				//textarea3.setText("W kupie siła...");
				iv2.setImage(czlkostur2);
				postac.Grafika(czlkostur2);
				}
				else if(przedmiot.getNazwa()=="Noga Enta")
				{
				//textarea3.setText("Szybciej! Szybciej!");
				iv2.setImage(czlkostur3);
				postac.Grafika(czlkostur3);
				}
			}
			else if(postac.getRasa()=="Ork")
			{
				if(przedmiot.getNazwa()=="Wampirze Gardło")
				{
				//textarea3.setText("Z każdą kolejna kroplą, stajesz się silniejszy...");
				iv2.setImage(orkmiecz1);
				postac.Grafika(orkmiecz1);
				}
				else if(przedmiot.getNazwa()=="Zapomniane Ostrze")
				{
				//textarea3.setText("Nikt nie pamięta jego historii, ale każdy może poznać jego siłę...");
				iv2.setImage(orkmiecz2);
				postac.Grafika(orkmiecz2);
				}
				else if(przedmiot.getNazwa()=="Promień Nadziei")
				{
				//textarea3.setText("Tym razem to ty umrzesz ostatni...");
				iv2.setImage(orkmiecz3);
				postac.Grafika(orkmiecz3);
				}
				else if(przedmiot.getNazwa()=="Młot Grabarza")
				{
				//textarea3.setText("Następny cios jest gwoździem do trumny...");
				iv2.setImage(orktopor1);
				postac.Grafika(orktopor1);
				}
				else if(przedmiot.getNazwa()=="Sekator")
				{
				//textarea3.setText("Nie daj się zwieść...");
				iv2.setImage(orktopor2);
				postac.Grafika(orktopor2);
				}
				else if(przedmiot.getNazwa()=="Bukiet Strachu")
				{
				//textarea3.setText("Dobry prezent na każdą okazję..");
				iv2.setImage(orktopor3);
				postac.Grafika(orktopor3);
				}
				else if(przedmiot.getNazwa()=="Ostatnie Życzenie")
				{
				//textarea3.setText("Wypowiedz szybko...");
				iv2.setImage(orkluk1);
				postac.Grafika(orkluk1);
				}
				else if(przedmiot.getNazwa()=="Mantra")
				{
				//textarea3.setText("Powtarzaj do skutku...");
				iv2.setImage(orkluk2);
				postac.Grafika(orkluk2);
				}
				else if(przedmiot.getNazwa()=="Czwarty Muszkieter")
				{
				//textarea3.setText("Jednym na wszystkich...");
				iv2.setImage(orkluk3);
				postac.Grafika(orkluk3);
				}
				else if(przedmiot.getNazwa()=="Gałąź Wisielca")
				{
				//textarea3.setText("Podobno okrywa ją klątwa...");
				iv2.setImage(orkkusza1);
				postac.Grafika(orkkusza1);
				}
				else if(przedmiot.getNazwa()=="Magiczne Ustrojstwo")
				{
				//textarea3.setText("Obsługa do końca nie jest bezpieczna...");
				iv2.setImage(orkkusza2);
				postac.Grafika(orkkusza2);
				}
				else if(przedmiot.getNazwa()=="Dar Losu")
				{
				//textarea3.setText("Kto nie strzela, ten nie trafia...");
				iv2.setImage(orkkusza3);
				postac.Grafika(orkkusza3);
				}
				else if(przedmiot.getNazwa()=="Pierwsza Dama")
				{
				//textarea3.setText("Jej życzenie może stać się rozkazem...");
				iv2.setImage(orkwend1);
				postac.Grafika(orkwend1);
				}
				else if(przedmiot.getNazwa()=="Wdowa")
				{
				//textarea3.setText("Bo to zła kobieta była...");
				iv2.setImage(orkwend2);
				postac.Grafika(orkwend2);
				}
				else if(przedmiot.getNazwa()=="Morowa Dziewica")
				{
				//textarea3.setText("Od powietrza, głodu, ognia i wojny...");
				iv2.setImage(orkwend3);
				postac.Grafika(orkwend3);
				}
				else if(przedmiot.getNazwa()=="Konar Potencjału")
				{
				//textarea3.setText("Legenda głosi, że kiedyś zapłonie...");
				iv2.setImage(orkkostur1);
				postac.Grafika(orkkostur1);
				}
				else if(przedmiot.getNazwa()=="Kostur Zaparcia")
				{
				//textarea3.setText("W kupie siła...");
				iv2.setImage(orkkostur2);
				postac.Grafika(orkkostur2);
				}
				else if(przedmiot.getNazwa()=="Noga Enta")
				{
				//textarea3.setText("Szybciej! Szybciej!");
				iv2.setImage(orkkostur3);
				postac.Grafika(orkkostur3);
				}
			}
			else
			{
				if(przedmiot.getNazwa()=="Wampirze Gardło")
				{
				//textarea3.setText("Z każdą kolejna kroplą, stajesz się silniejszy...");
				iv2.setImage(elfmiecz1);
				postac.Grafika(elfmiecz1);
				}
				else if(przedmiot.getNazwa()=="Zapomniane Ostrze")
				{
				//textarea3.setText("Nikt nie pamięta jego historii, ale każdy może poznać jego siłę...");
				iv2.setImage(elfmiecz2);
				postac.Grafika(elfmiecz2);
				}
				else if(przedmiot.getNazwa()=="Promień Nadziei")
				{
				//textarea3.setText("Tym razem to ty umrzesz ostatni...");
				iv2.setImage(elfmiecz3);
				postac.Grafika(elfmiecz3);
				}
				else if(przedmiot.getNazwa()=="Młot Grabarza")
				{
				//textarea3.setText("Następny cios jest gwoździem do trumny...");
				iv2.setImage(elftopor1);
				postac.Grafika(elftopor1);
				}
				else if(przedmiot.getNazwa()=="Sekator")
				{
				//textarea3.setText("Nie daj się zwieść...");
				iv2.setImage(elftopor2);
				postac.Grafika(elftopor2);
				}
				else if(przedmiot.getNazwa()=="Bukiet Strachu")
				{
				//textarea3.setText("Dobry prezent na każdą okazję..");
				iv2.setImage(elftopor3);
				postac.Grafika(elftopor3);
				}
				else if(przedmiot.getNazwa()=="Ostatnie Życzenie")
				{
				//textarea3.setText("Wypowiedz szybko...");
				iv2.setImage(elfluk1);
				postac.Grafika(elfluk1);
				}
				else if(przedmiot.getNazwa()=="Mantra")
				{
				//textarea3.setText("Powtarzaj do skutku...");
				iv2.setImage(elfluk2);
				postac.Grafika(elfluk2);
				}
				else if(przedmiot.getNazwa()=="Czwarty Muszkieter")
				{
				//textarea3.setText("Jednym na wszystkich...");
				iv2.setImage(elfluk3);
				postac.Grafika(elfluk2);
				}
				else if(przedmiot.getNazwa()=="Gałąź Wisielca")
				{
				//textarea3.setText("Podobno okrywa ją klątwa...");
				iv2.setImage(elfkusza1);
				postac.Grafika(elfkusza1);
				}
				else if(przedmiot.getNazwa()=="Magiczne Ustrojstwo")
				{
				//textarea3.setText("Obsługa do końca nie jest bezpieczna...");
				iv2.setImage(elfkusza2);
				postac.Grafika(elfkusza2);
				}
				else if(przedmiot.getNazwa()=="Dar Losu")
				{
				//textarea3.setText("Kto nie strzela, ten nie trafia...");
				iv2.setImage(elfkusza3);
				postac.Grafika(elfkusza3);
				}
				else if(przedmiot.getNazwa()=="Pierwsza Dama")
				{
				//textarea3.setText("Jej życzenie może stać się rozkazem...");
				iv2.setImage(elfwend1);
				postac.Grafika(elfwend1);
				}
				else if(przedmiot.getNazwa()=="Wdowa")
				{
				//textarea3.setText("Bo to zła kobieta była...");
				iv2.setImage(elfwend2);
				postac.Grafika(elfwend2);
				}
				else if(przedmiot.getNazwa()=="Morowa Dziewica")
				{
				//textarea3.setText("Od powietrza, głodu, ognia i wojny...");
				iv2.setImage(elfwend3);
				postac.Grafika(elfwend3);
				}
				else if(przedmiot.getNazwa()=="Konar Potencjału")
				{
				//textarea3.setText("Legenda głosi, że kiedyś zapłonie...");
				iv2.setImage(elfkostur1);
				postac.Grafika(elfkostur1);
				}
				else if(przedmiot.getNazwa()=="Kostur Zaparcia")
				{
				//textarea3.setText("W kupie siła...");
				iv2.setImage(elfkostur2);
				postac.Grafika(elfkostur2);
				}
				else if(przedmiot.getNazwa()=="Noga Enta")
				{
				//textarea3.setText("Szybciej! Szybciej!");
				iv2.setImage(elfkostur3);
				postac.Grafika(elfkostur3);
				}
			}
		iv2.setPreserveRatio(true);
		iv2.setSmooth(true);
		iv2.setFitHeight(500);
		iv2.setFitWidth(200);
		iv2.setLayoutX(550);
		iv2.setLayoutY(100);
		
		TextArea textarea3 = new TextArea();
		textarea3.setLayoutX(20);
		textarea3.setLayoutY(90);
		textarea3.setPrefWidth(340);
		textarea3.setPrefHeight(380);
		textarea3.setStyle("-fx-font: 30 verdana; -fx-base: #b6e7c9;");
		//textarea3.setText("Imię:  \t"+ postac.nazwa + "\nRasa:  \t" + postac.rasa + "\nKlasa:  \t" + postac.klasa + "\nPrzedmiot:" + przedmiot.rodzaj + "\nNazwa:\t"
		//		+ przedmiot.nazwa);

		root.getChildren().add(iv1);
		root.getChildren().add(text1);
		root.getChildren().add(textarea3);
		root.getChildren().add(powrot);
		root.getChildren().add(dalej);
		root.getChildren().add(iv2);
		root.getChildren().add(cb1);


		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
			
	}
	*/

	static Postac TworzeniePostaci(Stage primaryStage) throws FileNotFoundException {
		Postac postac = new Postac();
		Pane root = new Pane();
		Scene scene = new Scene(root, 800, 600);
		Image Obraz = new Image("img/tło.png");
		Text text1 = new Text();
		text1.setLayoutX(300);
		text1.setLayoutY(40);
		text1.setStyle("-fx-font: 30 verdana; -fx-base: #b6e7c9;");
		text1.setText("Tworzenie Postaci");
		Text text2 = new Text();
		text2.setLayoutX(20);
		text2.setLayoutY(85);
		text2.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
		text2.setText("Imie:");
		Text text3 = new Text();
		text3.setLayoutX(20);
		text3.setLayoutY(185);
		text3.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
		text3.setText("Rasa:");
		Text text4 = new Text();
		text4.setLayoutX(20);
		text4.setLayoutY(285);
		text4.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
		text4.setText("Klasa:");
		TextArea textarea1 = new TextArea();
		textarea1.setLayoutX(150);
		textarea1.setLayoutY(60);
		textarea1.setPrefWidth(200);
		textarea1.setPrefHeight(20);
		
		

		ChoiceBox cb1 = new ChoiceBox(FXCollections.observableArrayList("Człowiek", "Elf", "Ork"));
		cb1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue ov, Number value, Number new_value) {
				postac.rasa = Postac.rasy[new_value.intValue()];
			}
		});

		cb1.setLayoutX(150);
		cb1.setLayoutY(160);
		cb1.setPrefWidth(200);
		cb1.setPrefHeight(40);
		ChoiceBox cb2 = new ChoiceBox(FXCollections.observableArrayList("Wojownik", "Łucznik", "Mag"));
		cb2.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue ov, Number value, Number new_value) {
				postac.klasa = Postac.klasy[new_value.intValue()];
			}
		});
		Button zatwierdz = new Button();
		zatwierdz.setText("Zatwierdź");
		zatwierdz.setLayoutX(20);
		zatwierdz.setLayoutY(480);
		zatwierdz.setPrefWidth(90);
		zatwierdz.setPrefHeight(40);

		Button powrot = new Button();
		powrot.setText("Powrót");
		powrot.setLayoutX(20);
		powrot.setLayoutY(530);
		powrot.setPrefWidth(90);
		powrot.setPrefHeight(40);

		Button dalej = new Button();
		dalej.setText("Dalej");
		dalej.setLayoutX(270);
		dalej.setLayoutY(530);
		dalej.setPrefWidth(90);
		dalej.setPrefHeight(40);

		cb2.setLayoutX(150);
		cb2.setLayoutY(260);
		cb2.setPrefWidth(200);
		cb2.setPrefHeight(40);
		ImageView iv1 = new ImageView();
		iv1.setImage(Obraz);
		iv1.setPreserveRatio(true);
		iv1.setSmooth(true);

		TextArea textarea3 = new TextArea();
		textarea3.setLayoutX(20);
		textarea3.setLayoutY(320);
		textarea3.setPrefWidth(340);
		textarea3.setPrefHeight(150);
		textarea3.setText("Opis...");

		HBox box = new HBox();
		box.getChildren().add(iv1);
		Image orkwoj = new Image("img/ork-woj.png");
		Image orklucz = new Image("img/ork-strzelec.png");
		Image orkmag = new Image("img/ork-mag.png");
		Image czlwoj = new Image("img/czł-woj.png");
		Image czllucz = new Image("img/czł-strzelec.png");
		Image czlmag = new Image("img/czł-mag.png");
		Image elfwoj = new Image("img/elf-woj.png");
		Image elflucz = new Image("img/elf-strzelec.png");
		Image elfmag = new Image("img/elf-mag.jpg");
		HBox box1 = new HBox();
		zatwierdz.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					ImageView iv2 = new ImageView();
					iv2.setPreserveRatio(true);
					iv2.setSmooth(true);
					iv2.setFitHeight(450);
					iv2.setFitWidth(250);
					iv2.setLayoutX(500);
					iv2.setLayoutY(75);
					iv2.setImage(orkwoj);

					if (postac.rasa == "Ork" && postac.klasa == "Wojownik") {
						iv2.setImage(orkwoj);
						postac.setAtak(postac.getAtak() + 3);
						postac.setObrona(postac.getObrona() + 3);
					} else if (postac.rasa == "Ork" && postac.klasa == "Łucznik") {
						iv2.setImage(orklucz);
						postac.setSzybkosc(postac.getSzybkosc() + 3);
						postac.setObrona(postac.getObrona() + 3);
					} else if (postac.rasa == "Ork" && postac.klasa == "Mag") {
						iv2.setImage(orkmag);
						postac.setMana(postac.getMana() + 3);
						postac.setObrona(postac.getObrona() + 3);
					} else if (postac.rasa == "Człowiek" && postac.klasa == "Wojownik") {
						iv2.setImage(czlwoj);
						postac.setAtak(postac.getAtak() + 3);
						postac.setHp(postac.getHp() + 3);
					} else if (postac.rasa == "Człowiek" && postac.klasa == "Łucznik") {
						iv2.setImage(czllucz);
						postac.setSzybkosc(postac.getSzybkosc() + 3);
						postac.setHp(postac.getHp() + 3);
					} else if (postac.rasa == "Człowiek" && postac.klasa == "Mag") {
						iv2.setImage(czlmag);
						postac.setHp(postac.getHp() + 3);
					} else if (postac.rasa == "Elf" && postac.klasa == "Wojownik") {
						iv2.setImage(elfwoj);
						postac.setAtak(postac.getAtak() + 3);
						postac.setSzybkosc(postac.getSzybkosc() + 3);
					} else if (postac.rasa == "Elf" && postac.klasa == "Łucznik") {
						iv2.setImage(elflucz);
						postac.setSzybkosc(postac.getSzybkosc() + 3);
						postac.setSzybkosc(postac.getSzybkosc() + 3);
					} else if (postac.rasa == "Elf" && postac.klasa == "Mag") {
						iv2.setImage(elfmag);
						postac.setMana(postac.getMana() + 3);
						postac.setSzybkosc(postac.getSzybkosc() + 3);
					}

					textarea3.setText(postac.rasa + " " + postac.klasa + " to idealny wybór..\nAtak :"
							+ postac.getAtak() + "\n" + "HP: " + postac.getHp() + "\n" + "Mana: " + postac.getMana()
							+ "\n" + "Obrona: " + postac.getObrona() + "\n" + "Szybkość: " + postac.getSzybkosc());

					root.getChildren().add(iv2);
					root.getChildren().add(dalej);
					postac.nazwa = textarea1.getText();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		dalej.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {

					OknoKreatora.WyborBroni(postac, primaryStage);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		root.getChildren().add(iv1);
		root.getChildren().add(text1);
		root.getChildren().add(text2);
		root.getChildren().add(text3);
		root.getChildren().add(text4);
		root.getChildren().add(textarea1);
		root.getChildren().add(zatwierdz);
		root.getChildren().add(powrot);

		root.getChildren().add(cb1);
		root.getChildren().add(cb2);
		root.getChildren().add(textarea3);

		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();

		return postac;
	}

	static void Podsumowanie(Postac postac, Stage primaryStage, Przedmiot przedmiot) {
		Pane root = new Pane();
		Scene scene = new Scene(root, 800, 600);
		Image Obraz = new Image("img/tło.png");
		ImageView iv1 = new ImageView();
		iv1.setImage(Obraz);
		iv1.setPreserveRatio(true);
		iv1.setSmooth(true);

		Umiejetnosc umiejetnosc = new Umiejetnosc();

		Text text1 = new Text();
		text1.setLayoutX(300);
		text1.setLayoutY(40);
		text1.setStyle("-fx-font: 30 verdana; -fx-base: #b6e7c9;");
		text1.setText("Podsumowanie");

		Button powrot = new Button();
		powrot.setText("Powrot");
		powrot.setLayoutX(20);
		powrot.setLayoutY(530);
		powrot.setPrefWidth(90);
		powrot.setPrefHeight(40);
		powrot.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					OknoKreatora.WyborBroni(postac, primaryStage);
					}
					
					catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Button dalej = new Button();
		if (gracz1.size()<1)
		dalej.setText("Gracz 1 - Zapisz");
		else if (gracz2.size()<1)
		dalej.setText("Gracz 2 - Zapisz");
		else
		dalej.setText("Graj");
		dalej.setLayoutX(270);
		dalej.setLayoutY(530);
		dalej.setPrefWidth(90);
		dalej.setPrefHeight(40);
		dalej.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					if (gracz1.size()<2)
					{
						gracz1.add(postac);
						Dane.dodaj(postac);
						OknoKreatora.TworzeniePostaci(primaryStage);
						
					}
						else if(gracz2.size()<2)
					{
						gracz2.add(postac);
						Dane.dodaj(postac);
						OknoKreatora.TworzeniePostaci(primaryStage);
					}
					else
					{
					FrameWalka walka=new FrameWalka(gracz1, gracz2);
					walka.start(primaryStage);
					}
					} 
					catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		ImageView iv2 = new ImageView();
		
		Image czlmiecz1 = new Image("img/czł-woj-miecz1.png");
		Image czlmiecz2 = new Image("img/czł-woj-miecz2.png");
		Image czlmiecz3 = new Image("img/czł-woj-miecz3.png");
		
		Image czltopor1 = new Image("img/czł-woj-topor1.png");
		Image czltopor2 = new Image("img/czł-woj-topor2.png");
		Image czltopor3 = new Image("img/czł-woj-topor3.png");
		
		Image czlluk1 = new Image("img/cz strzelec-łuk1.png");
		Image czlluk2 = new Image("img/cz strzelec-łuk2.png");
		Image czlluk3 = new Image("img/cz strzelec-łuk3.png");

		Image czlkusza1 = new Image("img/cz strzelec-łuk4.png");
		Image czlkusza2 = new Image("img/cz strzelec-łuk5.png");
		Image czlkusza3 = new Image("img/cz strzelec-łuk6.png");

		Image czlkostur1 = new Image("img/czł-mag-kostur1.png");
		Image czlkostur2 = new Image("img/czł-mag-kostur2.png");
		Image czlkostur3 = new Image("img/czł-mag-kostur3.png");

		Image czlwend1 = new Image("img/czł-mag-wend1.png");
		Image czlwend2= new Image("img/czł-mag-wend2.png");
		Image czlwend3 = new Image("img/czł-mag-wend3.png");
		
		Image orkmiecz1 = new Image("img/czł-woj-miecz1.png");
		Image orkmiecz2 = new Image("img/czł-woj-miecz2.png");
		Image orkmiecz3 = new Image("img/czł-woj-miecz3.png");
		
		Image orktopor1 = new Image("img/czł-woj-topor1.png");
		Image orktopor2 = new Image("img/czł-woj-topor2.png");
		Image orktopor3 = new Image("img/czł-woj-topor3.png");
		
		Image orkluk1 = new Image("img/ork strzelec-łuk1.png");
		Image orkluk2 = new Image("img/ork strzelec-łuk2.png");
		Image orkluk3 = new Image("img/ork strzelec-łuk3.png");

		Image orkkusza1 = new Image("img/ork strzelec-łuk4.png");
		Image orkkusza2 = new Image("img/ork strzelec-łuk5.png");
		Image orkkusza3 = new Image("img/ork strzelec-łuk6.png");

		Image orkkostur1 = new Image("img/ork-mag-kostur1.png");
		Image orkkostur2 = new Image("img/ork-mag-kostur2.png");
		Image orkkostur3 = new Image("img/ork-mag-kostur3.png");

		Image orkwend1 = new Image("img/ork-mag-wend1.png");
		Image orkwend2= new Image("img/ork-mag-wend2.png");
		Image orkwend3 = new Image("img/ork-mag-wend3.png");
		
		Image elfmiecz1 = new Image("img/elf-woj-miecz1.png");
		Image elfmiecz2 = new Image("img/elf-woj-miecz2.png");
		Image elfmiecz3 = new Image("img/elf-woj-miecz3.png");
		
		Image elftopor1 = new Image("img/elf-woj-topor1.png");
		Image elftopor2 = new Image("img/elf-woj-topor2.png");
		Image elftopor3 = new Image("img/elf-woj-topor3.png");
		
		Image elfluk1 = new Image("img/elf-strzelec-łuk1.png");
		Image elfluk2 = new Image("img/elf-strzelec-łuk2.png");
		Image elfluk3 = new Image("img/elf-strzelec-łuk3.png");

		Image elfkusza1 = new Image("img/elf-strzelec-łuk4.png");
		Image elfkusza2 = new Image("img/elf-strzelec-łuk5.png");
		Image elfkusza3 = new Image("img/elf-strzelec-łuk6.png");

		Image elfkostur1 = new Image("img/elf-mag-kostur1.png");
		Image elfkostur2 = new Image("img/elf-mag-kostur2.png");
		Image elfkostur3 = new Image("img/elf-mag-kostur3.png");

		Image elfwend1 = new Image("img/elf-mag-wend1.png");
		Image elfwend2= new Image("img/elf-mag-wend2.png");
		Image elfwend3 = new Image("img/elf-mag-wend3.png");



	    if(postac.getRasa()=="Człowiek")
			{
				if(przedmiot.getNazwa()=="Wampirze Gardło")
				{
				//textarea3.setText("Z każdą kolejna kroplą, stajesz się silniejszy...");
				iv2.setImage(czlmiecz1);
				postac.Grafika(czlmiecz1);
				}
				else if(przedmiot.getNazwa()=="Zapomniane Ostrze")
				{
				//textarea3.setText("Nikt nie pamięta jego historii, ale każdy może poznać jego siłę...");
				iv2.setImage(czlmiecz2);
				postac.Grafika(czlmiecz2);
				}
				else if(przedmiot.getNazwa()=="Promień Nadziei")
				{
				//textarea3.setText("Tym razem to ty umrzesz ostatni...");
				iv2.setImage(czlmiecz3);
				postac.Grafika(czlmiecz3);
				}
				else if(przedmiot.getNazwa()=="Młot Grabarza")
				{
				//textarea3.setText("Następny cios jest gwoździem do trumny...");
				iv2.setImage(czltopor1);
				postac.Grafika(czltopor1);
				}
				else if(przedmiot.getNazwa()=="Sekator")
				{
				//textarea3.setText("Nie daj się zwieść...");
				iv2.setImage(czltopor2);
				postac.Grafika(czltopor2);
				}
				else if(przedmiot.getNazwa()=="Bukiet Strachu")
				{
				//textarea3.setText("Dobry prezent na każdą okazję..");
				iv2.setImage(czltopor3);
				postac.Grafika(czltopor3);
				}
				else if(przedmiot.getNazwa()=="Ostatnie Życzenie")
				{
				//textarea3.setText("Wypowiedz szybko...");
				iv2.setImage(czlluk1);
				postac.Grafika(czlluk1);
				}
				else if(przedmiot.getNazwa()=="Mantra")
				{
				//textarea3.setText("Powtarzaj do skutku...");
				iv2.setImage(czlluk2);
				postac.Grafika(czlluk2);
				}
				else if(przedmiot.getNazwa()=="Czwarty Muszkieter")
				{
				//textarea3.setText("Jednym na wszystkich...");
				iv2.setImage(czlluk3);
				postac.Grafika(czlluk3);
				}
				else if(przedmiot.getNazwa()=="Gałąź Wisielca")
				{
				//textarea3.setText("Podobno okrywa ją klątwa...");
				iv2.setImage(czlkusza1);
				postac.Grafika(czlkusza1);
				}
				else if(przedmiot.getNazwa()=="Magiczne Ustrojstwo")
				{
				//textarea3.setText("Obsługa do końca nie jest bezpieczna...");
				iv2.setImage(czlkusza2);
				postac.Grafika(czlkusza2);
				}
				else if(przedmiot.getNazwa()=="Dar Losu")
				{
				//textarea3.setText("Kto nie strzela, ten nie trafia...");
				iv2.setImage(czlkusza3);
				postac.Grafika(czlkusza3);
				}
				else if(przedmiot.getNazwa()=="Pierwsza Dama")
				{
				//textarea3.setText("Jej życzenie może stać się rozkazem...");
				iv2.setImage(czlwend1);
				postac.Grafika(czlwend1);
				}
				else if(przedmiot.getNazwa()=="Wdowa")
				{
				//textarea3.setText("Bo to zła kobieta była...");
				iv2.setImage(czlwend2);
				postac.Grafika(czlwend2);
				}
				else if(przedmiot.getNazwa()=="Morowa Dziewica")
				{
				//textarea3.setText("Od powietrza, głodu, ognia i wojny...");
				iv2.setImage(czlwend3);
				postac.Grafika(czlwend3);
				}
				else if(przedmiot.getNazwa()=="Konar Potencjału")
				{
				//textarea3.setText("Legenda głosi, że kiedyś zapłonie...");
				iv2.setImage(czlkostur1);
				postac.Grafika(czlkostur1);
				}
				else if(przedmiot.getNazwa()=="Kostur Zaparcia")
				{
				//textarea3.setText("W kupie siła...");
				iv2.setImage(czlkostur2);
				postac.Grafika(czlkostur2);
				}
				else if(przedmiot.getNazwa()=="Noga Enta")
				{
				//textarea3.setText("Szybciej! Szybciej!");
				iv2.setImage(czlkostur3);
				postac.Grafika(czlkostur3);
				}
			}
			else if(postac.getRasa()=="Ork")
			{
				if(przedmiot.getNazwa()=="Wampirze Gardło")
				{
				//textarea3.setText("Z każdą kolejna kroplą, stajesz się silniejszy...");
				iv2.setImage(orkmiecz1);
				postac.Grafika(orkmiecz1);
				}
				else if(przedmiot.getNazwa()=="Zapomniane Ostrze")
				{
				//textarea3.setText("Nikt nie pamięta jego historii, ale każdy może poznać jego siłę...");
				iv2.setImage(orkmiecz2);
				postac.Grafika(orkmiecz2);
				}
				else if(przedmiot.getNazwa()=="Promień Nadziei")
				{
				//textarea3.setText("Tym razem to ty umrzesz ostatni...");
				iv2.setImage(orkmiecz3);
				postac.Grafika(orkmiecz3);
				}
				else if(przedmiot.getNazwa()=="Młot Grabarza")
				{
				//textarea3.setText("Następny cios jest gwoździem do trumny...");
				iv2.setImage(orktopor1);
				postac.Grafika(orktopor1);
				}
				else if(przedmiot.getNazwa()=="Sekator")
				{
				//textarea3.setText("Nie daj się zwieść...");
				iv2.setImage(orktopor2);
				postac.Grafika(orktopor2);
				}
				else if(przedmiot.getNazwa()=="Bukiet Strachu")
				{
				//textarea3.setText("Dobry prezent na każdą okazję..");
				iv2.setImage(orktopor3);
				postac.Grafika(orktopor3);
				}
				else if(przedmiot.getNazwa()=="Ostatnie Życzenie")
				{
				//textarea3.setText("Wypowiedz szybko...");
				iv2.setImage(orkluk1);
				postac.Grafika(orkluk1);
				}
				else if(przedmiot.getNazwa()=="Mantra")
				{
				//textarea3.setText("Powtarzaj do skutku...");
				iv2.setImage(orkluk2);
				postac.Grafika(orkluk2);
				}
				else if(przedmiot.getNazwa()=="Czwarty Muszkieter")
				{
				//textarea3.setText("Jednym na wszystkich...");
				iv2.setImage(orkluk3);
				postac.Grafika(orkluk3);
				}
				else if(przedmiot.getNazwa()=="Gałąź Wisielca")
				{
				//textarea3.setText("Podobno okrywa ją klątwa...");
				iv2.setImage(orkkusza1);
				postac.Grafika(orkkusza1);
				}
				else if(przedmiot.getNazwa()=="Magiczne Ustrojstwo")
				{
				//textarea3.setText("Obsługa do końca nie jest bezpieczna...");
				iv2.setImage(orkkusza2);
				postac.Grafika(orkkusza2);
				}
				else if(przedmiot.getNazwa()=="Dar Losu")
				{
				//textarea3.setText("Kto nie strzela, ten nie trafia...");
				iv2.setImage(orkkusza3);
				postac.Grafika(orkkusza3);
				}
				else if(przedmiot.getNazwa()=="Pierwsza Dama")
				{
				//textarea3.setText("Jej życzenie może stać się rozkazem...");
				iv2.setImage(orkwend1);
				postac.Grafika(orkwend1);
				}
				else if(przedmiot.getNazwa()=="Wdowa")
				{
				//textarea3.setText("Bo to zła kobieta była...");
				iv2.setImage(orkwend2);
				postac.Grafika(orkwend2);
				}
				else if(przedmiot.getNazwa()=="Morowa Dziewica")
				{
				//textarea3.setText("Od powietrza, głodu, ognia i wojny...");
				iv2.setImage(orkwend3);
				postac.Grafika(orkwend3);
				}
				else if(przedmiot.getNazwa()=="Konar Potencjału")
				{
				//textarea3.setText("Legenda głosi, że kiedyś zapłonie...");
				iv2.setImage(orkkostur1);
				postac.Grafika(orkkostur1);
				}
				else if(przedmiot.getNazwa()=="Kostur Zaparcia")
				{
				//textarea3.setText("W kupie siła...");
				iv2.setImage(orkkostur2);
				postac.Grafika(orkkostur2);
				}
				else if(przedmiot.getNazwa()=="Noga Enta")
				{
				//textarea3.setText("Szybciej! Szybciej!");
				iv2.setImage(orkkostur3);
				postac.Grafika(orkkostur3);
				}
			}
			else
			{
				if(przedmiot.getNazwa()=="Wampirze Gardło")
				{
				//textarea3.setText("Z każdą kolejna kroplą, stajesz się silniejszy...");
				iv2.setImage(elfmiecz1);
				postac.Grafika(elfmiecz1);
				}
				else if(przedmiot.getNazwa()=="Zapomniane Ostrze")
				{
				//textarea3.setText("Nikt nie pamięta jego historii, ale każdy może poznać jego siłę...");
				iv2.setImage(elfmiecz2);
				postac.Grafika(elfmiecz2);
				}
				else if(przedmiot.getNazwa()=="Promień Nadziei")
				{
				//textarea3.setText("Tym razem to ty umrzesz ostatni...");
				iv2.setImage(elfmiecz3);
				postac.Grafika(elfmiecz3);
				}
				else if(przedmiot.getNazwa()=="Młot Grabarza")
				{
				//textarea3.setText("Następny cios jest gwoździem do trumny...");
				iv2.setImage(elftopor1);
				postac.Grafika(elftopor1);
				}
				else if(przedmiot.getNazwa()=="Sekator")
				{
				//textarea3.setText("Nie daj się zwieść...");
				iv2.setImage(elftopor2);
				postac.Grafika(elftopor2);
				}
				else if(przedmiot.getNazwa()=="Bukiet Strachu")
				{
				//textarea3.setText("Dobry prezent na każdą okazję..");
				iv2.setImage(elftopor3);
				postac.Grafika(elftopor3);
				}
				else if(przedmiot.getNazwa()=="Ostatnie Życzenie")
				{
				//textarea3.setText("Wypowiedz szybko...");
				iv2.setImage(elfluk1);
				postac.Grafika(elfluk1);
				}
				else if(przedmiot.getNazwa()=="Mantra")
				{
				//textarea3.setText("Powtarzaj do skutku...");
				iv2.setImage(elfluk2);
				postac.Grafika(elfluk2);
				}
				else if(przedmiot.getNazwa()=="Czwarty Muszkieter")
				{
				//textarea3.setText("Jednym na wszystkich...");
				iv2.setImage(elfluk3);
				postac.Grafika(elfluk2);
				}
				else if(przedmiot.getNazwa()=="Gałąź Wisielca")
				{
				//textarea3.setText("Podobno okrywa ją klątwa...");
				iv2.setImage(elfkusza1);
				postac.Grafika(elfkusza1);
				}
				else if(przedmiot.getNazwa()=="Magiczne Ustrojstwo")
				{
				//textarea3.setText("Obsługa do końca nie jest bezpieczna...");
				iv2.setImage(elfkusza2);
				postac.Grafika(elfkusza2);
				}
				else if(przedmiot.getNazwa()=="Dar Losu")
				{
				//textarea3.setText("Kto nie strzela, ten nie trafia...");
				iv2.setImage(elfkusza3);
				postac.Grafika(elfkusza3);
				}
				else if(przedmiot.getNazwa()=="Pierwsza Dama")
				{
				//textarea3.setText("Jej życzenie może stać się rozkazem...");
				iv2.setImage(elfwend1);
				postac.Grafika(elfwend1);
				}
				else if(przedmiot.getNazwa()=="Wdowa")
				{
				//textarea3.setText("Bo to zła kobieta była...");
				iv2.setImage(elfwend2);
				postac.Grafika(elfwend2);
				}
				else if(przedmiot.getNazwa()=="Morowa Dziewica")
				{
				//textarea3.setText("Od powietrza, głodu, ognia i wojny...");
				iv2.setImage(elfwend3);
				postac.Grafika(elfwend3);
				}
				else if(przedmiot.getNazwa()=="Konar Potencjału")
				{
				//textarea3.setText("Legenda głosi, że kiedyś zapłonie...");
				iv2.setImage(elfkostur1);
				postac.Grafika(elfkostur1);
				}
				else if(przedmiot.getNazwa()=="Kostur Zaparcia")
				{
				//textarea3.setText("W kupie siła...");
				iv2.setImage(elfkostur2);
				postac.Grafika(elfkostur2);
				}
				else if(przedmiot.getNazwa()=="Noga Enta")
				{
				//textarea3.setText("Szybciej! Szybciej!");
				iv2.setImage(elfkostur3);
				postac.Grafika(elfkostur3);
				}
			}
		iv2.setPreserveRatio(true);
		iv2.setSmooth(true);
		iv2.setFitHeight(500);
		iv2.setFitWidth(200);
		iv2.setLayoutX(550);
		iv2.setLayoutY(100);
		
		TextArea textarea3 = new TextArea();
		textarea3.setLayoutX(20);
		textarea3.setLayoutY(90);
		textarea3.setPrefWidth(340);
		textarea3.setPrefHeight(380);
		textarea3.setStyle("-fx-font: 30 verdana; -fx-base: #b6e7c9;");
		textarea3.setText("Imię:  \t"+ postac.nazwa + "\nRasa:  \t" + postac.rasa + "\nKlasa:  \t" + postac.klasa + "\nPrzedmiot:" + przedmiot.rodzaj + "\nNazwa:\t"
				+ przedmiot.nazwa);

		root.getChildren().add(iv1);
		root.getChildren().add(text1);
		root.getChildren().add(textarea3);
		root.getChildren().add(powrot);
		root.getChildren().add(dalej);
		root.getChildren().add(iv2);


		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
			
	}

	static void WyborBroni(Postac postac, Stage primaryStage) {
		Pane root = new Pane();
		Scene scene = new Scene(root, 800, 600);
		Image Obraz = new Image("img/tło.png");
		ImageView iv1 = new ImageView();
		iv1.setImage(Obraz);
		iv1.setPreserveRatio(true);
		iv1.setSmooth(true);

		Przedmiot przedmiot = new Przedmiot();

		Text text1 = new Text();
		text1.setLayoutX(300);
		text1.setLayoutY(40);
		text1.setStyle("-fx-font: 30 verdana; -fx-base: #b6e7c9;");
		text1.setText("Wybór Broni");

		Text text3 = new Text();
		text3.setLayoutX(20);
		text3.setLayoutY(145);
		text3.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
		text3.setText("Rodzaj:");

		Text text4 = new Text();
		text4.setLayoutX(20);
		text4.setLayoutY(255);
		text4.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
		text4.setText("Model:");

		Button zatwierdz = new Button();
		zatwierdz.setText("Zatwierdź");
		zatwierdz.setLayoutX(20);
		zatwierdz.setLayoutY(480);
		zatwierdz.setPrefWidth(90);
		zatwierdz.setPrefHeight(40);

		Button powrot = new Button();
		powrot.setText("Powrot");
		powrot.setLayoutX(20);
		powrot.setLayoutY(530);
		powrot.setPrefWidth(90);
		powrot.setPrefHeight(40);
		powrot.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					OknoKreatora.TworzeniePostaci(primaryStage);
					}
					
					catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Button dalej = new Button();
		dalej.setText("Dalej");
		dalej.setLayoutX(270);
		dalej.setLayoutY(530);
		dalej.setPrefWidth(90);
		dalej.setPrefHeight(40);

		TextArea textarea3 = new TextArea();
		textarea3.setLayoutX(20);
		textarea3.setLayoutY(320);
		textarea3.setPrefWidth(340);
		textarea3.setPrefHeight(150);
		textarea3.setText("Opis...");
		textarea3.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
		
		Button zatwierdz1 = new Button();
		zatwierdz1.setText("Potwierdź...");
		zatwierdz1.setLayoutX(150);
		zatwierdz1.setLayoutY(180);
		zatwierdz1.setPrefWidth(100);
		zatwierdz1.setPrefHeight(30);

		ChoiceBox cb1;
		if (postac.klasa == "Wojownik") {
			cb1 = new ChoiceBox(FXCollections.observableArrayList("Miecz", "Topór"));
			cb1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
				public void changed(ObservableValue ov, Number value, Number new_value) {
					// Label.setText(postac.rasy[new_value.intValue()]);
					przedmiot.rodzaj = przedmiot.broniewojownik[new_value.intValue()];
				}
			});
		} else if (postac.klasa == "Łucznik") {
			cb1 = new ChoiceBox(FXCollections.observableArrayList("Kusza", "Łuk"));
			cb1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
				public void changed(ObservableValue ov, Number value, Number new_value) {
					// Label.setText(postac.rasy[new_value.intValue()]);
					przedmiot.rodzaj = przedmiot.bronielucznik[new_value.intValue()];
				}
			});
		} else {
			cb1 = new ChoiceBox(FXCollections.observableArrayList("Kostur", "Laska"));
			cb1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
				public void changed(ObservableValue ov, Number value, Number new_value) {
					// Label.setText(postac.rasy[new_value.intValue()]);
					przedmiot.rodzaj = przedmiot.broniemag[new_value.intValue()];
				}
			});
		}

		cb1.setLayoutX(150);
		cb1.setLayoutY(120);
		cb1.setPrefWidth(200);
		cb1.setPrefHeight(40);

		Image miecz1 = new Image("img/miecz1.png");
		Image miecz2 = new Image("img/miecz2.png");
		Image miecz3 = new Image("img/miecz3.png");
		
		Image topor1 = new Image("img/topor1.png");
		Image topor2 = new Image("img/topor2.png");
		Image topor3 = new Image("img/topor3.png");
		
		Image luk1 = new Image("img/łuk1.png");
		Image luk2 = new Image("img/łuk2.png");
		Image luk3 = new Image("img/łuk3.png");

		Image kusza1 = new Image("img/łuk4.png");
		Image kusza2 = new Image("img/łuk5.png");
		Image kusza3 = new Image("img/łuk6.png");

		Image kostur1 = new Image("img/kostur1.png");
		Image kostur2 = new Image("img/kostur2.png");
		Image kostur3 = new Image("img/kostur3.png");

		Image wend1 = new Image("img/wend1.png");
		Image wend2= new Image("img/wend2.png");
		Image wend3 = new Image("img/wend3.png");

		ImageView iv2 = new ImageView();

		zatwierdz.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					if(przedmiot.getNazwa()=="Wampirze Gardło")
						{
						textarea3.setText("Z każdą kolejna kroplą, stajesz się silniejszy...");
						iv2.setImage(miecz1);
						}
						else if(przedmiot.getNazwa()=="Zapomniane Ostrze")
						{
						textarea3.setText("Nikt nie pamięta jego historii, ale każdy może poznać jego siłę...");
						iv2.setImage(miecz2);
						}
						else if(przedmiot.getNazwa()=="Promień Nadziei")
						{
						textarea3.setText("Tym razem to ty umrzesz ostatni...");
						iv2.setImage(miecz3);
						}
						else if(przedmiot.getNazwa()=="Młot Grabarza")
						{
						textarea3.setText("Następny cios jest gwoździem do trumny...");
						iv2.setImage(topor1);
						}
						else if(przedmiot.getNazwa()=="Sekator")
						{
						textarea3.setText("Nie daj się zwieść...");
						iv2.setImage(topor2);
						}
						else if(przedmiot.getNazwa()=="Bukiet Strachu")
						{
						textarea3.setText("Dobry prezent na każdą okazję..");
						iv2.setImage(topor3);
						}
						else if(przedmiot.getNazwa()=="Ostatnie Życzenie")
						{
						textarea3.setText("Wypowiedz szybko...");
						iv2.setImage(luk1);
						}
						else if(przedmiot.getNazwa()=="Mantra")
						{
						textarea3.setText("Powtarzaj do skutku...");
						iv2.setImage(luk2);
						}
						else if(przedmiot.getNazwa()=="Czwarty Muszkieter")
						{
						textarea3.setText("Jednym na wszystkich...");
						iv2.setImage(luk3);
						}
						else if(przedmiot.getNazwa()=="Gałąź Wisielca")
						{
						textarea3.setText("Podobno okrywa ją klątwa...");
						iv2.setImage(kusza1);
						}
						else if(przedmiot.getNazwa()=="Magiczne Ustrojstwo")
						{
						textarea3.setText("Obsługa do końca nie jest bezpieczna...");
						iv2.setImage(kusza2);
						}
						else if(przedmiot.getNazwa()=="Dar Losu")
						{
						textarea3.setText("Kto nie strzela, ten nie trafia...");
						iv2.setImage(kusza3);
						}
						else if(przedmiot.getNazwa()=="Pierwsza Dama")
						{
						textarea3.setText("Jej życzenie może stać się rozkazem...");
						iv2.setImage(wend1);
						}
						else if(przedmiot.getNazwa()=="Wdowa")
						{
						textarea3.setText("Bo to zła kobieta była...");
						iv2.setImage(wend2);
						}
						else if(przedmiot.getNazwa()=="Morowa Dziewica")
						{
						textarea3.setText("Od powietrza, głodu, ognia i wojny...");
						iv2.setImage(wend3);
						}
						else if(przedmiot.getNazwa()=="Konar Potencjału")
						{
						textarea3.setText("Legenda głosi, że kiedyś zapłonie...");
						iv2.setImage(kostur1);
						}
						else if(przedmiot.getNazwa()=="Kostur Zaparcia")
						{
						textarea3.setText("W kupie siła...");
						iv2.setImage(kostur2);
						}
						else if(przedmiot.getNazwa()=="Noga Enta")
						{
						textarea3.setText("Szybciej! Szybciej!");
						iv2.setImage(kostur3);
						}
					
					iv2.setPreserveRatio(true);
					iv2.setSmooth(true);
					iv2.setFitHeight(400);
					iv2.setFitWidth(100);
					iv2.setLayoutX(550);
					iv2.setLayoutY(100);
					root.getChildren().add(iv2);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		dalej.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {

					OknoKreatora.Podsumowanie(postac, primaryStage, przedmiot);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		

		root.getChildren().add(iv1);
		root.getChildren().add(text1);
		root.getChildren().add(text3);
		root.getChildren().add(text4);
		root.getChildren().add(textarea3);
		root.getChildren().add(powrot);
		root.getChildren().add(cb1);
		root.getChildren().add(zatwierdz1);
		root.getChildren().add(dalej);

		zatwierdz1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {

					ChoiceBox cb2 = null;
					if (przedmiot.rodzaj == "Miecz") {
						cb2 = new ChoiceBox(FXCollections.observableArrayList("Wampirze Gardło", "Zapomniane Ostrze",
								"Promień Nadziei"));
						cb2.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
							public void changed(ObservableValue ov, Number value, Number new_value) {
								przedmiot.setNazwa(przedmiot.miecze[new_value.intValue()]);
							}
						});
					} else if (przedmiot.rodzaj == "Topór") {
						cb2 = new ChoiceBox(
								FXCollections.observableArrayList("Młot Grabarze", "Sekator", "Bukiet Strachu"));
						cb2.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
							public void changed(ObservableValue ov, Number value, Number new_value) {
								przedmiot.setNazwa(przedmiot.topory[new_value.intValue()]);
							}
						});
					} else if (przedmiot.rodzaj == "Łuk") {
						cb2 = new ChoiceBox(
								FXCollections.observableArrayList("Ostatnie Życzenie", "Mantra", "Czwarty Muszkieter"));
						cb2.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
							public void changed(ObservableValue ov, Number value, Number new_value) {
								przedmiot.setNazwa(przedmiot.luki[new_value.intValue()]);
							}
						});
					} else if (przedmiot.rodzaj == "Kusza") {
						cb2 = new ChoiceBox(
								FXCollections.observableArrayList("Gałąź Wisielca", "Magiczne Ustrojstwo", "Dar Losu"));
						cb2.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
							public void changed(ObservableValue ov, Number value, Number new_value) {
								przedmiot.setNazwa(przedmiot.kusze[new_value.intValue()]);
							}
						});
					} else if (przedmiot.rodzaj == "Kostur") {
						cb2 = new ChoiceBox(
								FXCollections.observableArrayList("Pierwsza Dama", "Wdowa", "Morowa Dziewica"));
						cb2.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
							public void changed(ObservableValue ov, Number value, Number new_value) {
								przedmiot.setNazwa(przedmiot.kostury[new_value.intValue()]);
							}
						});
					} else // if(przedmiot.rodzaj=="Laska")
					{
						cb2 = new ChoiceBox(
								FXCollections.observableArrayList("Konar Potencjału", "Kostur Zaparcia", "Noga Enta"));
						cb2.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
							public void changed(ObservableValue ov, Number value, Number new_value) {
								przedmiot.setNazwa(przedmiot.laski[new_value.intValue()]);
							}
						});
					}

					
					root.getChildren().add(cb2);
					cb2.setLayoutX(150);
					cb2.setLayoutY(230);
					cb2.setPrefWidth(200);
					cb2.setPrefHeight(40);
					root.getChildren().add(zatwierdz);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
