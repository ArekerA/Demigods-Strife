package kreator;

import java.io.File;
import java.io.FileNotFoundException;

import interfejs.Ramka;
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

public class OknoKreatora extends Ramka {
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
		// a
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

	static Postac TworzeniePostaci(Stage primaryStage) throws FileNotFoundException {
		Postac postac = new Postac();
		Pane root = new Pane();
		Scene scene = new Scene(root, 800, 600);
		Image Obraz = new Image("img/tło.png");
		File postaci1 = new File("postaci1.txt");
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
				// Label.setText(postac.rasy[new_value.intValue()]);
				postac.rasa = Postac.rasy[new_value.intValue()];
			}
		});

		cb1.setLayoutX(150);
		cb1.setLayoutY(160);
		cb1.setPrefWidth(200);
		cb1.setPrefHeight(40);
		ChoiceBox cb2 = new ChoiceBox(FXCollections.observableArrayList("Wojownik", "Łucznik", "Mag"));
		cb1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
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
		powrot.setText("Powrot");
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
		Image orklucz = new Image("img/ork-woj.png");
		Image orkmag = new Image("img/ork-mag.png");
		Image czlwoj = new Image("img/ork-woj.png");
		Image czllucz = new Image("img/ork-woj.png");
		Image czlmag = new Image("img/ork-woj.png");
		Image elfwoj = new Image("img/ork-woj.png");
		Image elflucz = new Image("img/ork-woj.png");
		Image elfmag = new Image("img/ork-woj.png");
		HBox box1 = new HBox();
		zatwierdz.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					ImageView iv2 = new ImageView();
					iv2.setPreserveRatio(true);
					iv2.setSmooth(true);
					iv2.setScaleX(0.5);
					iv2.setScaleY(0.5);
					iv2.setLayoutX(450);
					iv2.setLayoutY(-150);
					iv2.setImage(orkwoj);

					if (postac.rasa == "Ork" && postac.klasa == "Wojownik")
						iv2.setImage(orkwoj);
					else if (postac.rasa == "Ork" && postac.klasa == "Łucznik")
						iv2.setImage(orkwoj);
					else if (postac.rasa == "Ork" && postac.klasa == "Mag")
						iv2.setImage(orkmag);
					else if (postac.rasa == "Człowiek" && postac.klasa == "Wojownik")
						iv2.setImage(orkmag);
					else if (postac.rasa == "Człowiek" && postac.klasa == "Łucznik")
						iv2.setImage(orkwoj);
					else if (postac.rasa == "Człowiek" && postac.klasa == "Mag")
						iv2.setImage(orkwoj);
					else if (postac.rasa == "Elf" && postac.klasa == "Wojownik")
						iv2.setImage(orkwoj);
					else if (postac.rasa == "Elf" && postac.klasa == "Łucznik")
						iv2.setImage(orkwoj);
					else if (postac.rasa == "Elf" && postac.klasa == "Mag")
						iv2.setImage(orkwoj);

					textarea3.setText("dziala");
					root.getChildren().add(iv2);
					root.getChildren().add(dalej);
					postac.nazwa = textarea1.getText();
					
					
					/*
					 * zapis.println(postac.klasa); zapis.println(postac.rasa);
					 * zapis.println(postac.nazwa); zapis.close();
					 */

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
	
	static void WyborBroni(Postac postac, Stage primaryStage)
	{
		Pane root = new Pane();
		Scene scene = new Scene(root, 800, 600);
		Image Obraz = new Image("img/tło.png");
		ImageView iv1 = new ImageView();
		iv1.setImage(Obraz);
		iv1.setPreserveRatio(true);
		iv1.setSmooth(true);
		
		Przedmiot przedmiot=new Przedmiot();
		
		Text text1 = new Text();
		text1.setLayoutX(300);
		text1.setLayoutY(40);
		text1.setStyle("-fx-font: 30 verdana; -fx-base: #b6e7c9;");
		text1.setText("Wybór Broni");
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
		
		ChoiceBox cb1 = new ChoiceBox(FXCollections.observableArrayList("Człowiek", "Elf", "Ork"));
		cb1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue ov, Number value, Number new_value) {
				// Label.setText(postac.rasy[new_value.intValue()]);
				przedmiot.rodzaj = przedmiot.broniewojownik[new_value.intValue()];
			}
		});

		cb1.setLayoutX(150);
		cb1.setLayoutY(160);
		cb1.setPrefWidth(200);
		cb1.setPrefHeight(40);
		ChoiceBox cb2 = new ChoiceBox(FXCollections.observableArrayList("Wojownik", "Łucznik", "Mag"));
		cb1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue ov, Number value, Number new_value) {
				postac.klasa = Postac.klasy[new_value.intValue()];
			}
		});
		
		root.getChildren().add(iv1);
		root.getChildren().add(textarea3);
		root.getChildren().add(zatwierdz);
		root.getChildren().add(powrot);

		
		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
