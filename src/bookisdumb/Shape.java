package bookisdumb;

public interface Shape {
	
	public double area();
	public void draw();
	public double getXPos();
	public double getYPos();
	public void move(double xLoc, double yLoc);
	public void stretchBy(double factor);
	public String toString();

}
