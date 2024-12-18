 package lab;
/*
import javafx.animation.AnimationTimer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.input.KeyEvent;
*/
 //  Class <b>App</b> - extends class Application and it is an entry point of the program
 //@author     Java I
 /*
public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	private Canvas canvas;
	private AnimationTimer timer;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
            Scene scene = new Scene(loader.load());
			//Construct a main window with a canvas.  
			Group root = new Group();
			canvas = new Canvas(800, 400);
			root.getChildren().add(canvas);
			//Scene scene = new Scene(root, 800, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.resizableProperty().set(false);
			primaryStage.setTitle("Java 1 - 1th laboratory");
			primaryStage.show();
			
			DrawingThread drawingThread = new DrawingThread(canvas);
			
			
			scene.setOnKeyPressed(drawingThread::keyPress);
			scene.setOnKeyReleased(drawingThread::handleKeyRelease);
			//Exit program when main window is closed
			primaryStage.setOnCloseRequest(this::exitProgram);
			timer = drawingThread;

			timer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void stop() throws Exception {
		timer.stop();
		super.stop();
	}
	
	private void exitProgram(WindowEvent evt) {
		System.exit(0);
	}
}

*/
/*

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    private Canvas canvas;
	private DrawingThread drawingThread;
    @Override
    public void start(Stage primaryStage) {
        try {
            // Načítanie úvodnej obrazovky cez FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
           // Scene scene = new Scene(loader.load());
            Scene scene = new Scene(loader.load());
			//Construct a main window with a canvas.  
			Group root = new Group();
			canvas = new Canvas(800, 400);
			root.getChildren().add(canvas);
			//Scene scene = new Scene(root, 800, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.resizableProperty().set(false);
            
            primaryStage.setTitle("SOKOBAN");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
            
            MainMenuController controller = loader.getController();
            controller.setStage(primaryStage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() throws Exception {
    	
    	 if (drawingThread != null) {
             drawingThread.stop(); 
         }
        super.stop();
    }

    private void exitProgram(WindowEvent evt) {
        System.exit(0);
    }
}
*/



import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);  // Spustí aplikáciu
    }

    @Override
    public void start(Stage primaryStage) {
        try {
        	
            // Načítanie FXML pre hlavné menu (Main Menu)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
            Scene scene = new Scene(loader.load());
            
            // Získame kontrolér z FXML a nastavíme stage
            MainMenuController controller = loader.getController();
            controller.setStage(primaryStage);  // Nastavíme Stage pre kontrolér
            
            // Nastavíme scénu a zobrazíme okno
            primaryStage.setTitle("SOKOBAN");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() throws Exception {
    	
        super.stop();
        
  
        
        
    }
}



