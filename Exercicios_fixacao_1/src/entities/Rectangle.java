package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2.0 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(3, 2) + Math.pow(4, 2));
	}
}
