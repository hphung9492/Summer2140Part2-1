package Reviews;

import java.util.Scanner;

public class MinMaxWhile{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers as many as you want. To stop, enter any letter.");

        //(1)
       // int max = input.nextInt();
        //int min = max;

        //(2)
        int max = 0;
        int min = 0;
        while(input.hasNextInt()){
            int value = input.nextInt();
            if(value > max ){
                max  = value;
            }
            if(value < min ){
                min  = value;
            }
        }
        System.out.println("The maximum number is: " + max );
        System.out.println("The minimum number is: " + min );
    }
}
