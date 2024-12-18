package lab;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class SettingsScreen extends MainMenuScreen {

	
	 public SettingsScreen(Stage stage) {
		super(stage);
		loadFXML();
		// TODO Auto-generated constructor stub
	}
	 
	 public  SettingsScreen() {

			super(null);
			loadFXML();
			
		}

	 
	 private void loadFXML() {
	        try {
	            FXMLLoader loader = new FXMLLoader(getClass().getResource("Settings.fxml"));
	          
	            
	            loader.setController(this);
	            Parent root = loader.load();
	            
	            scene = new Scene(root);
	           
	          

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	@FXML
	    private Button characterButton;

	    @FXML
	    private Button soundsButton;
	    
	    @FXML
	    private Button menuButton1;
	    
	    
@FXML
	   private void setCharButton() {
		 try {  
		   SetCharController sCh=new SetCharController(stage);
		   sCh.loadFXML();
		   sCh.show();
	   }catch (Exception e) {
		// TODO: handle exception
		   e.printStackTrace();
	}
}

@FXML
	   private void enableSoundsButton() {
		   
		   Sounds s = new Sounds();
		   s.toggleSounds();
	   }
@FXML
	   private void backToMenuButton() {
		   
		   MainMenuScreen mainMenu = new MainMenuScreen(stage);
		   mainMenu.show();
	   }

}
