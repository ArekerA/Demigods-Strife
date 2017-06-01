package walka;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class FrameWalka extends Application {
	public void start(Stage primaryStage) throws Exception {
		Image Obraz = new Image("img/hex.png");
		Pane root = new Pane();
		for (int y = 0; y < 12; y++)
			for (int x = 0; x < 15; x++) {
				ImageView iv1 = new ImageView();
				iv1.setImage(Obraz);
				iv1.setPreserveRatio(true);
				iv1.setSmooth(true);
				iv1.setLayoutX(x * 76 + (y % 2) * 40);
				iv1.setLayoutY(y * 65);
				iv1.prefWidth(80);
				iv1.prefHeight(92);
				root.getChildren().add(iv1);
			}
		Scene scene = new Scene(root, 800, 600);

		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/*public static void main(String[] args) {
		Application.launch(args);
	}*/
}
