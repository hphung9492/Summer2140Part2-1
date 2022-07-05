package FizzBuzz;

public class FizzBuzzTester {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz(fb);

        FizzBuzz fb2 = new FizzBuzz(67,100);
        fb.fizzBuzz(fb2);
    }
}
