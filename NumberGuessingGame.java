import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        int numGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int usrGuess = 0;
        int attempts = 0;
         System.out.println("NUMBER GUESSING GAME");
         System.out.println("Guess a number between 1 and 100:");
        while (usrGuess != numGuess) 
        {
            System.out.println("Enter the number:");
            usrGuess = scanner.nextInt();
            attempts++;
            if (usrGuess < numGuess)
            {
                System.out.println("Guess is lower! Try again.");
            } 
            else if (usrGuess > numGuess) {
                System.out.println("Guess is higher! Try again.");
            } 
            else
            {
                System.out.println("Congratulations! You've win the game.");
                System.out.println("In " + attempts + " attempts.");
            }
        }
        scanner.close();
    }
}