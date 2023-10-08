package Day12.Assignment3.Corses ;
import Day12.Assignment3.* ;

public class Desert extends MenuItem{
    String ingredients ;
    public void displayItemDetails(){
        System.out.println("Appetizer Calories : " + this.ingredients) ;
        System.out.println("Desert : " + this.itemId) ;
        System.out.println("Desert Name : " + this.itemName) ;
        System.out.println("Desert Price : " + this.itemPrice) ;
    }
}
