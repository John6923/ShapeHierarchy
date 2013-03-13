package bookisdumb;

public class Rect implements Shape{
	private double xPos, yPos;
	private double width, height;
	
	public Rect(){
		this(0,0,1,1);
	}
	
	public Rect(double xLoc, double yLoc, double w, double h){
	    xPos = xLoc;
	    yPos = yLoc;
	    height = h;
	    width = w;
	}

	public double area(){
		return height * width;
	}

	public void draw(){
	}

	public double getXPos(){
	    return xPos;
	}

	public double getYPos(){
	    return yPos;
	}

	public void move(double xLoc, double yLoc){
		xPos = xLoc;
		yPos = yLoc;
	}

	public void stretchBy(double factor){
	    height *= factor;
	    width *= factor;
	}
}
