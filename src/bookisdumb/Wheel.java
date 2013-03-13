package bookisdumb;

public class Wheel extends Circle {
	private int spokes;
	
	public Wheel(){
		this(0,0,1,0);
	}
	
	public Wheel(double xLoc, double yLoc, double r, int s){
		super(xLoc,yLoc,r);
		spokes = s;
	}
	
	public void draw(){
		
	}

}
