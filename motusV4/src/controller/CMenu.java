package controller;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import main.MainApp;

public class CMenu {
	
	@FXML public RadioButton unJoueur;
	@FXML public RadioButton deuxJoueurs;
	@FXML public RadioButton sept;
	@FXML public RadioButton huit;
	@FXML public RadioButton neuf;
	@FXML public RadioButton dix;
	
	@FXML private Button bJouer;
	@FXML private Button bAPropos;
	
	MainApp mainApp;
	CJouer7 cJouer7;
	
	static int nbJoueur = 1;
	
	public void init() {
		initButton();
	}
	
	public void initButton() {
		unJoueur.isSelected();
		sept.isSelected();
	}
	
	@FXML
	private void handleJouer() {
		letsMusic();
		
		if(sept.isSelected()) {
			mainApp.showViewJouer7();
		}
		if(huit.isSelected()) {
			mainApp.showViewJouer8();
		}
		if(neuf.isSelected()) {
			mainApp.showViewJouer9();
		}
		if(dix.isSelected()) {
			mainApp.showViewJouer10();
		}
	}
	
	@FXML
	private void handleAPropos() {
		mainApp.showViewAPropos();
	}
	
	@FXML
	public void clicSept() {
		huit.setSelected(false);
		neuf.setSelected(false);
		dix.setSelected(false);
	}
	
	@FXML
	public void clicHuit() {
		sept.setSelected(false);
		neuf.setSelected(false);
		dix.setSelected(false);
	}

	@FXML
	public void clicNeuf() {
		sept.setSelected(false);
		huit.setSelected(false);
		dix.setSelected(false);
	}

	@FXML
	public void clicDix() {
		sept.setSelected(false);
		huit.setSelected(false);
		neuf.setSelected(false);
	}
	
	@FXML
	public void clic1Joueur() {
		nbJoueur = 1;
		deuxJoueurs.setSelected(false);
	}
	
	@FXML
	public void clic2Joueurs() {
		nbJoueur = 2;
		unJoueur.setSelected(false);
	}
	
	public void letsMusic() {
		String musicFile = "ressources/Motus.mp3";
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
	}

}