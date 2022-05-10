package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	GameHandler gameHandler;
	
	@Override
	public void start(Stage primaryStage) {
		gameHandler = new GameHandler();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
	        primaryStage.setTitle("League of Listen");
	        primaryStage.setScene(new Scene(root, 600, 400));
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
