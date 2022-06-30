package MimirChapter6;
import java.util.Random;

public class Dice10 {
    public static void main(String[] args) {
        int[] dice = new int[10];
    //    Random rd = new Random();
        for(int i = 0; i < dice.length; i++)
        {
            dice[i] = new Random().nextInt(6) + 1;
        }
        System.out.print("dice = ");
        for(int die: dice)
        {
            System.out.print(die + " ");
        }
        System.out.println("\n");
    }
}
