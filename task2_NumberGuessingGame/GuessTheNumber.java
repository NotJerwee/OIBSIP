package task2_NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("The range is from 1 to 100 inclusive");
        int attempts = 0;
        int maxAttempts = 10;
        int targetNumber = random.nextInt(100) + 1;
        
        while (maxAttempts > attempts) { 
            System.out.print("Guess #" + (attempts + 1) + ": Enter your guess: ");
            int guess = input.nextInt();
            attempts++; 

            if (attempts >= maxAttempts) {
                System.out.println("Game over! No more attempts.");
                System.out.println("The correct number was: " + targetNumber);
            }

            if (guess == targetNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
                break;
            } else if (guess < targetNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        input.close();
    }
}
