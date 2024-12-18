package lab;
//kazdy stvorec na mape, bud sa bude dat cez neho prejst alebo nie



import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
public abstract class Dlazdica implements Intersects,Drawable {
	
	private double x;
	private double y;
		
	public Image textura;
	
	private double width;
	private double height;
		
	
	public boolean walkable;
	
	
	
	public boolean walkable() {
		return this.walkable;
	}
public Dlazdica(double x,double y,String texturePath) {
	this.x=x;
	this.y=y;
	this.textura=new Image(getClass().getResourceAsStream(texturePath));
	this.width=textura.getWidth();
	this.height=textura.getHeight();
}
public abstract void draw(GraphicsContext gc);

public double getX() {
	return this.x;
}
public double getY() {
	return this.y;
}
public double getWidth() {
	return this.width;
}
public double getHeight() {
	return this.height;
}

public Image getTextura() {
	
	return this.textura;
}
public boolean intersects(Intersects another) {
    return x < another.getX() + another.getWidth() && x + getWidth() > another.getX() &&
       	       y < another.getY() + another.getHeight() && y + getHeight() > another.getY();
   }
	
}
