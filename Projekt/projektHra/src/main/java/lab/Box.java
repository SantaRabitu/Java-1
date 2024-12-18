package lab;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
//box ktory sa bude tiahnut na cielovu dlazdicu
public class Box implements Intersects,Movable{

	private double x;
	private double y;
	
	private  double size=30;
	
	public double getX() {
		return this.x;
		
	}
	public double getY() {
		return this.y;
	}
	
	public double getSize() {
		return this.size;
	}
	
	public double getWidth() {
		return this.getSize();
	}
	public double getHeight() {
		return this.getSize();
	}
	public Box(double sX,double sY,double s) {
		
		this.x=sX;
		this.y=sY;
		this.size=s;
	
		
	}
	
	public void move(double dX,double dY) {
		this.x=x+dX*10;
		this.y=y+dY*10;
		
		
	}
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.SIENNA);
		gc.fillRect(x,y,size,size);
		
		
	}
	
	 public boolean intersects(Intersects another) {
	        return x < another.getX() + another.getWidth() && x + size > another.getX() &&
	               y < another.getY() + another.getHeight() && y + size > another.getY();
	    }
	
}
