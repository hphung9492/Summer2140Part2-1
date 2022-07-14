package Reviews;

import java.util.Scanner;

public class MinMaxDoWhile {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers as many as you want. To stop, enter any letter.");
//        int max = input.nextInt();
//        int min = max;
        int max = 0, min = 0;
        do{
            int value = input.nextInt();
            if(value > max ){
                max  = value;
            }
            if(value < min ){
                min  = value;
            }
        }while(input.hasNextInt());
        System.out.println("The maximum number is: " + max );
        System.out.println("The minimum number is: " + min );
    }
}
