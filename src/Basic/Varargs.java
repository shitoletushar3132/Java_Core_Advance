package Basic;

public class Varargs {
    public static void main(String[] args) {
        /*
        * varargs = allow a method to accept a varying # of arguments
        *           makes methods more flexible, no need for overloaded methods
        *             java will pack the arguments into an array
        *             ...(ellipsis)
        * */

        add(1,23,4,2);
    }

    static void add(int... numbers){
        for(int num:numbers){
            System.out.println(num);
        }
    }
}
