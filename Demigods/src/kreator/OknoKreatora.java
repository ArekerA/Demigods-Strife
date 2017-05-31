package kreator;

import interfejs.Ramka;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
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
		Text text1= new Text();
		Text text2= new Text();
		text1.setLayoutX(20);
		text1.setLayoutY(20);
		text1.setStyle("-fx-font: 25 arial; -fx-base: #b6e7c9;");
		text2.setLayoutX(20);
		text2.setLayoutY(250);
		text2.setStyle("-fx-font: 25 arial; -fx-base: #b6e7c9;");
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
		btn4.setLayoutY(300);
		btn4.setPrefWidth(200);
		btn4.setPrefHeight(50);
		btn5.setText("Wczytaj Drużynę");
		btn5.setLayoutX(20);
		btn5.setLayoutY(370);
		btn5.setPrefWidth(200);
		btn5.setPrefHeight(50);
		btn6.setText("Zapisz Drużynę");
		btn6.setLayoutX(20);
		btn6.setLayoutY(450);
		btn6.setPrefWidth(200);
		btn6.setPrefHeight(50);
		text1.setText("Gracz 1:");
		text2.setText("Gracz 2:");

		ImageView iv1 = new ImageView();
		iv1.setImage(Obraz);
		iv1.setPreserveRatio(true);
		iv1.setSmooth(true);
		
		
		
		HBox box = new HBox();
		box.getChildren().add(iv1);
		
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
		
		

	
		Scene scene = new Scene(root, 800, 600);
		

		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
		Application.launch();
	

	}
}
