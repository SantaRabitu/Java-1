package lab;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Screen {
	
	 protected Stage stage;
	    protected Scene scene;

	    public Screen(Stage stage) {
	        this.stage = stage;
	    }

	    public void show() {
	        stage.setScene(scene);
	        stage.show();
	    }

}
