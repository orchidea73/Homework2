package gsav;

public class Triangular extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public double getDistance(Point p, Point q) {
		double distance = Math.sqrt(Math.pow(p.x - q.x, 2) + Math.pow(p.y - q.y, 2));
		return distance;
	}

	double getPerimeter() {
		double p = getDistance(a, b) + getDistance(b, c) + getDistance(c, a);
		return p;
	}

	double getArea() {
		double halfP = getPerimeter() / 2;
		double ab = getDistance(a, b);
		double bc = getDistance(b, c);
		double ca = getDistance(c, a);
//		double area= Math.sqrt(halfP*(halfP-ab)*(halfP-bc)*(halfP-ca));
		return Math.sqrt(halfP * (halfP - ab) * (halfP - bc) * (halfP - ca));

	}

}
