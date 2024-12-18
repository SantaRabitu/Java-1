package lab;

import javafx.scene.canvas.GraphicsContext;

public class Wall extends Dlazdica implements Intersects ,Drawable{
	
	public Wall(double x,double y) {
		
		super(x,y,"stena.png");
		
		this.walkable=false;
	}
	public void draw(GraphicsContext gc) {
		gc.drawImage(getTextura(),getX(),getY(),getWidth(),getHeight());
	}

}
