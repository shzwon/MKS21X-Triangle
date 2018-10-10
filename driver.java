public class driver{
  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,1);
	  Point P3 = new Point(2,1);

    System.out.println(Point.distance(P1,P2));
    System.out.println(P1.distanceTo(P2));

    Triangle tri = new Triangle(P1,P2,P3);

    System.out.println(tri);
  }
}
