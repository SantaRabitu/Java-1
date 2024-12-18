package lab;
import java.io.IOException;
import java.lang.reflect.Parameter;

//hlavne menu hry
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class MainMenuScreen extends Screen{

	

	    public MainMenuScreen(Stage stage) {
		super(stage);
		loadFXML();
		// TODO Auto-generated constructor stub
	}
	    private void loadFXML() {
	        try {
	            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
	           // loader.setController(this);
	            Parent root = loader.load();
	            MainMenuController controller = loader.getController();
	            controller.setStage(stage);
	            scene = new Scene(root);


	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

		

	}


