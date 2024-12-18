package lab;
import javafx.scene.*;
import javafx.animation.*;
import javafx.scene.canvas.*;
import javafx.scene.image.*;

// hlavna postava
public  class Character implements Intersects,Movable,Drawable{
	
	private String name;
	private double x;
	private double y;
	private double directionX;
    private double directionY;
    private double previousX;
    private double previousY;
	public Image textura;
	public static double speed=20;
	
	
	
	
	 public double getDirectionX() { 
		 return this.directionX;
		 }
	    public double getDirectionY() { 
	    	return this.directionY; }
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	
	public Image getTextura() {
		
		return this.textura;
	}
	
	public double getWidth() {
		
		return textura.getWidth();
		
	}
	public double getHeight()
	{
		return textura.getHeight();
		
	}	
	public Character(String name,double x,double y,String imagePath) {
		this.name=name;
		this.x=x;
		this.y=y;
		this.textura =new Image(getClass().getResourceAsStream(imagePath));
	
	
}
	
	public Character(double x,double y, String imagePath) {
		//this.name=name;
		this.x=x;
		this.y=y;
		 this.textura = new Image(imagePath);
		 }
	public void move(double dX,double dY) {
		this.previousX=this.x;
        this.previousY=this.y;
		
		directionX = dX;
        directionY = dY;
        
		this.x=x+dX*speed;
		this.y=y+dY*speed;
	}
	public void revertPos() {
		this.x=previousX;
		this.y=previousY;
	}
	public void draw(GraphicsContext gc) {
		gc.drawImage(textura, x, y);
	}

	 public void stop() {
	        this.directionX = 0;
	       this.directionY = 0;
	    }
	 
	 public boolean intersects(Intersects another) {
	     return this.getX() < another.getX() + another.getWidth() && this.getX() + getWidth() > another.getX() &&
	        	       this.getY()< another.getY() + another.getHeight() && this.getY() + getHeight() > another.getY();
	    }
	 /*
	 public boolean intersects(Intersects another) {
		    return x < dlazdica.getX() + dlazdica.getWidth() && x + getWidth() > dlazdica.getX() &&
		       	       y < dlazdica.getY() + dlazdica.getHeight() && y + getHeight() > dlazdica.getY();
		   }*/
	
	
	
}
