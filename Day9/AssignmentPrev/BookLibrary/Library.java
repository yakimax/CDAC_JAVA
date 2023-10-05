package Day9.AssignmentPrev.BookLibrary ;

public class Library {
    String title ;
    String author ;
    int price ;
    Library(){
        this.title = "" ;
        this.author = "" ;
        this.price = 0 ;
    }
    Library(String title,String author){
        this() ;
        this.title = title ;
        this.author = author ;
    }
    Library(String title,String author ,int price){
        this(title,author) ;
        this.price = price ; 
    }
    void displayBookDetails(){        
        System.out.println(this.title) ;
        System.out.println(this.author) ;
        System.out.println(this.price) ;
    }
    void changePrice(int changedPrice){
        this.price = changedPrice ;
    }
}
