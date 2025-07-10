package OOP.Aggregation;

public class Main {
    // Aggregation = Represents a "has-a" relationship between objects.
     //               one object contains another object as part of its structure,
    //                 but the contained object/s can exist independently/

    public static void main(String[] args) {
        Book book1=new Book("The Fellow ",23);
        Book book2 = new Book("The Two towers",232);
        Book book3 = new Book("The Return of the King",212);

        Book[] books = {book1,book2,book3};


        Library library=new Library("NYC",1991, books);

        library.displayInfo();

    }
}
