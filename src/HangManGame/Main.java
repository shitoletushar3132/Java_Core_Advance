package HangManGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = "pizza";
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;
        final int MAX_WRONG = 6;
        ArrayList<Character> guessedLetters = new ArrayList<>();

        // Fill wordState with underscores
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("***********************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("***********************");

        while (wrongGuesses < MAX_WRONG && wordState.contains('_')) {
            System.out.println("\nWord: " + wordStateAsString(wordState));
            System.out.println("Wrong guesses: " + wrongGuesses);
            System.out.println(getHangManArt(wrongGuesses));

            System.out.print("Guess a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);

            // Already guessed check
            if (guessedLetters.contains(guess)) {
                System.out.println("You've already guessed '" + guess + "'. Try another letter.");
                continue;
            }

            guessedLetters.add(guess);

            boolean correct = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    wordState.set(i, guess);
                    correct = true;
                }
            }

            if (!correct) {
                wrongGuesses++;
                System.out.println("Wrong guess!");
            } else {
                System.out.println("Correct!");
            }
        }

        // Final outcome
        System.out.println(getHangManArt(wrongGuesses));
        if (!wordState.contains('_')) {
            System.out.println("\n🎉 Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("\n💀 Game Over! The word was: " + word);
        }

        sc.close();
    }

    static String wordStateAsString(ArrayList<Character> wordState) {
        StringBuilder sb = new StringBuilder();
        for (char c : wordState) {
            sb.append(c).append(' ');
        }
        return sb.toString();
    }

    static String getHangManArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                    
                    
                    
                    
                    
                    """;
            case 1 -> """
                     0
                     
                     
                     
                     
                    """;
            case 2 -> """
                     0
                     |
                     
                     
                     
                    """;
            case 3 -> """
                     0
                    /|
                     
                     
                     
                    """;
            case 4 -> """
                     0
                    /|\\
                     
                     
                     
                    """;
            case 5 -> """
                     0
                    /|\\
                    / 
                     
                     
                    """;
            case 6 -> """
                     0
                    /|\\
                    / \\
                     
                     
                    """;
            default -> "";
        };
    }
}
