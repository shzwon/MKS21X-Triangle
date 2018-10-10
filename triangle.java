public class Triangle {
	private Point a, b, c;

	public Triangle(Point p1, Point p2, Point p3) {
		a = new Point(p1);
		b = new Point(p2);
		c = new Point(p3);
	}

	public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
		a = new Point(x1, y2);
		b = new Point(x2, y2);
		c = new Point(x3, y3);
	}

	public double getPerm() {
		return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
	}

	public String toString() {
		return "Triangle: " + "A" + a + " B" + b + " C" + c;
	}
}

/*redo
public Point getVex(int n) {

}
redo
*/
