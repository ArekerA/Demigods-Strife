package walka;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FrameWalka extends Application {
	

	public void start(Stage primaryStage) throws Exception {
		
		Image Obraz = new Image("hex.png");
		ArrayList<ImageView> hexy=new ArrayList();
		
		ImageView iv1 = new ImageView();
		iv1.setImage(Obraz);
		iv1.setPreserveRatio(true);
		iv1.setSmooth(true);
		for(int i=0; i<10; i++)
		{
			hexy.add(iv1);
		}
		HBox box = new HBox();
		
		Pane root = new Pane();
		root.getChildren().add(box);
		
		
		/*for(int x=0; x<10; x++)
		{
			box.getChildren().add(hexy.get(x));
		}*/
		box.getChildren().add(iv1);
		
		Scene scene = new Scene(root, 800, 600);

		primaryStage.setTitle("Demigoods Strife");
		primaryStage.setScene(scene);
		primaryStage.show();
		Application.launch();
	}
	
	public static void majn(String[] args) {
		Application.launch(args);
	}
	}

	

