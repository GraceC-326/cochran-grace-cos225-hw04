public class Book {
    public String bookTitle;
    public String bookGenre;

    public Book(String title, String genre){
        bookTitle = title;
        bookGenre = genre;
    }

    @Override
    public String toString(){
    return bookTitle;
    }
}