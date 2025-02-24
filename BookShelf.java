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
    // im p sure this works
    }

    // Adds a book to a shelf if the book's title matches with the
    // shelf's assigned letter. If it doesnt match, the book isn't added.
    public void addBook(Book bookAdd){
        // may have looked up help to find charAt exists hope that's cool 
        char firstChar = bookAdd.bookTitle.charAt(0);
        if (firstLetter == firstChar){
            for (int i=0; i < booksList.size(); i++){
                if (booksList.get(i) == null){
                    booksList.set(i, bookAdd);
                    return;
                }
            }  
        }      
        return;
    }

}
