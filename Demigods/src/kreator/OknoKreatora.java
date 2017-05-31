package kreator;

import interfejs.Ramka;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OknoKreatora extends Ramka{
	@Override
	public void start(Stage primaryStage) {
		
		Image Obraz = new Image("tło.png");
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
		Text text1= new Text();
		Text text2= new Text();
		Text text3= new Text();
		Text text4= new Text();
		TextArea textarea1= new TextArea();
		TextArea textarea2= new TextArea();
		Rectangle rect1 = new Rectangle(320,50,200,200);
		Rectangle rect2 = new Rectangle(320,310,200,200);
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
		//a
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
		Application.launch();
	

	}
}
