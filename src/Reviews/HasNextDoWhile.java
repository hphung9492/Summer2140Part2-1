package Reviews;

public class HasNextDoWhile {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter temperatures as double");
        int count = 0;
        double sum = 0.0;

       do{
            double temp = input.nextDouble();
            sum += temp;
            count++;
        }while(input.hasNextDouble());
        System.out.println("Average temperature is " + sum / count);
    }
}

