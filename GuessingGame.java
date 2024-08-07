import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int low = 1;
        int high = 100;
        int maxAttempts = 10;
        int totalAttempts = 0;
        int roundsWon = 0;
        
        while (true) {
            int numberToGuess = generateNumber(random, low, high);
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("Guess the number between " + low + " and " + high + ".");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + numberToGuess + ".");
            } else {
                roundsWon++;
                totalAttempts += attempts;
                System.out.println("Rounds won: " + roundsWon + ", Total attempts: " + totalAttempts);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        
        System.out.println("Game Over! You won " + roundsWon + " rounds with a total of " + totalAttempts + " attempts.");
        scanner.close();
    }
    
    private static int generateNumber(Random random, int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }
}
