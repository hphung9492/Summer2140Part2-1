package ArraysDemo;

import java.util.Arrays;

public class ArrayDemo extends Object {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4};
       // numbers = new int[] {1,2,3,4};

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers);

        for(int e: numbers)
        {
            System.out.print(e + " ");
        }
        System.out.println();
        for(int i = 0; i < numbers.length; i++)
        {
            if(i != numbers.length - 1)
            {
                System.out.print(numbers[i] + ", ");
            }
            else{
                System.out.println(numbers[i]);
            }
        }
    }
}
