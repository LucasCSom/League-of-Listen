package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VictoryPage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Victory.fxml"));
	        primaryStage.setTitle("League of Listen");
	        primaryStage.setScene(new Scene(root, 600, 400));
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
