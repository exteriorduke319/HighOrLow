import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 10) + 1;
        int userGuess = 0;
        boolean numCheck = false;

        System.out.println("Welcome! Let's play a game.");
        System.out.println("Try to guess my number!");

        do {
            System.out.print("Enter a number [1-10]: ");
            if (scan.hasNextInt()){
                userGuess = scan.nextInt();
                if (userGuess >= 1 && userGuess <= 10) {
                    numCheck = true;
                } else {
                    scan.nextLine();
                    System.out.println("Error: your guess is invalid.  Please enter an integer 1-10.");
                }
            } else {
                scan.nextLine();
                System.out.println("Error: your guess is invalid.  Please enter an integer 1-10.");
            }
        } while (!numCheck);

        System.out.println("My guess was " + randomNum);
        if (userGuess < randomNum) {
            System.out.println("Your guess was too low.");
        } else if (userGuess > randomNum) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("You got it right!");
        }
    }
}