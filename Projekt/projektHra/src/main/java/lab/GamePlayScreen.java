package lab;

import javafx.scene.canvas.Canvas;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GamePlayScreen extends Screen {

    private Canvas canvas;
    private DrawingThread drawingThread;
    private World world;
    private Character selectedCharacter;
    public GamePlayScreen(Stage stage) {
        super(stage);
        this.selectedCharacter = selectedCharacter;
        loadWorld();  // Načítanie sveta pred spustením DrawingThread
        loadCanvas();
        startDrawingThread();
    }

    // Načítanie všetkých herných objektov
    private void loadWorld() {
        world = new World();  // Vytvorenie sveta (ktoré obsahuje objekty ako postavy, steny, atď.)
        world.initializeWorld();  // Inicializovanie sveta (tvorba stien, postáv)
       // world.setPlayer(selectedCharacter);
    }

    // Vytvorenie Canvas a priradenie ho do scény
    private void loadCanvas() {
        canvas = new Canvas(800, 600);  // Vytvoríme plátno s rozmermi 800x600
        Group root = new Group();  // Vytvoríme koreňový uzol
        root.getChildren().add(canvas);  // Pridáme Canvas do Group
        
        Scene scene = new Scene(root, 800, 600);  // Vytvárame scénu s týmto koreňom
        stage.setScene(scene);  // Nastavíme scénu na Stage
        stage.show();  // Zobrazíme okno
    }


    // Spustenie DrawingThread pre animácie
    private void startDrawingThread() {
        drawingThread = new DrawingThread(canvas,world);  // Vytvorte DrawingThread a odovzdajte svet
        drawingThread.start();  // Spustite DrawingThread
    }
}
