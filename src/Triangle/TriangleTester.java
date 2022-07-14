package Triangle;
import java.util.Scanner;
public class TriangleTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base and height");
        double base = input.nextDouble();
        double height = input.nextDouble();

        Triangle t1 = new Triangle();
        t1.setBase(base);
        t1.setHeight(height);
        double area = t1.getArea();
        System.out.println(area);

        Triangle t2 = new Triangle(5,7);
        System.out.println(t2.getArea());
    }
}
