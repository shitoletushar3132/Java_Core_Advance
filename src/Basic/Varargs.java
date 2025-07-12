package Basic;

public class Varargs {
    public static void main(String[] args) {
        /*
         * varargs = allow a method to accept a varying # of arguments
         *           makes methods more flexible, no need for overloaded methods
         *             java will pack the arguments into an array
         *             ...(ellipsis)
         * */

        add(1, 23, 4, 2);

        String a = "abc";
        

    }

    static void add(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    static String Upper(String a){
        return a.toUpperCase();
    }

    static void add(int a) {
        System.out.println(a);
    }
}
