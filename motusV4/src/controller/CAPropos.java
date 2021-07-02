package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import main.MainApp;

public class CAPropos {

	public Button bMenu;
	
	MainApp mainApp;
	
	@FXML
	private void handleMenu() {
		mainApp.showViewMenu();
	}
	
}
