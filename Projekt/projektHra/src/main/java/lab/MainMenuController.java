package lab;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController {

	
	@FXML
    private Button exitButton;
    @FXML
    private Button playButton;

    @FXML
    private Button settingsButton;

    private Stage stage;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
    @FXML
    private void handlePlayButton() {
       
      GamePlayScreen gP=new GamePlayScreen(stage);
      gP.show();
    }

    @FXML
    private void handleSettingsButton() {
        // Prechod na nastavenia
        SettingsScreen settingsScreen = new SettingsScreen(stage);
        settingsScreen.show();
    }
    @FXML
    private void handleExitButton() {
        
        System.exit(0);
    }
   
}
