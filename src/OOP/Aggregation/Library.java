package OOP.Aggregation;

public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.year = year;
        this.books=books;
        this.name=name;
    }

    void displayInfo(){
        System.out.printf("The library %s will be established in %d .\n",name,year);
        System.out.println("Books Available: ");
        for(Book book:books){
            System.out.println( book.displayInfo());
        }
    }
}
