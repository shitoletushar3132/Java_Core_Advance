package Basic;

import java.util.Scanner;

public class WeightConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");


        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.452592;
            System.out.printf("The new Weight in kgs is: %.2f ",newWeight);

        } else if (choice==2) {
            System.out.println("Enter the weight in kgs: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new Weight in lbs is: %.2f ",newWeight);

        }else{
            System.out.println("Enter a Valid Choice");
        }

        sc.close();

    }
}
