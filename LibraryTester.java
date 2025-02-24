public class LibraryTester {
    public static void main(String[] args){

        BookShelf oShelf = new BookShelf('O');
        BookShelf tShelf = new BookShelf('T');
        // reminder to self: chars are notified by ''
        System.out.print(oShelf);
        System.out.print(tShelf);

        Book betrayed = new Book("The Heart of the Betrayed","Crime");
        Book stars = new Book("Our Hill of Stars","Fantasy");
        Book kind = new Book("One of a Kind","Science Fiction");
        Book roses = new Book("The Vision of Roses","Romance");

        System.out.print(betrayed);
        System.out.print(stars);
        System.out.print(kind);
        System.out.print(roses);

        oShelf.addBook(betrayed);
        oShelf.addBook(stars);
        oShelf.addBook(kind);
        oShelf.addBook(roses);

        tShelf.addBook(betrayed);
        tShelf.addBook(stars);
        tShelf.addBook(kind);
        tShelf.addBook(roses);

        System.out.print(oShelf);
        System.out.print(tShelf);
    }
}
