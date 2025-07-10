package Basic;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int number;
        number = random.nextInt(1,5);
        double numberD;
        numberD = random.nextDouble(0.23,0.30);
        boolean toss = random.nextBoolean();
//        System.out.println(toss);
//        System.out.println(numberD);
//        System.out.println(number);

        double result;
        result=Math.abs(-4.4); //4.4
        result = Math.pow(3,2); // 9
        result = Math.sqrt(9);//3
        result = Math.random();// gives random value from 0.0 to 0.1;

        result = Math.round(232.83);// convert 232.83-> 233 and 232.12-> 232

        result = Math.ceil(3.01); // when any decimal is more that that number it gets a next number 3.01-> 4

        result=Math.floor(3.99);//3

        result = Math.max(10,20);//20
        result=Math.min(10,20);


        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter='S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name start with a %c\n",firstLetter);

        System.out.printf("you are %d years old\n",age);

        System.out.printf("you are %.2f inches tall\n",height);
        System.out.printf("Employed: %b\n", isEmployed);
    }
}