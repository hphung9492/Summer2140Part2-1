package Subtract;

public class SubtractTester {
    public static void main(String[] args) {
        Subtract sb = new Subtract();
        int s1 = sb.subtract(10,2);

        int s2 = Subtract.subtractStatic(10,2);
        System.out.println("s1 + s2 = " + (s1 + s2));
    }
}
