package gsav;

public class Circle extends Shape {

	private Point a;
	private double r;

	double getPerimeter() {
		return 2 * Math.PI * r;
	}

	double getArea() {
		return Math.pow(r, 2) * Math.PI;
	}

}
