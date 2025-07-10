package ExceptionsHandling;

import java.util.Scanner;

public class CustomException
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age");
        int age = sc.nextInt();

        try{
            if(age > 100){
                throw new MyException("age should less that 100");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

}

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
