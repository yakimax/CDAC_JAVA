package Day9.AssignmentPrev.BookLibrary ;
import java.util.* ;
import Day9.AssignmentPrev.BookLibrary.* ;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        boolean flag = true ;
        ArrayList<Book> bookList = null ;
        while(flag){
            System.out.println("Enter options  from list : ") ;
            int n = scn.nextInt() ;
            switch(n){
                case 1 :
                    System.out.println("Object created") ;
                    Library lb = new Library() ;
                    bookList = lb.createInstancce() ;
                    break ;
                case 2 :
                    Book b = new Book() ;
                    System.out.println("Enter book details :") ;
                    System.out.print("Title :") ;
                    b.title = scn.next() ;
                    scn.nextLine() ;
                    System.out.print("Author Name :") ;
                    b.author = scn.next() ;         
                    System.out.print("Price :") ;
                    scn.nextLine() ;
                    b.price = scn.nextInt() ;
                    try{
                        bookList.add(b) ;
                    }catch(Exception e){
                        System.err.println(e);
                    }
                    break ;
                case 3 :
                    System.out.println("Provide book Index : ") ;
                    int bookIndex = scn.nextInt() ;
                    System.out.print("Enter ChangedPrice : ") ;
                    int price  = scn.nextInt() ;
                    try{                   
                        bookList.get(bookIndex).changePrice(price) ;
                    }catch(Exception e){
                        System.err.println(e) ;
                    }
                    break ;
                case 4 : 
                    System.out.print("Enter Index : ") ;
                    bookIndex = scn.nextInt() ;
                    bookList.get(bookIndex).displayBookDetails() ;
                    break ;
                case 5 :
                    flag = false ;
            }
        }
    }
}
