package Wrapper;

public class Wrapper {
    public static void main(String[] args) {
        /**
         * In Java, a wrapper class is an object representation of a primitive data type
         * Wrapper.Wrapper classes allow primitives to behave like objects and are essential when:
             * Using collections ( Data structures in collection framework, such as ArrayList and vector,
                only store objects not primitive types
             * Doing conversions
             * Calling utility methods
             * Working with generics
         */


        // Autoboxing & unboxing
        /*
        Autoboxing
        the automatic conversion of primitive types to the object of their corresponding
        wrapper classes is known as autoboxing. For e.g- conversion of int ot Integer, long to Long
        double to Double, etc
         */
        int a = 13;
        Integer obj= a;// autoboxing

        System.out.println(obj);
        /*
        Unboxing
        It is just the reverse process of autoboxing. Automatically converting an object of wrapper class
        to its corresponding primitive type is known as unboxing. For e.g Conversion of Integer to int, Long to long etc
        */

        int b = obj; // unboxing




    }
}
