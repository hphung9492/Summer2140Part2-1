public class PointTester {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p);

        p.setX(100);
        p.setY(50);
        System.out.println(p);

        Point p2 = new Point(100,500);
        System.out.println(p2);

        p2.setY(1000);
        System.out.println(p2);

        System.out.println(p2.getX());

    }
}
