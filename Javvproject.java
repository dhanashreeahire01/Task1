/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javvproject;
import java.util.Random;
import java.util.Scanner;

public class Javvproject {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int remainingAttempts = attempts;
            System.out.println("I've selected a number between " + minRange + " and " + maxRange + ". You have " + attempts + " attempts to guess it.");

            while (remainingAttempts > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                    score++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }

                remainingAttempts--;
                if (remainingAttempts > 0) {
                    System.out.println("You have " + remainingAttempts + " attempts remaining.");
                }
            }

            if (remainingAttempts == 0) {
                System.out.println("You've run out of attempts. The correct number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Your final score is: " + score);
                break;
            }
        }

        scanner.close();
    }
}
        
        
        
        
    
    
