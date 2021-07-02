package main;

import java.io.IOException;

import controller.CAPropos;
import controller.CFinPartie;
import controller.CJouer10;
import controller.CJouer7;
import controller.CJouer8;
import controller.CJouer9;
import controller.CMenu;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application{
	private static Stage primaryStage;
	private static AnchorPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Motus");
		
		initRootLayout();		
	}
	
	//Initialise root layout
	public void initRootLayout() {
		try {
			//Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(CMenu.class.getResource("/view/Menu.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			//Show the scene containing the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}
	
	//Return the main stage
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	//VIEW JOUER 7
	public static void showViewJouer7() {
		try {
			//Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(CJouer7.class.getResource("/view/Jouer7.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			//Show the scene containing the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}
	
	//VIEW JOUER 8
	public static void showViewJouer8() {
		try {
			//Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(CJouer8.class.getResource("/view/Jouer8.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			//Show the scene containing the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}
		
	//VIEW JOUER 9
	public static void showViewJouer9() {
		try {
			//Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(CJouer9.class.getResource("/view/Jouer9.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			//Show the scene containing the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}
	
	//VIEW JOUER 10
	public static void showViewJouer10() {
		try {
			//Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(CJouer10.class.getResource("/view/Jouer10.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			//Show the scene containing the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}
	
	//VIEW FIN PARTIE
	public static void showViewFinPartie() {
		try {
			//Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(CFinPartie.class.getResource("/view/FinPartie.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			//Show the scene containing the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();	
		} 
	}
	
	//VIEW A PROPOS
	public static void showViewAPropos() {
		try {
			//Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(CAPropos.class.getResource("/view/APropos.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			//Show the scene containing the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}
	
	//VIEW MENU
	public static void showViewMenu() {
		try {
			//Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(CMenu.class.getResource("/view/Menu.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			//Show the scene containing the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}
}
