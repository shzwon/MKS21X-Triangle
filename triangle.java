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

	public double getPerimeter() {
		return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
	}

  public Point getVertex(int num) {
    switch (num) {
      case 0: return new Point(a);
      case 1: return new Point(b);
      case 2: return new Point(c);
    }
    return new Point(0.0, 0.0);
  }

  public void setVertex(int num, Point newPoint) {
    switch (num) {
      case 0: a = newPoint;
      break;
      case 1: b = newPoint;
      break;
      case 2: c = newPoint;
    }
  }

  public String toString() {
    return "Triangle: " + "A" + a.toString() + " B" + b.toString() + " C" + c.toString();
  }
}
