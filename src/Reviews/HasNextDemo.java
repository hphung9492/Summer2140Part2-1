package Reviews;

public class HasNextDemo {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter temperatures as double");
        int count = 0;
        double sum = 0.0;

        while(input.hasNextDouble()){
            double temp = input.nextDouble();
            sum += temp;
            count++;
        }
        double average = sum /count;
        System.out.println("Average temperature is " + average);
    }
}
