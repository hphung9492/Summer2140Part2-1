package Reviews;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

     while(true) {

         System.out.println("Enter a noun");
         String n1 = input.nextLine();

         System.out.println("Enter a adjective");
         String a1 = input.nextLine();

         System.out.println("Enter a number");
         int num1 = input.nextInt();
         input.nextLine();


         System.out.println("Enter a noun");
         String n2 = input.nextLine();

         System.out.println("Enter a plural noun");
         String pn1 = input.nextLine();

         System.out.println("Once upon a time there was a little " + n1 + " in Lawrenceville. ");
         System.out.println("One day, the " + n1 + " is wandering around a/an " + a1 + " pond.");
         System.out.println("Suddenly there were " + num1 + " mosters running toward  " + n2);
         System.out.println("So " + n1 + " was in shock because " + num1 + " mosters were chasing ");
         System.out.println("the " + n2 + " and " + pn1);

         System.out.println("The end");

         System.out.println("Do you want to play again?  Enter 1 to yes or 0 to stop");
         int answer = input.nextInt();
         input.nextLine();
         if(answer == 0 ){
             System.out.println("See you next time!!!");
             System.exit(0);
         }
         else if(answer == 1){
             System.out.println("Wonderful! Let's start the again!!!");
         }



     }

    }
}
