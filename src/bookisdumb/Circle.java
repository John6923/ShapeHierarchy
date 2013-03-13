package bookisdumb;

public class Circle implements Shape{

	private double xPos, yPos;
	private double radius;
	
	public Circle(){
		this(0,0,1);
	}
	
	public Circle(double xLoc, double yLoc, double r){
		xPos = xLoc;
		yPos = yLoc;
		radius = r;
	}
	
	public double area(){
		return Math.PI * radius * radius;
	}
	
	public void draw(){
		
	}
	
	public double getXPos(){
		return xPos;
	}
	
	public double getYPos(){
		return yPos;
	}

	@Override
	public void move(double xLoc, double yLoc) {
		xPos = xLoc;
		yPos = yLoc;
		
	}

	@Override
	public void stretchBy(double factor) {
		radius *= factor;
		
	}
	
	
	
	

}
