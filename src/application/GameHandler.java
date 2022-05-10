package application;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GameHandler {
	
	Champion currentChampion;
	ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Aatrox", "Akali", "Aurelion Sol", "Ahri", "Alistar", "Amumu", "Anivia", "Annie", "Ashe", "Azir", "Bard", "Blitzcrank", 
			"Brand", "Braum", "Camille", "Caitlyn", "Cassiopeia", "Cho Gath", "Corki", "Darius", "Dr. Mundo", "Diana", "Draven", "Ekko", "Elise", "Evelynn", "Ezreal", 
			"Fiddlesticks", "Fiora", "Fizz", "Galio", "Gangplank", "Garen", "Gnar", "Gragas", "Graves", "Hecarim", "Heimerdinger", "Irelia", "Ivern", 
			"Illaoi", "Janna", "Jarvan IV", "Jax", "Jayce", "Jhin", "Jinx", "Karma", "Kalista", "Karthus", "Kassadin", "Kai Sa", "Katarina", "Kayn", "Kayle", 
			"Kennen", "Kha Zix", "Kog Maw", "Kled", "Kindred", "LeBlanc", "Lee Sin", "Leona", "Lucian", "Lissandra", "Lulu", "Lux", "Malphite", "Malzahar", 
			"Maokai", "Master Yi", "Miss Fortune", "Mordekaiser", "Morgana", "Nami", "Nasus", "Nautilus", "Neeko", "Nidalee", "Nocturne", "Nunu and Willump", 
			"Olaf", "Orrn", "Orianna", "Pantheon", "Poppy"," Pyke", "Quinn", "Rammus", "Rakan", "Rek Sai", "Renekton", "Rengar", "Riven", "Rumble", "Ryze", "Sejuani", 
			"Shaco", "Shen", "Shyvana", "Singed", "Sion", "Sivir", "Skarner", "Sona", "Soraka", "Swain", "Syndra", "Sylas", "Talon", "Taliyah", "Taric", "Tahm Kench", 
			"Thresh", "Teemo", "Tristana", "Trundle", "Tryndamere", "Twisted Fate", "Twitch", "Udyr", "Urgot", "Varus", "Vayne", "Veigar", "Vel Koz", "Vi", "Viktor", 
			"Vladimir", "Volibear", "Warwick", "Wukong", "Xayah", "Xerath", "Xin Zhao", "Yasuo", "Yorick", "Zac", "Zed", "Ziggs", "Zilean", "Zoe", "Zyra", "Yuumi", 
			"Senna", "Qiyana", "Sett", "Aphelios", "Lillia", "Yone"));
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	private TextField userGuess;
	
	public GameHandler() {
		Collections.shuffle(this.nameList);
		this.currentChampion = new Champion(nameList.get(0));
	}
	
	@FXML private void pressQ(ActionEvent event) {
		System.out.print(currentChampion.name);
		try {
			currentChampion.playSound(currentChampion.qFilePath);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.print("Malformed URL");
			//e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			System.out.print("Bad audio file");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("IO Exception");
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			System.out.print("Line Unavailable");
			//e.printStackTrace();
		}
	}
	
	@FXML private void pressW(ActionEvent event) {
		System.out.print("W Pressed");
		try {
			System.out.print("Checking");
			currentChampion.playSound(currentChampion.wFilePath);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.print("Malformed URL");
			//e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			System.out.print("Bad audio file");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("IO Exception");
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			System.out.print("Line Unavailable");
			//e.printStackTrace();
		}
	}
	
	@FXML private void pressE(ActionEvent event) {
		try {
			currentChampion.playSound(currentChampion.eFilePath);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.print("Malformed URL");
			//e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			System.out.print("Bad audio file");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("IO Exception");
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			System.out.print("Line Unavailable");
			//e.printStackTrace();
		}
	}
	
	@FXML private void pressR(ActionEvent event) {
		try {
			currentChampion.playSound(currentChampion.rFilePath);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.print("Malformed URL");
			//e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			System.out.print("Bad audio file");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("IO Exception");
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			System.out.print("Line Unavailable");
			//e.printStackTrace();
		}
	}
	
	public void switchToScene1(ActionEvent event) throws IOException {
		nameList.remove(0);
		this.currentChampion.name = nameList.get(0);
		Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToScene2(ActionEvent event) throws IOException {
		if (checkGuess()) {
			Parent root = FXMLLoader.load(getClass().getResource("Victory.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}
	
	public boolean checkGuess() {
		if (currentChampion.name.equalsIgnoreCase(userGuess.getText())) {
			return true;
		} else {
			return false;
		}
	}

}
