package Day12.Assignment3.Corses ;
import Day12.Assignment3.* ;

public class Appetizers extends MenuItem{
    int calories ;
    public void displayItemDetails(){
        System.out.println("Appetizer Calories : " + this.calories) ;
        System.out.println("Appetizer : " + this.itemId) ;
        System.out.println("Appetizer Name : " + this.itemName) ;
        System.out.println("Appetizer Price : " + this.itemPrice) ;
    }
}
