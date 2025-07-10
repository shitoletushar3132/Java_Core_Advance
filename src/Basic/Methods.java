package Basic;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total=0;

        System.out.println("Enter the # of dice to roll: ");
        numOfDice = sc.nextInt();

        if(numOfDice>0){

            for(int i=0; i<numOfDice; i++){
                int roll = random.nextInt(1,7);
                total+=roll;
                printDie(roll);
                System.out.println("You rolled :"+ roll);
            }
            System.out.println("Total : "+total);
        }else{
            System.out.println("# of dice must be greater that 0");
        }
        sc.close();
    }

    static void printDie(int roll){
        String dice1 = """ 
                ------------
                |           |
                |     ●     |
                |           |
                -------------
                """;
        String dice2 = """ 
                ------------
                |           |
                |   ●  ●    |
                |           |
                -------------
                """;
        String dice3 = """ 
                ------------
                | ●         |
                |     ●     |
                |        ●  |
                -------------
                """;
        String dice4 = """ 
                ------------
                | ●     ●   |
                |           |
                | ●     ●   |
                -------------
                """;
        String dice5 = """ 
                ------------
                | ●       ● |
                |     ●     |
                | ●       ● |
                -------------
                """;
        String dice6 = """ 
                ------------
                | ●     ●   |
                | ●     ●   |
                | ●     ●   |
                -------------
                """;

        switch (roll){
            case 1:
                System.out.println(dice1);
                break;
            case 2:
                System.out.println(dice2);
                break;
            case 3:
                System.out.println(dice3);
                break;
            case 4:
                System.out.println(dice4);
                break;
            case 5:
                System.out.println(dice5);
                break;
            case 6:
                System.out.println(dice6);
                break;
        }
    }
}
