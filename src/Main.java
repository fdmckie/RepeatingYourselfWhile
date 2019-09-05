import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int secretNumber, secretNumber2, guess = 0;//guess is initialized to 0

        secretNumber = 123;
        secretNumber2 = 5;


        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = input.nextInt();

        while ( guess != secretNumber && guess != secretNumber2 )
        {
            System.out.println("\nYou are wrong. Try again.");
            System.out.println("Enter the number: ");
            guess = input.nextInt();
        }

        System.out.println("You are correct. You win a prize!");
        input.close();
    }
}
