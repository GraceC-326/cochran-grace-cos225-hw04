import java.util.ArrayList;
/*
 Grace Cochran
 COS 225: Homework 4
 */

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> booksList;

    public BookShelf(char shelfLetter){
        firstLetter = shelfLetter;
        booksList = new ArrayList<>();
        for (int i=0; i < 8; i++){
            booksList.add(null);
        }
    // Note: ask what dufour means by adding getters and setters here
    }

}
