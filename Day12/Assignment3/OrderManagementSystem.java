package Day12.Assignment3 ;
import Day12.Assignment3.* ;

public class OrderManagementSystem {
    MenuItem[] menuItems ;
    MenuItem[] customerOrder ;
    void viewMenu(){

    }
    void addToOrder(){
        
    }
    void displayOrderDetails(){
        for( int i = 0 ; i < customerOrder.length ; i++ ){
            System.out.println(i + ". " + customerOrder[i]) ;
        }
    }
    void displaySpecialOffers(){
        System.out.println("Todays Special discount is  : " Bill.SPECIAL_OFFER_DISCOUNT + "%  On selct Items") ;
    }
}
