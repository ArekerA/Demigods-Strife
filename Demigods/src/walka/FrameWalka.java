package walka;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FrameWalka extends Application {
	public void start(Stage primaryStage) throws Exception {
		ImageView[][] poleWalki = new ImageView[21][12];
		Image im_hex = new Image("img/hex.png");
		Image im_hex2 = new Image("img/hex2.png");
		Image im_hex3 = new Image("img/hex3.png");
		Pane root = new Pane();
		Pane hex = new Pane();
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
				ImageView iv1 = new ImageView();
				iv1.setImage(im_hex);
				iv1.setPreserveRatio(true);
				iv1.setSmooth(true);
				iv1.setLayoutX(x * 49 + (y % 2) * 25);
				iv1.setLayoutY(y * 42);
				iv1.setFitWidth(50);
				iv1.setFitHeight(57);
				iv1.setOnMouseEntered(new EventHandler<MouseEvent>(){
					 
		            @Override
		            public void handle(MouseEvent event) {
		                iv1.setImage(im_hex3);
		            }
		        });
				iv1.setOnMouseExited(new EventHandler<MouseEvent>(){
					 
		            @Override
		            public void handle(MouseEvent event) {
		                iv1.setImage(im_hex);
		            }
		        });
				poleWalki[x+6-y/2][y] = iv1;
				hex.getChildren().add(poleWalki[x+6-y/2][y]);
			}
		hex.setLayoutX(20);
		hex.setLayoutY(80);
		root.getChildren().add(hex);
		Scene scene = new Scene(root, 800, 600);

        primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
