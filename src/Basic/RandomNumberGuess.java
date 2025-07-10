package Basic;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = random.nextInt(1,20);
        int guessNumber;
        int attempts=0;
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number 1-20");
        do{
            System.out.println("Enter a guess: ");
            guessNumber = sc.nextInt();
            if(guessNumber < randomNumber){
                System.out.println("TOO LOW! try again");
            } else if (guessNumber > randomNumber) {
                System.out.println("TOO HIGH! try again");
            } else if (guessNumber == randomNumber) {
                System.out.println("You Won");
                break;
            }
            attempts++;
        }while (guessNumber != randomNumber && attempts <=5 );
        
    }
}
