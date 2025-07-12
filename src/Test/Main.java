package Test;

public class Main {
    public static void main(String[] args) {
        Cat a = new Cat();
        a.name = "bob";
        int num = 24;

        System.out.println(a.name);
        Cat cat = makeUpperCase(a);
        System.out.println(a.name);
        System.out.println(cat.name);

        System.out.println("Num: "+num);
        numIncrea(num);
        System.out.println("after: "+num);
    }

    public static Cat makeUpperCase(Cat cat){
        cat.name = cat.name.toUpperCase();
        return  cat;
    }

    public static int numIncrea(int num){
        return num+1;
    }
}
