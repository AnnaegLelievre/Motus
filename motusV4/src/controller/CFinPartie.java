package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import main.MainApp;

public class CFinPartie {

	Label lFinPartie = new Label();
	//@FXML Label scoreJ1;
	//@FXML Label scoreJ2;
	@FXML Button bBackMenu;
	@FXML Button bSaveScore;
	@FXML Button bValider;
	@FXML TextField setNom;
	
	MainApp mainApp;
	CJouer7 cJouer7;
	
	//String resultat;
	//String score1 = null;
	//String score2 = null;
	static boolean victoire;
	float points;
	float pointsSup;
	float compteur;
	
	Font font = new Font("Arial", 30);
	LocalDate localDate = LocalDate.now();
	
	void init() {
		initLabel();
		//scoreJ1.setText(score1);
		//scoreJ2.setText(score2);
		
	}
	
	public void initLabel() {
		if (cJouer7.victoire == true) {
			//resultat = "Victoire !!!";
			lFinPartie.setText("Victoire!!!");
			lFinPartie.setTextFill(Color.BLACK);
			lFinPartie.setFont(font);
		}else {lFinPartie.setText("Defaite...");
		lFinPartie.setTextFill(Color.BLACK);
		lFinPartie.setFont(font);}
		//lFinPartie.setText(resultat);
		
	}
	
	@FXML
	void backMenu() {
		if(victoire == true) {
			points += 10 + pointsSup;
			pointsSup = 0;
		}
		compteur += 1;
		
		MainApp.showViewMenu();
	}
	
	@FXML
	void endSave() {
		if(victoire == true) {
			points += 10 + pointsSup;
			pointsSup = 0;
		}
		compteur += 1;
		
		points = points / compteur;
		
		setNom.setVisible(true);
		bValider.setVisible(true);
	}
	
	@FXML
	void save() throws IOException {
		String nom = setNom.getText();
		//File monFichier = new File("ressources/" + nom + ".txt");
		
		System.out.println(localDate + " -> " + points);
		
		try {
			File monFichier = new File("ressources/" + nom + ".txt");
			if(monFichier.createNewFile()) {
				FileWriter file = new FileWriter(monFichier, true);
				BufferedWriter bw = new BufferedWriter(file);
				PrintWriter write = new PrintWriter(bw);
				write.println(localDate + " -> " + points);
				write.close();
			}else {
				FileWriter file = new FileWriter(monFichier, true);
				BufferedWriter bw = new BufferedWriter(file);
				PrintWriter write = new PrintWriter(bw);
				write.println(localDate + " -> " + points);
				write.close();
			}
		}catch(Exception e){System.out.println("Problème inconnu");
		}finally {
			bBackMenu.setVisible(false);
			bSaveScore.setVisible(false);
			bValider.setVisible(false);
		}
		
	}
	
}
