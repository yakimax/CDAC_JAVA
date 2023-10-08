package Day12.Assignment3.Corses ;
import Day12.Assignment3.* ;

public class Maincourse extends MenuItem{
    int calories ;
    public void displayItemDetails(){
        System.out.println("Appetizer Calories : " + this.calories) ;
        System.out.println("Maincourse : " + this.itemId) ;
        System.out.println("Maincourse Name : " + this.itemName) ;
        System.out.println("Maincourse Price : " + this.itemPrice) ;
    }
}
