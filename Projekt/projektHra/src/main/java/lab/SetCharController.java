package lab;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SetCharController {

    private Stage stage; // Stage pre aktuálnu obrazovku
    private Scene scene;
    //private String selectedCharacter;

    private Character selectedCharacter;

    public SetCharController(Stage stage) {
        this.stage = stage; // Inicializujeme stage
        loadFXML();
    }

    // Po kliknutí na tlačidlo "Chlapec"
    @FXML
    private void selectBoy(MouseEvent event) {
        selectedCharacter = new Boy("Johny", 100, 100); // Vytvoríme postavu
        System.out.println("Chlapec vybraný.");
        startGame();
    }

    // Po kliknutí na tlačidlo "Dievča"
    @FXML
    private void selectGirl(MouseEvent event) {
        selectedCharacter = new Girl("Violet", 100, 100); // Vytvoríme postavu
        System.out.println("Dievča vybrané.");
        startGame();
    }

    // Spustenie hry po výbere postavy
    private void startGame() {
        // Tu spustíme hernú obrazovku a odovzdáme vybranú postavu
        GamePlayScreen gamePlayScreen = new GamePlayScreen(stage);
        gamePlayScreen.show();
    }

    // Metóda pre načítanie FXML
    public void loadFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SetCharacter.fxml"));
            loader.setController(this);
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Zobrazenie obrazovky
    public void show() {
    	stage.setScene(scene);
        stage.show();
    }
}
