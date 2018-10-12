class Point {
private double x,y;

public Point(double x, double y){
    x=x;
    y=y;
  }

  public Point(Point p) {
    x = p.x;
    y = p.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTo(Point new) {
    return Math.sqrt((new.x - x)*(new.x - x)+(new.y - y)*(new.y - y));
  }

  public static double distance(Point a, Point b) {
    return a.distanceTo(b);
  }

  public String toString() {
    return ("("+x+", "+y+")");
  }
}
