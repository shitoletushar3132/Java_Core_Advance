package Basic;

public class StringMethods {
    public static void main(String[] args) {
        String name = "bro code";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");

        String nameU = name.toUpperCase();
        String nameL = name.toLowerCase();

        String nameRemoveWhite = name.trim();

        String nameReplaceO = name.replace('o','a');

        boolean nameIsEmpty = name.isEmpty();

        boolean nameContainsSpace = name.contains("o");

        boolean checkIsEqual = name.equals("bro code");

        System.out.println(checkIsEqual);
    }
}
