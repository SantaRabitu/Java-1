package lab;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.GraphicsContext;

public class World {

	
	private List<Drawable>worldObjects=new ArrayList<>();
    
    private Character player;
/*
    public World() {
       this. walls = new ArrayList<>();
       this.boxy=new ArrayList<>();    }

    // Inicializácia sveta (tvorba stien, postáv, atď.)
    public void initializeWorld() {
        // Načítaj steny
        for (int i = 0; i < 100; i++) {
            walls.add(new Wall(i * 50, i * 50));  // Príklad, generovanie stien
        }
        // Načítaj postavu
        player = new Boy("Johny", 100, 100);  // Príklad, vytvorenie postavy
        
        boxy.add(new Box(200, 200, 30));
    }

   
   
    // Získanie postavy
    public Character getPlayer() {
        return player;
    }

    // Vykreslenie sveta (steny, postavy, atď.)
    public void draw(GraphicsContext gc) {
        for (Wall wall : walls) {
            wall.draw(gc);  // Vykreslenie stien
        }
        player.draw(gc);  // Vykreslenie postavy
        
        for(Box box:boxy) {
        	box.draw(gc);
        }
    }*/
    
    public World() {
        this.player = new Boy("Johny", 100, 100);  // Príklad postavy
    }

    public void initializeWorld() {
        // Inicializujte objekty v svete
        // Príklad stien a postavy
        worldObjects.add(new Wall(0, 0));  // Príklad steny
        worldObjects.add(player);  // Pridajte postavu do sveta
    }

    public void draw(GraphicsContext gc) {
        // Vykreslite všetky objekty v svete
        for (Drawable object : worldObjects) {
            object.draw(gc);
        }
    }

    public Character getPlayer() {
        return player;
    }
}
