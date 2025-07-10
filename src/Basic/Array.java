package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] num = new int[4];

        Arrays.fill(num,2);

        String [] fruits = {"apple","orange","banana","coconut"};


//        for(int i=0; i<fruits.length; i++){
//            System.out.println(fruits[i]);
//        }

        for(String fru : fruits){
            System.out.println(fru);
        }


        String [] foods= new String[5];
        System.out.println("Enter a foods: ");
        for(int i=0; i<foods.length;i++){
            String food = sc.nextLine();
            foods[i]=food;
        }


        System.out.println("search food : ");



        for(String food:foods){
            System.out.println(food);
        }




    }
}
