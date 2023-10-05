package Day9.AssignmentPrev.BookLibrary ;
import Day9.AssignmentPrev.BookLibrary.Book ;
import java.util.* ;
public class Library {
    ArrayList<Book> bookList ;
    ArrayList<Book> createInstancce(){
        if(bookList == null){
            bookList = new ArrayList<Book>();
        }
        return bookList ;
    }
    
}
