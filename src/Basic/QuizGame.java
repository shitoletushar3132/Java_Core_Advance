package Basic;

import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        String [] questions = {"what is the maiin function of a router?","which part of the computer is considered brain?","what year was facebook launched?","who is known as the father of computer","what was the first programming language?"};

        String[][] options = {
                {"1.storing files","2.encryping data","3.Directing internet traffic","4.Managing passwords"},
                {"1.cpu","2.hdd","3.RAM","4.GPU"},
                { "1.2000","2.2004","3.2008","4.2006"},
                {"1.Steve Jobs","2.Bill Gates","3.Alan Turing","4.Charles babbage"},
                {"1.COBOL","2.C","3.Fortran","4.Assembly"}
        };

        int[] answers = {3,1,2,4,3};
        int score =0;
        int guess;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Quiz Game");

        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);

            for(String option:options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess == answers[i]){
                score+=1;
                System.out.println("CORRECT!");
                System.out.println("**************");
            }else{
                System.out.println("WRONG");
                System.out.println("**************");

            }
        }

        System.out.println("Your Score is : "+score);

    }
}
