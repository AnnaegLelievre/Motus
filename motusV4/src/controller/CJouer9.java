package controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import main.MainApp;

public class CJouer9 {
	@FXML private GridPane grid;
	@FXML private TextField tentativeFx;
	@FXML private Button bValider;
	@FXML public Button bFinPartie;
	@FXML public Button bCommencer;
	@FXML public Label reponse = new Label();
	
	CMenu cMenu;
	CFinPartie cFinPartie;
	MainApp mainApp;
	
	int nbJoueur;
	int compteur = 0;
	int nbLettre = 9;
	int numJoueur = 1;
	int ptsJ1 = 0;
	int ptsJ2 = 0;
	
	String tentative;
	String mot = "bonjouree";
	
	boolean victoire = false;
	
	Font font = new Font("Arial", 30);
	
	//LABELS	
	Label l00 = new Label();
	Label l10 = new Label();
	Label l20 = new Label();
	Label l30 = new Label();
	Label l40 = new Label();
	Label l50 = new Label();
	Label l60 = new Label();
	Label l70 = new Label();
	Label l80 = new Label();
	
	Label l01 = new Label();
	Label l11 = new Label();
	Label l21 = new Label();
	Label l31 = new Label();
	Label l41 = new Label();
	Label l51 = new Label();
	Label l61 = new Label();
	Label l71 = new Label();
	Label l81 = new Label();
	
	Label l02 = new Label();
	Label l12 = new Label();
	Label l22 = new Label();
	Label l32 = new Label();
	Label l42 = new Label();
	Label l52 = new Label();
	Label l62 = new Label();
	Label l72 = new Label();
	Label l82 = new Label();
	
	Label l03 = new Label();
	Label l13 = new Label();
	Label l23 = new Label();
	Label l33 = new Label();
	Label l43 = new Label();
	Label l53 = new Label();
	Label l63 = new Label();
	Label l73 = new Label();
	Label l83 = new Label();
	
	Label l04 = new Label();
	Label l14 = new Label();
	Label l24 = new Label();
	Label l34 = new Label();
	Label l44 = new Label();
	Label l54 = new Label();
	Label l64 = new Label();
	Label l74 = new Label();
	Label l84 = new Label();
	
	Label l05 = new Label();
	Label l15 = new Label();
	Label l25 = new Label();
	Label l35 = new Label();
	Label l45 = new Label();
	Label l55 = new Label();
	Label l65 = new Label();
	Label l75 = new Label();
	Label l85 = new Label();
	
	Label l0Adverse = new Label();
	Label l1Adverse = new Label();
	Label l2Adverse = new Label();
	Label l3Adverse = new Label();
	Label l4Adverse = new Label();
	Label l5Adverse = new Label();
	Label l6Adverse = new Label();
	Label l7Adverse = new Label();
	Label l8Adverse = new Label();
	
	@FXML
	public void init() throws Exception {
		initMot();
		initNbJoueur();
		initReponse();
		initPremiereLettre();
		bValider.setDisable(false);
		bCommencer.setDisable(true);
		letsMusic();
	}
	
	public void initMot() throws Exception {
		int index;
		
		Path path = Paths.get("ressources/BDD_Motus9.csv");
		
		Random random = new Random();
		index = random.nextInt(49);
		
		List<String> lignes = Files.readAllLines(path);
	
		mot = lignes.get(index);
		System.out.println(mot);
	}
	
	public void initReponse() {
		reponse.setText(mot);
		reponse.setTextFill(Color.DARKGREY);
		reponse.setFont(font);
		reponse.setVisible(false);
	}
	
	public void initNbJoueur() {
		nbJoueur = CMenu.nbJoueur;
	}
	
	public void initPremiereLettre() {
		l00.setText(mot.substring(0, 1));
		l01.setText(mot.substring(0, 1));
		l02.setText(mot.substring(0, 1));
		l03.setText(mot.substring(0, 1));
		l04.setText(mot.substring(0, 1));
		l05.setText(mot.substring(0, 1));
		
		l00.setTextFill(Color.WHITE);
		l01.setTextFill(Color.WHITE);
		l02.setTextFill(Color.WHITE);
		l03.setTextFill(Color.WHITE);
		l04.setTextFill(Color.WHITE);
		l05.setTextFill(Color.WHITE);
		
		l00.setFont(font);
		l01.setFont(font);
		l02.setFont(font);
		l03.setFont(font);
		l04.setFont(font);
		l05.setFont(font);
		
		grid.add(l00, 0, 0);
		grid.add(l01, 0, 1);
		grid.add(l02, 0, 2);
		grid.add(l03, 0, 3);
		grid.add(l04, 0, 4);
		grid.add(l05, 0, 5);		
	}
	
	public void letsMusic() {
		String musicFile = "ressources/Motus.mp3";
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
	}
	
	//ENTRER LE MOT DANS TENTATIVE
	@FXML
	public void setMot() {
		switch (compteur) {
			case 0:
				tentative = tentativeFx.getText();
				try {
					l00.setText(tentativeFx.getText().substring(0, 1));
					l10.setText(tentativeFx.getText().substring(1, 2));
					l20.setText(tentativeFx.getText().substring(2, 3));
					l30.setText(tentativeFx.getText().substring(3, 4));
					l40.setText(tentativeFx.getText().substring(4, 5));
					l50.setText(tentativeFx.getText().substring(5, 6));
					l60.setText(tentativeFx.getText().substring(6, 7));
					l70.setText(tentativeFx.getText().substring(7, 8));
					l80.setText(tentativeFx.getText().substring(8, 9));

					l00.setTextFill(Color.WHITE);
					l10.setTextFill(Color.WHITE);
					l20.setTextFill(Color.WHITE);
					l30.setTextFill(Color.WHITE);
					l40.setTextFill(Color.WHITE);
					l50.setTextFill(Color.WHITE);
					l60.setTextFill(Color.WHITE);
					l70.setTextFill(Color.WHITE);
					l80.setTextFill(Color.WHITE);
					
					l00.setFont(font);
					l10.setFont(font);
					l20.setFont(font);
					l30.setFont(font);
					l40.setFont(font);
					l50.setFont(font);
					l60.setFont(font);
					l70.setFont(font);
					l80.setFont(font);
					
					grid.add(l10, 1, compteur);
					grid.add(l20, 2, compteur);
					grid.add(l30, 3, compteur);
					grid.add(l40, 4, compteur);
					grid.add(l50, 5, compteur);
					grid.add(l60, 6, compteur);
					grid.add(l70, 7, compteur);
					grid.add(l80, 8, compteur);
					
					compteur++;
					verifieMot();
					break;
				}catch(Exception e) {
					compteur = 8;
					break;
				}

			case 1:
				tentative = tentativeFx.getText();
				try {
					l01.setText(tentativeFx.getText().substring(0, 1));
					l11.setText(tentativeFx.getText().substring(1, 2));
					l21.setText(tentativeFx.getText().substring(2, 3));
					l31.setText(tentativeFx.getText().substring(3, 4));
					l41.setText(tentativeFx.getText().substring(4, 5));
					l51.setText(tentativeFx.getText().substring(5, 6));
					l61.setText(tentativeFx.getText().substring(6, 7));
					l71.setText(tentativeFx.getText().substring(7, 8));
					l81.setText(tentativeFx.getText().substring(8, 9));

					l01.setTextFill(Color.WHITE);
					l11.setTextFill(Color.WHITE);
					l21.setTextFill(Color.WHITE);
					l31.setTextFill(Color.WHITE);
					l41.setTextFill(Color.WHITE);
					l51.setTextFill(Color.WHITE);
					l61.setTextFill(Color.WHITE);
					l71.setTextFill(Color.WHITE);
					l81.setTextFill(Color.WHITE);
					
					l01.setFont(font);
					l11.setFont(font);
					l21.setFont(font);
					l31.setFont(font);
					l41.setFont(font);
					l51.setFont(font);
					l61.setFont(font);
					l71.setFont(font);
					l81.setFont(font);
					
					grid.add(l11, 1, compteur);
					grid.add(l21, 2, compteur);
					grid.add(l31, 3, compteur);
					grid.add(l41, 4, compteur);
					grid.add(l51, 5, compteur);
					grid.add(l61, 6, compteur);
					grid.add(l71, 7, compteur);
					grid.add(l81, 8, compteur);
					
					compteur++;
					verifieMot();
					break;
				}catch (Exception e){
					compteur = 8;
					break;
				}
				
			case 2:
				tentative = tentativeFx.getText();
				try {
					l02.setText(tentativeFx.getText().substring(0, 1));
					l12.setText(tentativeFx.getText().substring(1, 2));
					l22.setText(tentativeFx.getText().substring(2, 3));
					l32.setText(tentativeFx.getText().substring(3, 4));
					l42.setText(tentativeFx.getText().substring(4, 5));
					l52.setText(tentativeFx.getText().substring(5, 6));
					l62.setText(tentativeFx.getText().substring(6, 7));
					l72.setText(tentativeFx.getText().substring(7, 8));
					l82.setText(tentativeFx.getText().substring(8, 9));

					l02.setTextFill(Color.WHITE);
					l12.setTextFill(Color.WHITE);
					l22.setTextFill(Color.WHITE);
					l32.setTextFill(Color.WHITE);
					l42.setTextFill(Color.WHITE);
					l52.setTextFill(Color.WHITE);
					l62.setTextFill(Color.WHITE);
					l72.setTextFill(Color.WHITE);
					l82.setTextFill(Color.WHITE);
					
					l02.setFont(font);
					l12.setFont(font);
					l22.setFont(font);
					l32.setFont(font);
					l42.setFont(font);
					l52.setFont(font);
					l62.setFont(font);
					l72.setFont(font);
					l82.setFont(font);
					
					grid.add(l12, 1, compteur);
					grid.add(l22, 2, compteur);
					grid.add(l32, 3, compteur);
					grid.add(l42, 4, compteur);
					grid.add(l52, 5, compteur);
					grid.add(l62, 6, compteur);
					grid.add(l72, 7, compteur);
					grid.add(l82, 8, compteur);
				
					compteur++;
					verifieMot();
					break;
				}catch (Exception e) {
					compteur = 8;
					break;
				}

			case 3:
				tentative = tentativeFx.getText();
				try {
					l03.setText(tentativeFx.getText().substring(0, 1));
					l13.setText(tentativeFx.getText().substring(1, 2));
					l23.setText(tentativeFx.getText().substring(2, 3));
					l33.setText(tentativeFx.getText().substring(3, 4));
					l43.setText(tentativeFx.getText().substring(4, 5));
					l53.setText(tentativeFx.getText().substring(5, 6));
					l63.setText(tentativeFx.getText().substring(6, 7));
					l73.setText(tentativeFx.getText().substring(7, 8));
					l83.setText(tentativeFx.getText().substring(8, 9));

					l03.setTextFill(Color.WHITE);
					l13.setTextFill(Color.WHITE);
					l23.setTextFill(Color.WHITE);
					l33.setTextFill(Color.WHITE);
					l43.setTextFill(Color.WHITE);
					l53.setTextFill(Color.WHITE);
					l63.setTextFill(Color.WHITE);
					l73.setTextFill(Color.WHITE);
					l83.setTextFill(Color.WHITE);
					
					l03.setFont(font);
					l13.setFont(font);
					l23.setFont(font);
					l33.setFont(font);
					l43.setFont(font);
					l53.setFont(font);
					l63.setFont(font);
					l73.setFont(font);
					l83.setFont(font);
					
					grid.add(l13, 1, compteur);
					grid.add(l23, 2, compteur);
					grid.add(l33, 3, compteur);
					grid.add(l43, 4, compteur);
					grid.add(l53, 5, compteur);
					grid.add(l63, 6, compteur);
					grid.add(l73, 7, compteur);
					grid.add(l83, 8, compteur);
					
					compteur++;
					verifieMot();
					break;
				}catch (Exception e) {
					compteur = 8;
					break;
				}
				
			case 4:
				tentative = tentativeFx.getText();
				try {
					l04.setText(tentativeFx.getText().substring(0, 1));
					l14.setText(tentativeFx.getText().substring(1, 2));
					l24.setText(tentativeFx.getText().substring(2, 3));
					l34.setText(tentativeFx.getText().substring(3, 4));
					l44.setText(tentativeFx.getText().substring(4, 5));
					l54.setText(tentativeFx.getText().substring(5, 6));
					l64.setText(tentativeFx.getText().substring(6, 7));
					l74.setText(tentativeFx.getText().substring(7, 8));
					l84.setText(tentativeFx.getText().substring(8, 9));

					l04.setTextFill(Color.WHITE);
					l14.setTextFill(Color.WHITE);
					l24.setTextFill(Color.WHITE);
					l34.setTextFill(Color.WHITE);
					l44.setTextFill(Color.WHITE);
					l54.setTextFill(Color.WHITE);
					l64.setTextFill(Color.WHITE);
					l74.setTextFill(Color.WHITE);
					l84.setTextFill(Color.WHITE);
					
					l04.setFont(font);
					l14.setFont(font);
					l24.setFont(font);
					l34.setFont(font);
					l44.setFont(font);
					l54.setFont(font);
					l64.setFont(font);
					l74.setFont(font);
					l84.setFont(font);
					
					grid.add(l14, 1, compteur);
					grid.add(l24, 2, compteur);
					grid.add(l34, 3, compteur);
					grid.add(l44, 4, compteur);
					grid.add(l54, 5, compteur);
					grid.add(l64, 6, compteur);
					grid.add(l74, 7, compteur);
					grid.add(l84, 8, compteur);
					
					compteur++;
					verifieMot();
					break;
				}catch (Exception e) {
					compteur = 8;
					break;
				}
				
			case 5:
				tentative = tentativeFx.getText();
				try {
					l05.setText(tentativeFx.getText().substring(0, 1));
					l15.setText(tentativeFx.getText().substring(1, 2));
					l25.setText(tentativeFx.getText().substring(2, 3));
					l35.setText(tentativeFx.getText().substring(3, 4));
					l45.setText(tentativeFx.getText().substring(4, 5));
					l55.setText(tentativeFx.getText().substring(5, 6));
					l65.setText(tentativeFx.getText().substring(6, 7));
					l75.setText(tentativeFx.getText().substring(7, 8));
					l85.setText(tentativeFx.getText().substring(8, 9));

					l05.setTextFill(Color.WHITE);
					l15.setTextFill(Color.WHITE);
					l25.setTextFill(Color.WHITE);
					l35.setTextFill(Color.WHITE);
					l45.setTextFill(Color.WHITE);
					l55.setTextFill(Color.WHITE);
					l65.setTextFill(Color.WHITE);
					l75.setTextFill(Color.WHITE);
					l85.setTextFill(Color.WHITE);
					
					l05.setFont(font);
					l15.setFont(font);
					l25.setFont(font);
					l35.setFont(font);
					l45.setFont(font);
					l55.setFont(font);
					l65.setFont(font);
					l75.setFont(font);
					l85.setFont(font);
					
					grid.add(l15, 1, compteur);
					grid.add(l25, 2, compteur);
					grid.add(l35, 3, compteur);
					grid.add(l45, 4, compteur);
					grid.add(l55, 5, compteur);
					grid.add(l65, 6, compteur);
					grid.add(l75, 7, compteur);
					grid.add(l85, 8, compteur);
					
					compteur++;
					verifieMot();
					break;
				}catch (Exception e) {
					compteur = 8;
					break;
				}	
		}
		tentativeFx.clear();
		
		if(compteur == 8) {
			if(nbJoueur == 2) {
				setMotAdverse();
			}else {
				bValider.setVisible(false);
				reponse.setVisible(true);
			}
		}
	}
	
	public void setMotAdverse() {
		tentativeFx.clear();
		
		tentative = tentativeFx.getText();
		if(tentative.length() == 7) {
			l0Adverse.setText(tentativeFx.getText().substring(0, 1));
			l1Adverse.setText(tentativeFx.getText().substring(1, 2));
			l2Adverse.setText(tentativeFx.getText().substring(2, 3));
			l3Adverse.setText(tentativeFx.getText().substring(3, 4));
			l4Adverse.setText(tentativeFx.getText().substring(4, 5));
			l5Adverse.setText(tentativeFx.getText().substring(5, 6));
			l6Adverse.setText(tentativeFx.getText().substring(6, 7));
			l7Adverse.setText(tentativeFx.getText().substring(7, 8));
			l8Adverse.setText(tentativeFx.getText().substring(8, 9));
			
			compteur++;
			verifieMot();
		}else {compteur = 8;}
		tentativeFx.clear();
		bValider.setVisible(false);
		reponse.setVisible(true);
	}

	
	public void verifieMot() {
		victoire = true;
		boolean mauvaisePlace = false;
		boolean stopBoucle = false;
		
		//BOUCLE DE TAILLE NB LETTRES
		for (int i = 0; i < nbLettre; i++) {
			mauvaisePlace = false;
			stopBoucle = false;
			
			if (tentativeFx.getText().substring(i, i+1).equals(mot.substring(i, i+1))) {
				System.out.println("Lettre -> OK");
				couleurLabel(compteur, i, "bon");
			}else {
				for(int j = 0; j < nbLettre; j++) {
					if (tentativeFx.getText().substring(i, i+1).equals(mot.substring(j, j+1))) {
						mauvaisePlace = true;
						victoire = false;
						
						if(stopBoucle == false) {
							System.out.println("Lettre -> Mauvaise place");
							couleurLabel(compteur, i, "place");
						}
						stopBoucle = true;
					}
				}
				if (mauvaisePlace == false) {
					couleurLabel(compteur, i, "faux");
					victoire = false;
				}
			}
		}
		if(victoire == true) {
			System.out.println("VICTOIRE !!!");
			reponse.setVisible(true);
			compteur = 8;
			bValider.setVisible(false);
			if (nbJoueur == 2) {
				if(numJoueur == 1) {ptsJ1 += 50;
				}else {ptsJ2 += 50;}
			}
			
			
		}
		if(compteur >= 6 && victoire == false) {
			if(nbJoueur == 1) {
				System.out.println("Défaite ...");
				reponse.setVisible(true);
				bValider.setVisible(false);
				compteur = 8;
			}if (nbJoueur == 2) {
				setMotAdverse();
			}
		}
	}
	
	@FXML
	void handleFinPartie() {	
		letsMusic();
		mainApp.showViewFinPartie();
	}
	
	void couleurLabel(int compteur, int colonne, String typeErreur) {
		switch (compteur) {
		case 1:
			switch(colonne) {
			case 0:
				if(typeErreur == "bon") {l00.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l00.setStyle("-fx-background-color: yellow;");
					l00.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l00.setStyle("-fx-background-color: red;");}
				break;
				
			case 1:
				if(typeErreur == "bon") {l10.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l10.setStyle("-fx-background-color: yellow;");
				l10.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l10.setStyle("-fx-background-color: red;");}
				break;
			
			case 2:
				if(typeErreur == "bon") {l20.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l20.setStyle("-fx-background-color: yellow;");
				l20.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l20.setStyle("-fx-background-color: red;");}
				break;
			
			case 3:
				if(typeErreur == "bon") {l30.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l30.setStyle("-fx-background-color: yellow;");
				l30.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l30.setStyle("-fx-background-color: red;");}
				break;
			
			case 4:
				if(typeErreur == "bon") {l40.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l40.setStyle("-fx-background-color: yellow;");
				l40.setTextFill(Color.BLACK);}
				if(typeErreur == "faux"){l40.setStyle("-fx-background-color: red;");}
				break;
			
			case 5:
				if(typeErreur == "bon") {l50.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l50.setStyle("-fx-background-color: yellow;");
				l50.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l50.setStyle("-fx-background-color: red;");}
				break;
			
			case 6:
				if(typeErreur == "bon") {l60.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l60.setStyle("-fx-background-color: yellow;");
				l60.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l60.setStyle("-fx-background-color: red;");}
				break;
				
			case 7:
				if(typeErreur == "bon") {l70.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l70.setStyle("-fx-background-color: yellow;");
				l70.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l70.setStyle("-fx-background-color: red;");}
				break;
				
			case 8:
				if(typeErreur == "bon") {l80.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l80.setStyle("-fx-background-color: yellow;");
					l80.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l80.setStyle("-fx-background-color: red;");}
				break;	
			}
		case 2:
			switch(colonne) {
			case 0:
				if(typeErreur == "bon") {l01.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l01.setStyle("-fx-background-color: yellow;");
					l01.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l01.setStyle("-fx-background-color: red;");}
				break;
				
			case 1:
				if(typeErreur == "bon") {l11.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l11.setStyle("-fx-background-color: yellow;");
				l11.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l11.setStyle("-fx-background-color: red;");}
				break;
			
			case 2:
				if(typeErreur == "bon") {l21.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l21.setStyle("-fx-background-color: yellow;");
				l21.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l21.setStyle("-fx-background-color: red;");}
				break;
			
			case 3:
				if(typeErreur == "bon") {l31.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l31.setStyle("-fx-background-color: yellow;");
				l31.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l31.setStyle("-fx-background-color: red;");}
				break;
			
			case 4:
				if(typeErreur == "bon") {l41.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l41.setStyle("-fx-background-color: yellow;");
				l41.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l41.setStyle("-fx-background-color: red;");}
				break;
			
			case 5:
				if(typeErreur == "bon") {l51.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l51.setStyle("-fx-background-color: yellow;");
				l51.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l51.setStyle("-fx-background-color: red;");}
				break;
			
			case 6:
				if(typeErreur == "bon") {l61.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l61.setStyle("-fx-background-color: yellow;");
				l61.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l61.setStyle("-fx-background-color: red;");}
				break;
				
			case 7:
				if(typeErreur == "bon") {l71.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l71.setStyle("-fx-background-color: yellow;");
				l71.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l71.setStyle("-fx-background-color: red;");}
				break;	
				
			case 8:
				if(typeErreur == "bon") {l81.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l81.setStyle("-fx-background-color: yellow;");
					l81.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l81.setStyle("-fx-background-color: red;");}
				break;		
			}
		case 3:
			switch(colonne) {
			case 0:
				if(typeErreur == "bon") {l02.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l02.setStyle("-fx-background-color: yellow;");
					l02.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l02.setStyle("-fx-background-color: red;");}
				break;
				
			case 1:
				if(typeErreur == "bon") {l12.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l12.setStyle("-fx-background-color: yellow;");
				l12.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l12.setStyle("-fx-background-color: red;");}
				break;
			
			case 2:
				if(typeErreur == "bon") {l22.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l22.setStyle("-fx-background-color: yellow;");
				l22.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l22.setStyle("-fx-background-color: red;");}
				break;
			
			case 3:
				if(typeErreur == "bon") {l32.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l32.setStyle("-fx-background-color: yellow;");
				l32.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l32.setStyle("-fx-background-color: red;");}
				break;
			
			case 4:
				if(typeErreur == "bon") {l42.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l42.setStyle("-fx-background-color: yellow;");
				l42.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l42.setStyle("-fx-background-color: red;");}
				break;
			
			case 5:
				if(typeErreur == "bon") {l52.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l52.setStyle("-fx-background-color: yellow;");
				l52.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l52.setStyle("-fx-background-color: red;");}
				break;
			
			case 6:
				if(typeErreur == "bon") {l62.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l62.setStyle("-fx-background-color: yellow;");
				l62.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l62.setStyle("-fx-background-color: red;");}
				break;
				
			case 7:
				if(typeErreur == "bon") {l72.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l72.setStyle("-fx-background-color: yellow;");
				l72.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l72.setStyle("-fx-background-color: red;");}
				break;	
				
			case 8:
				if(typeErreur == "bon") {l82.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l82.setStyle("-fx-background-color: yellow;");
					l82.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l82.setStyle("-fx-background-color: red;");}
				break;		
			}
		case 4:
			switch(colonne) {
			case 0:
				if(typeErreur == "bon") {l03.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l03.setStyle("-fx-background-color: yellow;");
					l03.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l03.setStyle("-fx-background-color: red;");}
				break;
				
			case 1:
				if(typeErreur == "bon") {l13.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l13.setStyle("-fx-background-color: yellow;");
				l13.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l13.setStyle("-fx-background-color: red;");}
				break;
			
			case 2:
				if(typeErreur == "bon") {l23.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l23.setStyle("-fx-background-color: yellow;");
				l23.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l23.setStyle("-fx-background-color: red;");}
				break;
			
			case 3:
				if(typeErreur == "bon") {l33.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l33.setStyle("-fx-background-color: yellow;");
				l33.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l33.setStyle("-fx-background-color: red;");}
				break;
			
			case 4:
				if(typeErreur == "bon") {l43.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l43.setStyle("-fx-background-color: yellow;");
				l43.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l43.setStyle("-fx-background-color: red;");}
				break;
			
			case 5:
				if(typeErreur == "bon") {l53.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l53.setStyle("-fx-background-color: yellow;");
				l53.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l53.setStyle("-fx-background-color: red;");}
				break;
			
			case 6:
				if(typeErreur == "bon") {l63.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l63.setStyle("-fx-background-color: yellow;");
				l63.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l63.setStyle("-fx-background-color: red;");}
				break;
				
			case 7:
				if(typeErreur == "bon") {l73.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l73.setStyle("-fx-background-color: yellow;");
				l73.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l73.setStyle("-fx-background-color: red;");}
				break;	
				
			case 8:
				if(typeErreur == "bon") {l83.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l83.setStyle("-fx-background-color: yellow;");
					l83.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l83.setStyle("-fx-background-color: red;");}
				break;		
			}
		case 5:
			switch(colonne) {
			case 0:
				if(typeErreur == "bon") {l04.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l04.setStyle("-fx-background-color: yellow;");
					l04.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l04.setStyle("-fx-background-color: red;");}
				break;
				
			case 1:
				if(typeErreur == "bon") {l14.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l14.setStyle("-fx-background-color: yellow;");
				l14.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l14.setStyle("-fx-background-color: red;");}
				break;
			
			case 2:
				if(typeErreur == "bon") {l24.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l24.setStyle("-fx-background-color: yellow;");
				l24.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l24.setStyle("-fx-background-color: red;");}
				break;
			
			case 3:
				if(typeErreur == "bon") {l34.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l34.setStyle("-fx-background-color: yellow;");
				l34.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l34.setStyle("-fx-background-color: red;");}
				break;
			
			case 4:
				if(typeErreur == "bon") {l44.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l44.setStyle("-fx-background-color: yellow;");
				l44.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l44.setStyle("-fx-background-color: red;");}
				break;
			
			case 5:
				if(typeErreur == "bon") {l54.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l54.setStyle("-fx-background-color: yellow;");
				l54.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l54.setStyle("-fx-background-color: red;");}
				break;
			
			case 6:
				if(typeErreur == "bon") {l64.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l64.setStyle("-fx-background-color: yellow;");
				l60.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l64.setStyle("-fx-background-color: red;");}
				break;
				
			case 7:
				if(typeErreur == "bon") {l74.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l74.setStyle("-fx-background-color: yellow;");
				l74.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l74.setStyle("-fx-background-color: red;");}
				break;	
				
			case 8:
				if(typeErreur == "bon") {l84.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l84.setStyle("-fx-background-color: yellow;");
					l84.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l84.setStyle("-fx-background-color: red;");}
				break;		
			}
		case 6:
			switch(colonne) {
			case 0:
				if(typeErreur == "bon") {l05.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l05.setStyle("-fx-background-color: yellow;");
					l05.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l05.setStyle("-fx-background-color: red;");}
				break;
				
			case 1:
				if(typeErreur == "bon") {l15.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l15.setStyle("-fx-background-color: yellow;");
				l15.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l15.setStyle("-fx-background-color: red;");}
				break;
			
			case 2:
				if(typeErreur == "bon") {l25.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l25.setStyle("-fx-background-color: yellow;");
				l25.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l25.setStyle("-fx-background-color: red;");}
				break;
			
			case 3:
				if(typeErreur == "bon") {l35.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l35.setStyle("-fx-background-color: yellow;");
				l35.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l35.setStyle("-fx-background-color: red;");}
				break;
			
			case 4:
				if(typeErreur == "bon") {l45.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l45.setStyle("-fx-background-color: yellow;");
				l45.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l45.setStyle("-fx-background-color: red;");}
				break;
			
			case 5:
				if(typeErreur == "bon") {l55.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l55.setStyle("-fx-background-color: yellow;");
				l55.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l55.setStyle("-fx-background-color: red;");}
				break;
			
			case 6:
				if(typeErreur == "bon") {l65.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l65.setStyle("-fx-background-color: yellow;");
				l65.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l65.setStyle("-fx-background-color: red;");}
				break;
				
			case 7:
				if(typeErreur == "bon") {l75.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l75.setStyle("-fx-background-color: yellow;");
				l75.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l75.setStyle("-fx-background-color: red;");}
				break;	
				
			case 8:
				if(typeErreur == "bon") {l85.setStyle("-fx-background-color: blue;");}
				if(typeErreur == "place") {l85.setStyle("-fx-background-color: yellow;");
					l85.setTextFill(Color.BLACK);}
				if(typeErreur == "faux") {l85.setStyle("-fx-background-color: red;");}
				break;		
			}
		}
	}

}
