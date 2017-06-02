
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import kreator.RamkaKreatora;

public class Ramka extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Image Obraz = new Image("img/tlo1.png");
		btn1.setText("Graj!");
		btn2.setText("Usuń Drużynę");
		btn3.setText("Wyjdź");
		btn3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				 System.out.println("Goodbay World!");
			}
		});
		

		ImageView iv1 = new ImageView();
		iv1.setImage(Obraz);
		iv1.setPreserveRatio(true);
		iv1.setSmooth(true);
		
		
		HBox box = new HBox();
		box.getChildren().add(iv1);
		//box.getChildren().add(iv2);
		Pane root = new Pane();
		root.getChildren().add(box);
		root.getChildren().add(btn1);
		root.getChildren().add(btn2);
		root.getChildren().add(btn3);
		btn1.setLayoutX(250);
		btn1.setLayoutY(100);
		btn1.setPrefWidth(300);
		btn1.setPrefHeight(80);
		btn1.setStyle("-fx-font: 25 arial; -fx-base: #b6e7c9;");
		btn2.setLayoutX(250);
		btn2.setLayoutY(250);
		btn2.setPrefWidth(300);
		btn2.setPrefHeight(80);
		btn2.setStyle("-fx-font: 25 arial; -fx-base: #b6e7c9;");
		btn3.setLayoutX(250);
		btn3.setLayoutY(400);
		btn3.setPrefWidth(300);
		btn3.setPrefHeight(80);
		btn3.setStyle("-fx-font: 25 arial; -fx-base: #b6e7c9;");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				RamkaKreatora walka=new RamkaKreatora();
				 try {
					walka.start(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
//		root.getChildren().add(Obraz);
		
//		 Rectangle2D viewportRect = new Rectangle2D(40, 35, 110, 110);
//		 btn2.setViewport(viewportRect);
	
		Scene scene = new Scene(root, 800, 600);
		

		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
