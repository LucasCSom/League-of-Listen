package application;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Champion {
	public String name, qFilePath, wFilePath, eFilePath, rFilePath;
	
	public Champion(String guessName) {
		this.name = guessName;
		this.qFilePath = "Sounds/" + guessName + "/" + guessName + " Q.wav";
		this.wFilePath = "Sounds/" + guessName + "/" + guessName + " W.wav";
		this.eFilePath = "Sounds/" + guessName + "/" + guessName + " E.wav";
		this.rFilePath = "Sounds/" + guessName + "/" + guessName + " R.wav";
	}
	
	public void playSound(String soundFile) throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
	    File f = new File(soundFile);
	    AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());  
	    Clip clip = AudioSystem.getClip();
	    clip.open(audioIn);
	    clip.start();
	}
}
