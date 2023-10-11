package Day12.Assignment3 ;
import Day12.Assignment3.* ;



public class OrderManagementSystem {
    MenuItem[] menuItems ;
    MenuItem[] customerOrder ;
    void viewMenu(){
        for(int i = 0 ; i < menuItems.length ; i++){
            System.out.println(i + " : " + menuItems[i]) ;
        }
    }
    void addToOrder(){
        
    }
    void displayOrderDetails(){
         
    }
    void displaySpecialOffers(){
        System.out.println("Todays Special discount is  : " Bill.SPECIAL_OFFER_DISCOUNT + "%  On selct Items") ;
    }
}
