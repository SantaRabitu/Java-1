package lab;



import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;

public class DrawingThread extends AnimationTimer {

    private final Canvas canvas;
    private final GraphicsContext gc;
    private final World world;

    public DrawingThread(Canvas canvas, World world) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
        this.world = world;
    }

    @Override
    public void handle(long now) {
        // Vyčistíme plátno pred vykreslením
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // Vykreslíme svet (steny, postavy)
        world.draw(gc);

        // Tu môžeš pridať ďalšie animácie alebo logiku
    }
    
    public void keyPress(KeyEvent event) {
        switch (event.getCode()) {
            case LEFT:
                world.getPlayer().move(-1, 0);  // Pohyb doľava
                break;
            case RIGHT:
                world.getPlayer().move(1, 0);   // Pohyb doprava
                break;
            case UP:
                world.getPlayer().move(0, -1);  // Pohyb hore
                break;
            case DOWN:
                world.getPlayer().move(0, 1);   // Pohyb dole
                break;
        }
    }
}
